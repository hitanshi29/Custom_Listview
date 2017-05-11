package com.example.hp.cust_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    GridView l;
    int[] helly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(GridView) findViewById(R.id.l1);
        helly=new int[]{R.drawable.gujarat,R.drawable.rajasthan,R.drawable.mumbai,R.drawable.chennai,R.drawable.delhi,R.drawable.hydrabad,R.drawable.punjab,R.drawable.banglore,R.drawable.pune,R.drawable.kolkata};

        String[] st=getResources().getStringArray(R.array.state);
        Hitanshi h=new Hitanshi(this,R.layout.single_row,helly,st);
        l.setAdapter(h);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
