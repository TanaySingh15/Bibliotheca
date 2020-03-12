package com.example.bibliotheca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Auth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth);
    }

    public void login(View view)
    {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    public void signup(View view)
    {
        startActivity(new Intent(getApplicationContext(), SignUp.class));
    }
}