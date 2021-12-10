package com.example.ca3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("LOGIN");
    }

    public void btnsign(View view) {
        startActivity(new Intent(getApplicationContext(),Signup.class));
    }

    public void btn6(View view) {
        startActivity(new Intent(getApplicationContext(),Firstpage.class));
    }
}