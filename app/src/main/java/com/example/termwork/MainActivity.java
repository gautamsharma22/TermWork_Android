package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    TextView op1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=findViewById(R.id.input_1);
        input2=findViewById(R.id.input_2);
        b1=(Button) findViewById(R.id.generate_button);
        op1=(TextView) findViewById(R.id.textbox1);
        b1.setOnClickListener(new View.OnClickListener() {
            boolean checkPrime(Integer n){
                for(int i=2;i<n;i++){
                    if(n%i==0){
                        return false;
                    }
                }
                return true;
            }
            @Override
            public void onClick(View view) {
                String num1=input1.getText().toString();
                Integer a= Integer.valueOf(num1);
                String num2=input2.getText().toString();
                Integer b= Integer.valueOf(num2);
                Integer num=a+b;
                if(checkPrime(num)){
                    op1.setText(num + " is Prime...");
                }else{
                    op1.setText(num + " is Not Prime ...");
                }
            }
        });


    }
}