package com.example.termwork;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ques14 extends AppCompatActivity {
Button btn_send;
TextView rand_num;
EditText email_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques14);
        rand_num=findViewById(R.id.rand_num);
        email_et=findViewById(R.id.email_et);
        btn_send=findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                Integer rand_number= Math.toIntExact(Math.round(Math.random() * 100000));
                rand_num.setText("Selected Number: "+rand_number.toString());
                String user_email=email_et.getText().toString();
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{user_email});
                i.putExtra(Intent.EXTRA_SUBJECT, "Question 14 Random Number");
                i.putExtra(Intent.EXTRA_TEXT,"The generated random number is "+rand_number.toString());
                startActivity(i);
            }
        });


    }
}