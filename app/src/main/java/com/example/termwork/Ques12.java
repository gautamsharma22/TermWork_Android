package com.example.termwork;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Ques12 extends AppCompatActivity {
ConstraintLayout ques12_back;
TextView ques12_message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques12);
        ques12_back=findViewById(R.id.ques12_back);
        ques12_message=findViewById(R.id.ques12_message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_red:
                ques12_message.setText("Color 1 (RED) is Selected.");
                ques12_back.setBackgroundColor(Color.RED);
                return true;
            case R.id.option_yellow:
                ques12_message.setText("Color 2 (YELLOW) is Selected.");
                ques12_back.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.option_green:
                ques12_message.setText("Color 3 (GREEN) is Selected.");
                ques12_back.setBackgroundColor(Color.GREEN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}