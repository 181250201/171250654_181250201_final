package com.example.myTictokDemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.myTictokDemo.Model.VideoCover;
import com.example.myTictokDemo.adapter.VideoAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements VideoAdapter.ListItemClickListener {

    private VideoAdapter mAdapter;
    private RecyclerView videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videos = findViewById(R.id.video_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        videos.setLayoutManager(manager);
        videos.setHasFixedSize(true); // 这一行后期可以酌情更改

        List<VideoCover> videoCovers = null;

        // todo: 通过接口获得相关数据转化为bean

        assert videoCovers != null;

        mAdapter = new VideoAdapter(videoCovers, this);

        videos.setAdapter(mAdapter);

    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        // todo: 启动视频播放的页面并传递数据（大概是视频的URL）
        Intent intent = new Intent(this, VideoPlayActivity.class);
    }
}