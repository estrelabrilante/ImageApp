package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        int position = i.getIntExtra("position",0);

        FragmentManager fragmentManager1 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();

        SecondFragment secondFragment = new SecondFragment();
   // send data from activity to fragment by bundle method
        Bundle bundle = new Bundle();
        bundle.putInt("position",position);
        secondFragment.setArguments(bundle);
        fragmentTransaction1.add(R.id.frameSecond, secondFragment);
        fragmentTransaction1.commit();
    }
}