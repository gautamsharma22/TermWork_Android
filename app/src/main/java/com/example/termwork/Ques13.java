package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ques13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques13);
        Button button_check=findViewById(R.id.button_check);
        EditText uname_input=findViewById(R.id.uname_input);
        TextView message=findViewById(R.id.message);
        TextView output=findViewById(R.id.output);
        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input_name=uname_input.getText().toString();
                if(input_name.equals(input_name.toUpperCase())){
                    message.setText("The Input is in Upper Case.");
                    output.setText("Converted to Lower: "+input_name.toLowerCase());
                }else if(input_name.equals(input_name.toLowerCase())){
                    message.setText("The Input is in Lower Case.");
                    output.setText("Converted to Upper: "+input_name.toUpperCase());
                }else{
                    message.setText("Oops! String is Jumbled.");
                    output.setText("Please enter a valid String");
                }
            }
        });
    }
}