package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> onclick());
    }

    private void onclick(){
        if (editText.getText().length() != 6){
            Toast.makeText(this, "User Code = 6", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Good code", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), NewActivity.class);
            startActivity(intent);
        }
    }
}