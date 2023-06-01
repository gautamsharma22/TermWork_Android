package com.example.termwork;

import android.app.DatePickerDialog;
import java.time.LocalDate;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Period;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class Ques11 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques11);
        Button b1=findViewById(R.id.btn_calculate_age);
        t1=findViewById(R.id.tv_years);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPicker();
            }
        });

    }
    public void openPicker(){
        DatePickerDialog input_dob=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                month+=1;
                LocalDate DOB=LocalDate.of(year,month,date);
                LocalDate currentDate = LocalDate.now();
                Period age=Period.between(DOB,currentDate);
                Toast.makeText(getApplicationContext(),String.valueOf(age.getDays())+" "+String.valueOf(age.getMonths())+" "+String.valueOf(age.getYears())+" ",Toast.LENGTH_SHORT).show();
                t1.setText(String.valueOf(age.getDays())+" Days "+String.valueOf(age.getMonths())+" Months "+String.valueOf(age.getYears())+" Years Old!");
            }
        },2023,01,01);
        input_dob.show();
    }
}