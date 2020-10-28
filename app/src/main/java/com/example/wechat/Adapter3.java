package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter3 extends BaseAdapter {
    private Context mcntext;
    List<faxianz> mlst3;
    private LayoutInflater mLayoutInflater;
    public Adapter3(Context cntext,List<faxianz>mlst3){
        this.mcntext= cntext;
        this.mlst3= mlst3;
        mLayoutInflater =  LayoutInflater.from (cntext);
    }
    @Override
    public int getCount() {
        return mlst3!= null ? mlst3.size (): 0 ;
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
            convertView=mLayoutInflater.inflate (R.layout.listview3,null);
            holder =new viewholdlr ();
            holder.mimages=convertView.findViewById (R.id.images3);
            holder.mname=convertView.findViewById (R.id.name3);

            convertView.setTag (holder);
        }else {
            holder = (viewholdlr) convertView.getTag ();
        }
        String name=mlst3.get (position).getUserName ();
        int images3=mlst3.get (position).getImages3 ();
        holder.mname.setText (name);
        holder.mimages.setImageResource (images3);
        return convertView;
    }
}
