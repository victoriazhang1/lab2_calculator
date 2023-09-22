package com.cs407.lab2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    public void multiply(View view){
        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
        boolean num1_isdigit = TextUtils.isDigitsOnly(num1.getText());
        boolean num2_isdigit = TextUtils.isDigitsOnly(num2.getText());
        if(num1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 1 is empty", Toast.LENGTH_LONG).show();
        } else if(num2.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 2 is empty", Toast.LENGTH_LONG).show();
        } else if(num1_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 1 must be an integer", Toast.LENGTH_LONG).show();
        } else if(num2_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 2 must be an integer", Toast.LENGTH_LONG).show();
        } else {
            goToActivity(Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString()));
        }
    }

    public void subtract(View view){
        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
        boolean num1_isdigit = TextUtils.isDigitsOnly(num1.getText());
        boolean num2_isdigit = TextUtils.isDigitsOnly(num2.getText());
        if(num1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 1 is empty", Toast.LENGTH_LONG).show();
        } else if(num2.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 2 is empty", Toast.LENGTH_LONG).show();
        } else if(num1_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 1 must be an integer", Toast.LENGTH_LONG).show();
        } else if(num2_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 2 must be an integer", Toast.LENGTH_LONG).show();
        } else {
            goToActivity(Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString()));
        }
    }

    public void add(View view){
        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
        boolean num1_isdigit = TextUtils.isDigitsOnly(num1.getText());
        boolean num2_isdigit = TextUtils.isDigitsOnly(num2.getText());
        if(num1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 1 is empty", Toast.LENGTH_LONG).show();
        } else if(num2.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 2 is empty", Toast.LENGTH_LONG).show();
        } else if(num1_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 1 must be an integer", Toast.LENGTH_LONG).show();
        } else if(num2_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 2 must be an integer", Toast.LENGTH_LONG).show();
        } else {
            goToActivity(Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString()));
        }
    }

    public void divide(View view){
        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
        boolean num1_isdigit = TextUtils.isDigitsOnly(num1.getText());
        boolean num2_isdigit = TextUtils.isDigitsOnly(num2.getText());
        if(num1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 1 is empty", Toast.LENGTH_LONG).show();
        } else if(num2.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Error: Num 2 is empty", Toast.LENGTH_LONG).show();
        }else if(Integer.parseInt(num1.getText().toString()) == 0 || Integer.parseInt(num2.getText().toString()) ==0) {
            Toast.makeText(MainActivity.this, "Error: Cannot divide by 0", Toast.LENGTH_LONG).show();
        } else if(num1_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 1 must be an integer", Toast.LENGTH_LONG).show();
        } else if(num2_isdigit == false){
            Toast.makeText(MainActivity.this, "Error: Num 2 must be an integer", Toast.LENGTH_LONG).show();
        } else {
            goToActivity(Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString()));
        }


    }
    public void goToActivity(int result){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("message", result);
        startActivity(intent);
    }
//    public void multiply(View view) {
//    }
//    void checkValidNumber(view);
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}