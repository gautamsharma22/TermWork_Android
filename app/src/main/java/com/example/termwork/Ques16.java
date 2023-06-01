package com.example.termwork;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class Ques16 extends AppCompatActivity {
Button timer_start,timer_stop;
TextView time_tv;
CountDownTimer count_down_timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques16);
        timer_start=findViewById(R.id.timer_start);
        timer_stop=findViewById(R.id.timer_stop);
        time_tv=findViewById(R.id.time_tv);
        long duration= TimeUnit.MINUTES.toMillis(5);
        timer_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_down_timer=new CountDownTimer(duration,1000){

                    @Override
                    public void onTick(long l) {
                        int min_remaining=(int)(l/1000)/60;
                        int sec_remaining=(int) (l/1000)%60;
                        String total_remaining=String.format("%02d:%02d",min_remaining,sec_remaining);
                        time_tv.setText(total_remaining);
                    }

                    @Override
                    public void onFinish() {
                        time_tv.setText("Timer Finished");
                    }
                }.start();
            }

        });
        timer_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_down_timer.cancel();
            }
        });

    }
}