package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ques6_2 extends AppCompatActivity {
Button button_login;
EditText password,phonenumber,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques62);
        button_login=findViewById(R.id.button_login);
        email=findViewById(R.id.email_input);
        password=findViewById(R.id.password_input);
        phonenumber=findViewById(R.id.phone_input);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Password,Email,PhoneNum;

                Password=password.getText().toString();
                Email=email.getText().toString();
                PhoneNum= phonenumber.getText().toString();
                Boolean allCorrect=true;

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
    }
}