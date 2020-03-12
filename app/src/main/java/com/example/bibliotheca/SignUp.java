package com.example.bibliotheca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText n,e,p;
    String email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        n=findViewById(R.id.Name);
        e=findViewById(R.id.email);
        p=findViewById(R.id.password);
        email=e.getText().toString();
        pass=p.getText().toString();

    }

    public void create(View view)
    {
        startActivity(new Intent(getApplicationContext(), OTP.class));
    }

    public void back(View view)
    {
        startActivity(new Intent(getApplicationContext(),Page2.class));
    }
}
