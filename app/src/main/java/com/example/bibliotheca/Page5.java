package com.example.bibliotheca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Page5 extends AppCompatActivity {

    EditText n,e,p;
    String email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        n=findViewById(R.id.Name);
        e=findViewById(R.id.email);
        p=findViewById(R.id.password);
        email=e.getText().toString();
        pass=p.getText().toString();

    }

    public void create(View view)
    {
        startActivity(new Intent(getApplicationContext(),Page6.class));
    }

    public void back(View view)
    {
        startActivity(new Intent(getApplicationContext(),Page2.class));
    }
}
