package com.example.sysadmin.demoapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sysadmin on 15/7/16.
 */
public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.MyViewHolder> {

    private List<String> list;
    private LayoutInflater inflater;

    RViewAdapter(Context context,List<String> list){
        inflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_view,parent,false);
        //Log.d("Oncreatevh", "onCreateViewHolder: ");
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(list.get(position));
        //Log.d("onBinds",list.get(position));
    }

    @Override
    public int getItemCount() {
        //Log.d("item count", "getItemCount: ");
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
