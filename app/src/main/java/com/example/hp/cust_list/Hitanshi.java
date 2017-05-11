package com.example.hp.cust_list;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by HP on 10-05-2017.
 */

public class Hitanshi extends BaseAdapter{
    Context context;
    int res;
    String[] st;
    int[] helly;
    TextView txt;
    ImageView img;
    public Hitanshi(Context context, int single_row,int[] helly, String[] st) {
        this.context=context;
        this.res=single_row;
        this.helly=helly;
        this.st=st;
    }

    @Override
    public int getCount() {

        return st.length;
    }

    @Override
    public Object getItem(int position) {

        return position;

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=LayoutInflater.from(context).inflate(R.layout.single_row,parent,false);
        txt=(TextView)convertView.findViewById(R.id.single_row_t1);
        img=(ImageView)convertView.findViewById(R.id.img);
        txt.setText(st[position]);
        img.setImageResource(helly[position]);
        return convertView;
    }
}
