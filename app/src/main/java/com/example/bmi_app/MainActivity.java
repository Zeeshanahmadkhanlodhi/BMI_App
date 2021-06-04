package com.example.bmi_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button show;
    EditText height,weight;
    TextView result,category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        result = findViewById(R.id.result);
        category = findViewById(R.id.category);
        show = findViewById(R.id.calculate);
        show.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String heightString = height.getText().toString();
        String weightString = weight.getText().toString();
        float w = Float.parseFloat(weightString);
        float h = Float.parseFloat(heightString);
        float BMI = (w) / (h*h);
        result.setText(String.valueOf(BMI));
        if(BMI >=0 && BMI <= 15){
            category.setText("Very Severly underweight");
        }else if(BMI > 15 && BMI <= 16){
            category.setText("Severly underweight");
        }else if(BMI > 16 && BMI <= 18.5){
            category.setText("underweight");
        }else if(BMI > 18.5 && BMI <= 25){
            category.setText("Normal");
        }else if(BMI > 25  && BMI <= 30){
            category.setText("Overweight");
        }else if(BMI > 30 && BMI <= 35){
            category.setText("Obese class 1");
        }else if(BMI > 35 && BMI <= 40){
            category.setText("Obese class 2");
        }else if(BMI > 40){
            category.setText("Obese class 3");
        }
    }
}