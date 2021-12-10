package com.example.ca3android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Listsub extends AppCompatActivity {
    ListView tres;
    String[] country={"Int-217","CSE-224","CS-322","MTH-404","ufdchgs","CSE-211","CSE-210","CSE332","MTH-122","PEV-107"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listsub);
        tres=findViewById(R.id.lidt);
        ArrayAdapter<String> country1=new ArrayAdapter<String>(Listsub.this, android.R.layout.simple_list_item_1,country);
        tres.setAdapter(country1);
        tres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Listsub.this,"Subject Downloaded : "+country[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}