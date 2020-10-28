package com.example.wechat;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.Group;

import java.util.ArrayList;

public class MyBaseExpandableListAdapter extends BaseExpandableListAdapter {

    private ArrayList<Group> gData;
    private ArrayList<ArrayList<ClipData.Item>> iData;
    private Context mContext;

    public MyBaseExpandableListAdapter(ArrayList<Group> gData, ArrayList<ArrayList<ClipData.Item>> iData, Context mContext) {
        this.gData = gData;
        this.iData = iData;
        this.mContext = mContext;
    }
    @Override
    public int getGroupCount() {
        return gData.size ();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
         return iData.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return gData.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return iData.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
    static class ViewHolderGroup{
        private TextView tv_group_name;
        private ImageView mhelpimage1;
        private TextView mhelptextview;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ViewHolderGroup groupHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.item_exlist_item, parent, false);
            groupHolder = new ViewHolderGroup();
            groupHolder.mhelpimage1 = (ImageView) convertView.findViewById(R.id.helpimage1);
          groupHolder.mhelptextview= convertView.findViewById (R.id.helptext1);
            convertView.setTag(groupHolder);
        }else{
            groupHolder = (ViewHolderGroup) convertView.getTag();
        }


        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
