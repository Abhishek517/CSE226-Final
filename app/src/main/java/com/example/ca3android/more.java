package com.example.ca3android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.InputDevice;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class more extends AppCompatActivity {
   EditText phone,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        phone=(EditText)findViewById(R.id.phoneno);
        message=(EditText)findViewById(R.id.melt);
    }

    public void btsend(View view) {
        int permissioncheck= ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        if(permissioncheck== PackageManager.PERMISSION_GRANTED){
            MyMessage();
        }
        else
        {

            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},0);
        }
    }

    private void MyMessage() {
        String phonenu=phone.getText().toString().trim();
        String me=message.getText().toString().trim();
        if (!phone.getText().toString().equals("")||!message.getText().toString().equals("")){
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(phonenu,null,me,null,null);
        Toast.makeText(this,"massage sent",Toast.LENGTH_SHORT).show();}
        else{
            Toast.makeText(this,"please enter phone and message",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 0:
                if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                MyMessage();
            }
                else

            Toast.makeText(this, "you dont have required permission", Toast.LENGTH_LONG).show();

        }
    }
}