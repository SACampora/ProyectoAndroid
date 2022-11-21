package com.example.evaluacin1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.evaluacin1.ui.login.Login;

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
                Intent intent = new Intent(Splashhh.this, Login.class);
                startActivity(intent);
                finish();

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 3000);

    }
}