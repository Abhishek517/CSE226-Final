package com.example.ca3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Firstpage extends AppCompatActivity implements Firstpag {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        getSupportActionBar().setTitle("Add");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.prof){
            Intent intent=new Intent(Firstpage.this,profile.class);
            startActivity(intent);
            return true;
        }
        if(id==R.id.per){
            Intent intent=new Intent(Firstpage.this,permission.class);
            startActivity(intent);

            return true;
        }
        if(id==R.id.log){
            Intent intent=new Intent(Firstpage.this,Login.class);
            startActivity(intent);
            return true;
        }
        return true;
    }

    public void btn5(View view) {
        startActivity(new Intent(getApplicationContext(),Listsub.class));
    }

    public void btn8(View view) {
        startActivity(new Intent(getApplicationContext(),more.class));
    }
}