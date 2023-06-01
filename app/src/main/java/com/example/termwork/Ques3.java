package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Ques3 extends AppCompatActivity {
    private static final String NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);
        Log.d( NAME,"onCreate() called");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d( NAME,"onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(NAME,"onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(NAME, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(NAME, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(NAME, "onDestroy() called");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(NAME, "onRestart() called");
    }
}