package com.codingwithlaxman.calculationstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainActivity_second extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6;
    TextView textview;
    EditText edittext,edt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity_second);

        btn1 = findViewById(R.id.button_addition);
        btn2 = findViewById(R.id.button_subtraction);
        btn3 = findViewById(R.id.button_multiplication);
        btn4 = findViewById(R.id.button_division);
        btn5 = findViewById(R.id.button_power);
        btn6 = findViewById(R.id.button_clear);
        textview= findViewById(R.id.textview_result);
        edittext= findViewById(R.id.edittext_first);
        edt= findViewById(R.id.edittext_second);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edittext.getText().toString());
                double num2 = Double.parseDouble(edt.getText().toString());
                double result = num1+num2;
                textview.setText(String.valueOf(result));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edittext.getText().toString());
                double num2 = Double.parseDouble(edt.getText().toString());
                double result = num1-num2;
                textview.setText(String.valueOf(result));

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edittext.getText().toString());
                double num2 = Double.parseDouble(edt.getText().toString());
                double result = num1*num2;
                textview.setText(String.valueOf(result));

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edittext.getText().toString());
                double num2 = Double.parseDouble(edt.getText().toString());
                double result = num1/num2;
                textview.setText(String.valueOf(result));

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edittext.getText().toString());
                double num2 = Double.parseDouble(edt.getText().toString());
                double result =Math.pow(num1,num2);
                textview.setText(String.valueOf(result));

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText("");
                edt.setText("");

            }
        });


    }
}
