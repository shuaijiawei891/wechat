package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Adapter4 extends BaseAdapter {
    private Context mcntext;
            List<messages> mlst;
    private LayoutInflater mLayoutInflater;




    public Adapter4(Context cntext,List<messages> mlst){
        this.mcntext= cntext;
        this.mlst=mlst;
        mLayoutInflater =  LayoutInflater.from (cntext);
    }
    @Override
    public int getCount() {
        return  mlst!= null ? mlst.size (): 0 ;
    }

    @Override
    public Object getItem(int position) {

        ;return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
static class viewholdlr{
        public ImageView mimages;
        public TextView mname;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewholdlr holder = null;
        if (convertView == null){
            convertView=mLayoutInflater.inflate (R.layout.listview4,null);
            holder =new viewholdlr ();
            holder.mimages=convertView.findViewById (R.id.images4);
            holder.mname=convertView.findViewById (R.id.name4);

            convertView.setTag (holder);
        }else {
            holder = (viewholdlr) convertView.getTag ();
        }
        String name=mlst.get (position).getUserName ();
        Object image=mlst.get (position).getImages ();
        holder.mimages.setImageResource ((Integer) image);
        holder.mname.setText (name);
        return convertView;
    }
}
