package com.lvh.demogridview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;
    private Context context;


    public ArrayList<HinhAnh> mItemList;

    public RecyclerViewAdapter(ArrayList<HinhAnh> itemList, Context context) {
        this.context = context;
        mItemList = itemList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == VIEW_TYPE_ITEM) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_layout, viewGroup, false);
            return new ItemViewHolder(view);
        } else {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.load_more, viewGroup, false);
            return new LoadingViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof ItemViewHolder) {
            HinhAnh hinhAnh = mItemList.get(i);
            ItemViewHolder holder = (ItemViewHolder) viewHolder;
            Glide.with(context).load(hinhAnh.getUrlHinh()).into(holder.img);
        } else if (viewHolder instanceof LoadingViewHolder) {
            LoadingViewHolder holder = (LoadingViewHolder) viewHolder;
            holder.progressBar.setIndeterminate(true);
        }
    }

    @Override
    public int getItemCount() {
        return mItemList == null ? 0 : mItemList.size();
    }

    @Override
    public int getItemViewType(int position) {

        return mItemList.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;

    }

    private class ItemViewHolder extends RecyclerView.ViewHolder {


        ImageView img;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imgHinh);

        }
    }

    private class LoadingViewHolder extends RecyclerView.ViewHolder {

        ProgressBar progressBar;

        public LoadingViewHolder(@NonNull View itemView) {
            super(itemView);
            progressBar = itemView.findViewById(R.id.progressBar);
        }
    }


}
