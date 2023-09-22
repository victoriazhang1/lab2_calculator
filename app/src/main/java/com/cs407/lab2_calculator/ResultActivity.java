package com.cs407.lab2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        textView=(TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        int result = intent.getIntExtra("message", 0);
        textView.setText("Result: " + result);
    }
}