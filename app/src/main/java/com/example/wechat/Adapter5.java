package com.example.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter5 extends BaseAdapter {
    private Context mcntext;
    List<xialaliebiao> mlst3;
    private LayoutInflater mLayoutInflater;

    public Adapter5(Context cntext, List<xialaliebiao>mlst3){
        this.mcntext= cntext;
        this.mlst3=mlst3;
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
        public TextView mnames;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewholdlr holder = null;
        if (convertView == null){
            convertView=mLayoutInflater.inflate (R.layout.xialaliebiao,null);
            holder =new viewholdlr ();
            holder.mimages=convertView.findViewById (R.id.xiaimage_1);
            holder.mnames=convertView.findViewById (R.id.xiatext_1);

            convertView.setTag (holder);
        }else {
            holder = (viewholdlr) convertView.getTag ();
        }
        String name=mlst3.get (position).getUserName ();
        int images1=mlst3.get (position).getImages3 ();

        holder.mimages.setImageResource (images1);
        holder.mnames.setText (name);

//        convertView.setTag (holder);
        return convertView;
    }
}
