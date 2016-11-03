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
public class MyGridViewAdapter extends BaseAdapter {
    private List<GridViewBean> mGridList;
    private Context context;
    public MyGridViewAdapter(List<GridViewBean> mGridList, Context context) {
        this.mGridList = mGridList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mGridList.size();
    }

    @Override
    public Object getItem(int i) {
        return mGridList.get(i);
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
            view = View.inflate(context,R.layout.gv_item,null);
            holder.img = (ImageView) view.findViewById(R.id.gv_img);
            holder.tv = (TextView) view.findViewById(R.id.gv_tv);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        holder.img.setImageResource(mGridList.get(i).id);
        holder.tv.setText(mGridList.get(i).content);

        return view;
    }

    class ViewHolder{
        ImageView img;
        TextView tv;
    }
}
