package com.example.termwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Ques10_Contact_Adapter extends BaseAdapter {
    Context ctx;
    ArrayList<String> names;
    ArrayList<String> contact;
    ArrayList<Integer> images;
    LayoutInflater inflator;
    public Ques10_Contact_Adapter(Context ctx, ArrayList<String> names,ArrayList<String> contact,ArrayList<Integer> images){
        this.names=names;
        this.contact=contact;
        this.images=images;
        this.inflator=LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflator.inflate(R.layout.activity_ques10_contact_layout,null);
        TextView name=(TextView) view.findViewById(R.id.contact_name);
        TextView contact_view=(TextView) view.findViewById(R.id.contact_number);
        ImageView img=(ImageView) view.findViewById(R.id.contact_image);
        name.setText(names.get(i));
        contact_view.setText(contact.get(i));
        img.setImageResource(images.get(i));
        return view;
    }
}
