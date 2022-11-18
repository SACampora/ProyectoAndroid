package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;

import com.google.android.material.snackbar.Snackbar;


public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Snackbar snackbar=Snackbar.make(findViewById(R.id.rootLayout),"Un poco de nosotros",Snackbar.LENGTH_LONG);
        snackbar.show();


    }



}