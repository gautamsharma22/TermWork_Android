package com.example.termwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ques6 extends AppCompatActivity {
Button register,movenext;
EditText username,password,phonenumber,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques6);
        register=findViewById(R.id.button_register);
        movenext=findViewById(R.id.button_movenext);
        username=findViewById(R.id.uname_input);
        password=findViewById(R.id.password_input);
        phonenumber=findViewById(R.id.phone_input);
        email=findViewById(R.id.email_input);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username,Password,Email,PhoneNum;

                Username=username.getText().toString();
                Password=password.getText().toString();
                Email=email.getText().toString();
                PhoneNum= phonenumber.getText().toString();
                Boolean allCorrect=true;

                if(Username.isEmpty()){
                    username.setError("Enter Valid User Name");
                    allCorrect=false;
                }
                if(Password.isEmpty() || Password.length()<8 ){
                    password.setError("Password Length Should be 8 Chars and Non-Empty");
                    allCorrect=false;
                }
                if(Email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches() ){
                    email.setError("Enter Valid Email");
                    allCorrect=false;
                }
                if( PhoneNum.isEmpty() || PhoneNum.length()<10){
                    phonenumber.setError("Phone Number be At Least 10 Digits");
                    allCorrect=false;
                }

                if(allCorrect){
                    Toast.makeText(getApplicationContext(),"Success, Form Is Valid To Submit",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid Form Inputs, Please Try Again With Valid Inputs",Toast.LENGTH_LONG).show();
                }

            }
        });
        movenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Ques6_2.class);
                startActivity(i1);
            }
        });
    }
}