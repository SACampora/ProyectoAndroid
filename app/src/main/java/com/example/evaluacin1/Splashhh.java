package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


public class Splashhh extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashhh);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {

                //Intent intent = new Intent(Splash.this,MainActivity.class);
                Intent intent = new Intent(Splashhh.this, Presentacion.class);
                startActivity(intent);
                finish();

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);

    }
}