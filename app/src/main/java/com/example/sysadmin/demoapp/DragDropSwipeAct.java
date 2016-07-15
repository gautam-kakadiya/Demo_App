package com.example.sysadmin.demoapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sysadmin on 15/7/16.
 */
public class DragDropSwipeAct extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager layoutManager;
    private RViewAdapter adapter;
    private List<String> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragdropswip);

        list = Arrays.asList(getResources().getStringArray(R.array.Lines));
        //Log.d("listSize",list.size()+"");
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        adapter = new RViewAdapter(this,list);
        mRecyclerView.setAdapter(adapter);
    }

}
