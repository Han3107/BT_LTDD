package com.example.mypayapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    Button btnLogin, btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnCreate = findViewById(R.id.btnCreate);


        btnCreate.setOnClickListener(v -> {
            Intent i = new Intent(WelcomeActivity.this, CreateAccountActivity.class);
            startActivity(i);
        });


    }
}
