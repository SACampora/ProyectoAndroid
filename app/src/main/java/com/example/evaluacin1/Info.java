package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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