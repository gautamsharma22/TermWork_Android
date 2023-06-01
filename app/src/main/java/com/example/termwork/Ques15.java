package com.example.termwork;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Ques15 extends AppCompatActivity {
Button btn_send_sms;
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques15);
        btn_send_sms=findViewById(R.id.btn_send_sms);
        e1=findViewById(R.id.number_et);
        btn_send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse("smsto:"));
//                i.setType("vnd.android-dir/mms-sms");
//                i.putExtra("address", new String("+918081568164"));
//                i.putExtra("sms_body","SMS TEXT ");
//                startActivity(Intent.createChooser(i, "Send sms via:"));
                try {
                    Random random=new Random();
                    Integer rand_number= Math.toIntExact(Math.round(Math.random() * 100000));
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(e1.getText().toString(), null, "The generated number is "+rand_number.toString(), null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!",
                            Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "Failed To Send SMS :(",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}