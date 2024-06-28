package com.example.entrylog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogEntry extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_entry);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.adno);
        e3=(EditText)findViewById(R.id.sno);
        e4=(EditText)findViewById(R.id.dno);
        b1=(AppCompatButton)findViewById(R.id.add);
        b2=(AppCompatButton)findViewById(R.id.logout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getname=e1.getText().toString();
                String getadno=e2.getText().toString();
                String getsno=e3.getText().toString();
                String getdno=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getname+" "+getadno+" "+getsno+" "+getdno,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });



    }
}