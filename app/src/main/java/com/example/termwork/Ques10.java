package com.example.termwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ques10 extends AppCompatActivity {
    ListView contact_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques10);
        contact_list=findViewById(R.id.contact_list);

        ArrayList<Integer> img=new ArrayList<>();
        img.add(R.drawable.contact_1);
        img.add(R.drawable.contact_2);
        img.add(R.drawable.contact_3);
        img.add(R.drawable.contact_4);
        img.add(R.drawable.contact_5);
        img.add(R.drawable.contact_6);
        img.add(R.drawable.contact_7);
        img.add(R.drawable.contact_8);
        img.add(R.drawable.contact_9);
        img.add(R.drawable.contact_10);

        ArrayList<String> contact=new ArrayList<>();
        contact.add("+91 7380331867");
        contact.add("+91 8077460928");
        contact.add("+91 9760681112");
        contact.add("+91 9045282475");
        contact.add("+91 9027409766");
        contact.add("+91 8976578789");
        contact.add("+91 7874898789");
        contact.add("+91 9877898789");
        contact.add("+91 9867564567");
        contact.add("+91 9887765454");

        ArrayList<String> names=new ArrayList<>();
        names.add("Gautam Sharma");
        names.add("Ashwani Tomar");
        names.add("Aayush Lamba");
        names.add("Shivam Kumar");
        names.add("Vivek Kothari");
        names.add("Anupam Mittal");
        names.add("Ashneer Grover");
        names.add("Piyush Bansal");
        names.add("Aman Gupta");
        names.add("Amit Jain");

//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.support.constraint.R.layout.support_simple_spinner_dropdown_item,names);
        Ques10_Contact_Adapter adapter =new Ques10_Contact_Adapter(this,names,contact,img);
        contact_list.setAdapter(adapter);
        contact_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Name: "+names.get(i)+" Contact: "+contact.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}