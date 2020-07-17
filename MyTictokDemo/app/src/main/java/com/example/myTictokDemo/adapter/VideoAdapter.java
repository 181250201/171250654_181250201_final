package com.example.myTictokDemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myTictokDemo.Model.VideoCover;
import com.example.myTictokDemo.R;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.CoverViewHolder> {

    private List<VideoCover> covers;
    private static int index;
    private final ListItemClickListener mOnClickListener;

    public VideoAdapter(List<VideoCover> covers, ListItemClickListener listItemClickListener) {
        this.covers = covers;
        index = 0;
        this.mOnClickListener = listItemClickListener;
    }

    @NonNull
    @Override
    public VideoAdapter.CoverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.video_cover_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        CoverViewHolder holder = new CoverViewHolder(view);
        VideoCover current =covers.get(index);

        // todo: 完成每个item中元素的设置

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.CoverViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return covers.size();
    }

    public class CoverViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // 目前就这三个
        // private final TextView title;
        // private ImageView cover;

        // 这个button不需要进行设置
        // 到时候直接贴个播放的图标就好了
        // 点击时间直接由holder来完成
        // private Button playButton;

        public CoverViewHolder(@NonNull View itemView) {
            super(itemView);
            // todo: 将item中的元素提取到holder中
        }

        // todo: 点击后跳转到视频播放页面
        @Override
        public void onClick(View v) {
        }

    }

    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }
}
