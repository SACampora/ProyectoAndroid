package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Leer extends AppCompatActivity {
    private ListView lst1;
    private ArrayList<String> arreglo = new ArrayList<String>();
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        try{
            SQLiteDatabase db = openOrCreateDatabase("BD_EJEMPLO", Context.MODE_PRIVATE,null);
            lst1 = findViewById(R.id.lst1);
            final Cursor c = db.rawQuery("select * from persona",null);
            int id = c.getColumnIndex("id");
            int nombre = c.getColumnIndex("nombre");
            int apellido = c.getColumnIndex("apellido");
            int edad = c.getColumnIndex("edad");
            arreglo.clear();

            arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arreglo);

            lst1.setAdapter(arrayAdapter);

            final  ArrayList<Persona> lista = new ArrayList<Persona>();


            if(c.moveToFirst())
            {
                do{
                    Persona persona = new Persona();
                    persona.id = c.getString(id);
                    persona.nombre = c.getString(nombre);
                    persona.apellido = c.getString(apellido);
                    persona.edad = c.getString(edad);
                    lista.add(persona);

                    arreglo.add(c.getString(id) + " \t " + c.getString(nombre) + " \t "  + c.getString(apellido) + " \t "  + c.getString(edad) );

                } while(c.moveToNext());
                arrayAdapter.notifyDataSetChanged();
                lst1.invalidateViews();
            }

            lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, android.view.View view, int position, long l) {
                    Persona persona = lista.get(position);
                    Intent i = new Intent(getApplicationContext(), Editar.class);
                    i.putExtra("id",persona.id);
                    i.putExtra("nombre",persona.nombre);
                    i.putExtra("apellido",persona.apellido);
                    i.putExtra("edad",persona.edad);
                    startActivity(i);
                }
            });
        }
        catch (Exception e){
            Toast.makeText(this, "Ha ocurrido un error, intentalo nuevamente.", Toast.LENGTH_SHORT).show();
        }

    }
}