package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Ques9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques9);
        ImageView img=findViewById(R.id.imageView2);
        Button chng_img=findViewById(R.id.chng_img);
        TextView img_text=findViewById(R.id.img_text);
        chng_img.setOnClickListener(new View.OnClickListener() {
            Integer count=0;
            @Override
            public void onClick(View view) {
                if(count==5)count=0;
                count++;
                String img_res="image_"+count;
                img_text.setText("Showing Image "+count);
                int res_id=getResources().getIdentifier(img_res,"drawable",getPackageName());
                img.setImageResource(res_id);
            }
        });
    }
}