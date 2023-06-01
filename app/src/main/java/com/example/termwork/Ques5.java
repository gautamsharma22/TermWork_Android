package com.example.termwork;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ques5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    private  static class MyView extends View{
        public MyView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint redPaint=new Paint();

            redPaint.setColor(Color.RED);
            redPaint.setStyle(Paint.Style.FILL);

            Paint yellowPaint=new Paint();
            yellowPaint.setColor(Color.YELLOW);
            yellowPaint.setStyle(Paint.Style.FILL);

            Paint greenPaint=new Paint();
            greenPaint.setColor(Color.GREEN);
            greenPaint.setStyle(Paint.Style.FILL);

            canvas.drawCircle(200,200,100,redPaint);
            canvas.drawRect(100,400,400,600,yellowPaint);

            RectF square= new RectF(500,400,700,600);
            canvas.drawRect(square,greenPaint);

        }
    }
}