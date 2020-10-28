package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter2 extends BaseAdapter {
    private Context mcntext;
    List<lianxiren> mlst2;
    private LayoutInflater mLayoutInflater;

    public Adapter2(Context cntext,List<lianxiren>mlst2){
        this.mcntext= cntext;
        this.mlst2=mlst2;
        mLayoutInflater =  LayoutInflater.from (cntext);
    }
    @Override
    public int getCount() {
        return mlst2!= null ? mlst2.size (): 0 ;
    }

    @Override
    public Object getItem(int position) {
        return null;
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
            convertView=mLayoutInflater.inflate (R.layout.listview2,null);
            holder =new viewholdlr ();
            holder.mimages=convertView.findViewById (R.id.images1);
            holder.mname=convertView.findViewById (R.id.name1);


            convertView.setTag (holder);
        }else {
            holder = (viewholdlr) convertView.getTag ();
        }

        String name=mlst2.get (position).getUserName ();
        int images2=mlst2.get (position).getImages2 ();
        holder.mname.setText (name);
        holder.mimages.setImageResource (images2);
//        convertView.setTag (holder);
        return convertView;
    }
}
