package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    /**
     *Botón de entrar
     */
    private Button entrar;
    private Button historia;
    private Button ubicacion;
    private Button opiniones;
    private Button loginn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrar=(Button)findViewById(R.id.boton);
        historia=(Button)findViewById(R.id.boton2);
        ubicacion=(Button)findViewById(R.id.boton3);
        opiniones=(Button)findViewById(R.id.boton4);
        loginn=(Button)findViewById(R.id.boton6);


        Snackbar snackbar=Snackbar.make(findViewById(R.id.rootLayout),"Hola te esperabamos",Snackbar.LENGTH_LONG);
        snackbar.show();

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


        ubicacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View b){

                Intent m = new Intent( MainActivity.this, Mapa.class);
                startActivity(m);


            }




        } );



        opiniones.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View sq){

                Intent q = new Intent( MainActivity.this, Sqlite.class);
                startActivity(q);


            }



        });


        loginn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View sq){

                Intent q = new Intent( MainActivity.this, LoginActivity2.class);
                startActivity(q);


            }



        });







    }


                    //public void Entraste(View view) {
                        //Toast.makeText(this, "entraste", Toast.LENGTH_SHORT).show();
                 //}
    }