package com.example.ca3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("Signup form");





    }

    public void btnlog(View view) {
        Toast.makeText(Signup.this,"Data saved",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),Login.class));
    }
}