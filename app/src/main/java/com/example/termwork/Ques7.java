package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Ques7 extends AppCompatActivity {
Button b1;
TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques7);
        b1=findViewById(R.id.generate_button);
        output=findViewById(R.id.output);
        b1.setOnClickListener(new View.OnClickListener() {
            String GenerateRandom(){
                String ans="";
                Random random=new Random();
                String CAPS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String SMALL="abcdefghijklmnopqrstuvwxyz";
                String NUMS="0123456789";
                String SYMBOL="!@#$%^&*()_+?/";
                StringBuilder sb=new StringBuilder();
                Integer count=0;
                while(count<8){
                    int CAPS_INDEX = random.nextInt(CAPS.length());
                    int SMALL_INDEX = random.nextInt(SMALL.length());
                    int NUMS_INDEX = random.nextInt(NUMS.length());
                    int SYMBOL_INDEX = random.nextInt(SYMBOL.length());
                    sb.append(NUMS.charAt(NUMS_INDEX));
                    sb.append(CAPS.charAt(CAPS_INDEX));
                    sb.append(SMALL.charAt(SMALL_INDEX));
                    sb.append(SYMBOL.charAt(SYMBOL_INDEX));
                    count+=4;
                }
                ans = sb.toString();
                return ans;
            }

            @Override
            public void onClick(View view) {
                output.setText(GenerateRandom());
            }
        });
    }
}