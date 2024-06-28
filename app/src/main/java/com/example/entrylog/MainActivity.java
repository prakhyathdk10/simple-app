package com.example.entrylog;

import android.annotation.SuppressLint;
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

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1,e2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.uname);
        e2=(EditText)findViewById(R.id.pass);
        b1=(AppCompatButton)findViewById(R.id.logbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getUsername=e1.getText().toString();
                String getPassword=e2.getText().toString();
                Toast.makeText(getApplicationContext(),getUsername+" "+getPassword,Toast.LENGTH_LONG).show();

            }
        });


    }
}