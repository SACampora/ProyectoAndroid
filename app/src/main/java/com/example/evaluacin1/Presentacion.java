package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;


public class Presentacion extends AppCompatActivity {

     private Button bienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        bienvenido=(Button)findViewById(R.id.boton1);


        bienvenido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View h){

                Intent e;
                e = new Intent( Presentacion.this, MainActivity.class);
                startActivity(e);



            }





        } );

    }



}