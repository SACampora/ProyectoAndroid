package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    /**
     *Botón de entrar
     */
    Button entrar;
    Button historia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrar=(Button)findViewById(R.id.boton);
        historia=(Button)findViewById(R.id.boton2);

        entrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent i = new Intent( MainActivity.this, Carrusel.class);
                startActivity(i);

            }


        } );

        historia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View g){

                Intent a = new Intent( MainActivity.this, Info.class);
                startActivity(a);

            }




        } );

    }


   public void Entraste(View view) {
        Toast.makeText(this, "entraste", Toast.LENGTH_SHORT).show();
    }
    }