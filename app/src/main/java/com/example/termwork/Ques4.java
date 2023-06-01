package com.example.termwork;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ques4 extends AppCompatActivity {
    Button b1,b2,b3;
    View c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques4);
        c1=(View)findViewById(R.id.cl1);
        b1=(Button) findViewById(R.id.btn_red);
        b2=(Button) findViewById(R.id.btn_green);
        b3=(Button) findViewById(R.id.btn_yellow);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });
    }
}