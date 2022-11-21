package com.example.evaluacin1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.snackbar.Snackbar;


public class Carrusel extends AppCompatActivity {

    ViewFlipper flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrusel);
        Snackbar snackbar=Snackbar.make(findViewById(R.id.rootLayout),"Acá podrás ver muchas obras de arte, solo espera no te salgas!",Snackbar.LENGTH_LONG);
        snackbar.show();


        int images [] ={R.drawable.david, R.drawable.dali,R.drawable.frida,R.drawable.mona};
        flipper = findViewById(R.id.flipper);
        for (int image: images){
        flipperImages(image);

        }
    }

    //Metodo para el visor

    public void flipperImages(int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        //flipper.setAnimation(this, android.R.anim.slide_out_right);
        flipper.setOutAnimation(this, android.R.anim.slide_in_left);



    }


}