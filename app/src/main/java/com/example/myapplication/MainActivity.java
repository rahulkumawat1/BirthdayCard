package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void createCard(View view){
        EditText edittext = findViewById(R.id.editTextTextPersonName);
        String name = edittext.getText().toString();
        Intent intent = new Intent(this, BirthdayGreeting.class);
        intent.putExtra(BirthdayGreeting.EXTRA_MESSAGE, name);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}