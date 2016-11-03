package com.bw.listviewgridviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asus on 2016/11/3.
 */
public class MyListViewAdapter extends BaseAdapter {
    private List<String> mList;
    private Context context;
    public MyListViewAdapter(List<String> mList, Context context) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view==null){
            holder = new ViewHolder();
            view = View.inflate(context,R.layout.lv_item,null);
            holder.img = (ImageView) view.findViewById(R.id.lv_img);
            holder.tv = (TextView) view.findViewById(R.id.lv_tv);

            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        holder.img.setImageResource(R.mipmap.ic_launcher);
        holder.tv.setText(mList.get(i));
        return view;
    }

    class ViewHolder{
        ImageView img;
        TextView tv;
    }
}
