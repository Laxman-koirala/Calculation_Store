package com.codingwithlaxman.calculationstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_4th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4th);

        final Button btn1= findViewById(R.id.button_clear);
        Button btn2= findViewById(R.id.button_calculate);
        final TextView tx1= findViewById(R.id.textview_result);
        final EditText edt  = findViewById(R.id.edittext_for_mi);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edt.getText().toString());
                double miles= 0.62137119224 *num1;
                tx1.setText(String.valueOf(miles));

            }
        });

    }
}
