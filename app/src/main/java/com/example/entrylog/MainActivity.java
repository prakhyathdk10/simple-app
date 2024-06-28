package com.example.entrylog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
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
        SharedPreferences prefer=getSharedPreferences("logentry",MODE_PRIVATE);
        String username=prefer.getString("user",null);
        if(username!=null)
        {
            Intent i= new Intent(getApplicationContext(), LogEntry.class);
            startActivity(i);
        }

        e1=(EditText)findViewById(R.id.uname);
        e2=(EditText)findViewById(R.id.pass);
        b1=(AppCompatButton)findViewById(R.id.logbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getUsername=e1.getText().toString();
                String getPassword=e2.getText().toString();
               if(getUsername.equals("admin")&&getPassword.equals("12345"))
               {
                   SharedPreferences prefer=getSharedPreferences("logentry",MODE_PRIVATE);
                   SharedPreferences.Editor editor=prefer.edit();
                   editor.putString("user","admin");
                   editor.apply();
                   Intent i= new Intent(getApplicationContext(), LogEntry.class);
                   startActivity(i);
               }
               else
               {
                   Toast.makeText(getApplicationContext(),"INVALID USERNAME OR PASSWORD",Toast.LENGTH_LONG).show();
               }

            }
        });


    }
}