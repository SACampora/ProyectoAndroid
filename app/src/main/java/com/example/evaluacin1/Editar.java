package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Editar extends AppCompatActivity{

    private EditText ed_nombre,ed_apellido,ed_edad,ed_id;
    private Button b_editar,b_eliminar,b_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ed_nombre = findViewById(R.id.et_nombre);
        ed_apellido = findViewById(R.id.et_apellido);
        ed_edad = findViewById(R.id.et_edad);
        ed_id = findViewById(R.id.id);

        b_editar = findViewById(R.id.btn_editar);
        b_eliminar = findViewById(R.id.btn_eliminar);
        b_volver = findViewById(R.id.btn_volver);

        Intent i = getIntent();

        String et_id = i.getStringExtra("id").toString();
        String et_nombre = i.getStringExtra("nombre").toString();
        String et_apellido = i.getStringExtra("apellido").toString();
        String et_edad = i.getStringExtra("edad").toString();

        ed_id.setText(et_id);
        ed_nombre.setText(et_nombre);
        ed_apellido.setText(et_apellido);
        ed_edad.setText(et_edad);

        b_editar.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                editar();
            }
        });

        b_eliminar.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                eliminar();
            }
        });

        b_volver.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent i = new Intent(getApplicationContext(), Leer.class);
                startActivity(i);
            }
        });
    }

    public void eliminar()
    {
        try
        {
            String id = ed_id.getText().toString();

            SQLiteDatabase db = openOrCreateDatabase("BD_EJEMPLO", Context.MODE_PRIVATE,null);


            String sql = "delete from persona where id = ?";
            SQLiteStatement statement = db.compileStatement(sql);

            statement.bindString(1,id);
            statement.execute();
            Toast.makeText(this,"Datos eliminados de la base de datos.",Toast.LENGTH_LONG).show();

            ed_nombre.setText("");
            ed_apellido.setText("");
            ed_edad.setText("");
            ed_nombre.requestFocus();

        }
        catch (Exception ex)
        {
            Toast.makeText(this,"Error no se pudieron guardar los datos.",Toast.LENGTH_LONG).show();
        }
    }
    public void editar()
    {
        try
        {
            String nombre = ed_nombre.getText().toString();
            String apellido = ed_apellido.getText().toString();
            String edad = ed_edad.getText().toString();
            String id = ed_id.getText().toString();

            SQLiteDatabase db = openOrCreateDatabase("BD_EJEMPLO",Context.MODE_PRIVATE,null);

            String sql = "update persona set nombre = ?,apellido=?,edad=? where id= ?";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1,nombre);
            statement.bindString(2,apellido);
            statement.bindString(3,edad);
            statement.bindString(4,id);
            statement.execute();
            Toast.makeText(this,"Datos actualizados satisfactoriamente en la base de datos.",Toast.LENGTH_LONG).show();

            ed_nombre.setText("");
            ed_apellido.setText("");
            ed_edad.setText("");
            ed_nombre.requestFocus();
        }
        catch (Exception ex)
        {
            Toast.makeText(this,"Error no se pudieron guardar los datos.",Toast.LENGTH_LONG).show();
        }
    }
}