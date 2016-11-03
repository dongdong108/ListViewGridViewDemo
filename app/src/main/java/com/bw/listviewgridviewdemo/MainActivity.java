package com.bw.listviewgridviewdemo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private GridView mGridView;

    private List<String> mList;
    private List<GridViewBean> mGridList;
    private MyGridViewAdapter mGridViewAdapter;
    private MyListViewAdapter mListViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化数据
        initData();
        //控件初始化
        initView();
    }

    private void initData() {
        //初始化listview的数据
        mList = new ArrayList<>();

        for (int i = 0 ;i < 20 ; i++){
            mList.add("学习很简单"+i);
        }


        //初始化gridview的数据
        mGridList = new ArrayList<>();
        GridViewBean mgv1 = new GridViewBean(R.mipmap.gv1,"作家协会");
        GridViewBean mgv2 = new GridViewBean(R.mipmap.gv2,"美术家协会");
        GridViewBean mgv3 = new GridViewBean(R.mipmap.gv3,"杂技家协会");
        GridViewBean mgv4 = new GridViewBean(R.mipmap.gv4,"戏剧家协会");
        GridViewBean mgv5 = new GridViewBean(R.mipmap.gv5,"舞蹈家协会");
        GridViewBean mgv6 = new GridViewBean(R.mipmap.gv6,"音乐家协会");
        GridViewBean mgv7 = new GridViewBean(R.mipmap.gv7,"曲艺家协会");
        GridViewBean mgv8 = new GridViewBean(R.mipmap.gv8,"民间家协会");
        GridViewBean mgv9 = new GridViewBean(R.mipmap.gv9,"书法家协会");
        GridViewBean mgv10 = new GridViewBean(R.mipmap.gv10,"电影家协会");
        GridViewBean mgv11 = new GridViewBean(R.mipmap.gv11,"摄影摄影家协会");
        GridViewBean mgv12 = new GridViewBean(R.mipmap.gv12,"电视家协会");
        GridViewBean mgv13 = new GridViewBean(R.mipmap.gv13,"评论家协会");
        GridViewBean mgv14 = new GridViewBean(R.mipmap.gv14,"飞天编辑部");
        GridViewBean mgv15 = new GridViewBean(R.mipmap.gv1,"文学院");
        GridViewBean mgv16 = new GridViewBean(R.mipmap.gv1,"理论研究室");

        mGridList.add(mgv1);
        mGridList.add(mgv2);
        mGridList.add(mgv3);
        mGridList.add(mgv4);
        mGridList.add(mgv5);
        mGridList.add(mgv6);
        mGridList.add(mgv7);
        mGridList.add(mgv8);
        mGridList.add(mgv9);
        mGridList.add(mgv10);
        mGridList.add(mgv11);
        mGridList.add(mgv12);
        mGridList.add(mgv13);
        mGridList.add(mgv14);
        mGridList.add(mgv15);
        mGridList.add(mgv16);


    }

    private void initView() {
        //找ID
        mGridView = (GridView) findViewById(R.id.girdView);
        mListView = (ListView) findViewById(R.id.listView);
        //设置适配器
        mGridViewAdapter = new MyGridViewAdapter(mGridList,this);
        mGridView.setAdapter(mGridViewAdapter);

        mListViewAdapter = new MyListViewAdapter(mList,this);
        mListView.setAdapter(mListViewAdapter);
    }
}
