package com.codingwithlaxman.calculationstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final Context context=this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button_to_miles);
        Button  btn2 =findViewById(R.id.button_to_km);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity2();
            }
        });

    }
     public void nextActivity(){
         Intent intent = new Intent(context, mainActivity_second.class);
         startActivity(intent);
     }

    public void nextActivity2(){
        Intent intent = new Intent(context, MainActivity_3rd.class);
        startActivity(intent);
    }
}
