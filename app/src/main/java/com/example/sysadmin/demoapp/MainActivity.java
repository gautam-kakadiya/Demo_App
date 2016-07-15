package com.example.sysadmin.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<String> list;
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listview);

        String[] values = {"Drag and Drop Activity" };
        int len = values.length;
        list = new ArrayList<String>();
        for(int i=0;i<len;++i){
            list.add(i,values[i]);
        }
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(MainActivity.this,DragDropSwipeAct.class);
                    startActivity(intent);
                }
            }
        });
    }
}
