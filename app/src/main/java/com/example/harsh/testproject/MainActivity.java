package com.example.harsh.testproject;

import android.app.Fragment;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentNext hh =new FragmentNext ();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.linearLL, hh);
        //fragmentTransaction.add(R.id.linearLL, hh);
        //fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}