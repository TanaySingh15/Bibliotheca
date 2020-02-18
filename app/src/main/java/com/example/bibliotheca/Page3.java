package com.example.bibliotheca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void login(View view)
    {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    public void signup(View view)
    {
        startActivity(new Intent(getApplicationContext(),Page5.class));
    }
}