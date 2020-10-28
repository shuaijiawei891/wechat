package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context mcntext;
    List<news> mlst1;
    private LayoutInflater mLayoutInflater;
    public Adapter(Context cntext,List<news>mlst1){
        this.mcntext= cntext;
        this.mlst1=mlst1;
        mLayoutInflater =  LayoutInflater.from (cntext);
    }
    @Override
    public int getCount() {
        return mlst1!= null ? mlst1.size (): 0 ;
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
        public TextView mtimes,mname,mnews;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewholdlr holder = null;
        if (convertView == null){
            convertView=mLayoutInflater.inflate (R.layout.listview,null);
            holder =new viewholdlr ();
            holder.mimages=convertView.findViewById (R.id.images);
            holder.mname=convertView.findViewById (R.id.name);
            holder.mnews=convertView.findViewById (R.id.news);
            holder.mtimes=convertView.findViewById (R.id.times);
            convertView.setTag (holder);
        }else {
            holder = (viewholdlr) convertView.getTag ();
        }
        String name=mlst1.get (position).getUserName ();
        String time=mlst1.get (position).getTime ();
        String news=mlst1.get (position).getNews ();
        int images1=mlst1.get (position).getImages1 ();
        holder.mimages.setImageResource (images1);
        holder.mtimes.setText (time);
        holder.mnews.setText (news);
        holder.mname.setText (name);

//        convertView.setTag (holder);
        return convertView;
    }
}
