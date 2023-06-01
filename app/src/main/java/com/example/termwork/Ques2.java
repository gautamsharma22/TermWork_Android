package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ques2 extends AppCompatActivity {
Button button1;
TextView textbox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        textbox1=(TextView)findViewById(R.id.textbox1);
        button1=findViewById(R.id.generate_button);
        button1.setOnClickListener(new View.OnClickListener() {
            Integer count=0;
            @Override
            public void onClick(View view) {
                Float size=textbox1.getTextSize()/getResources().getDisplayMetrics().density;;
                if(count<5){
                    size+=2;
                    textbox1.setTextSize(size);
                    count++;
                }else{
                    Toast.makeText(getApplicationContext(),"Sorry, You can’t perform this operation",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}