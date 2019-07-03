package com.lvh.demogridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {
    private List<HinhAnh> hinhAnhList;
    private Context context;

    public GridViewAdapter(List<HinhAnh> hinhAnhList, Context context) {
        this.hinhAnhList = hinhAnhList;
        this.context = context;
    }


    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.custom_layout, null);
        TextView txtName = view.findViewById(R.id.txtName);
        ImageView imgHinh = view.findViewById(R.id.imgHinh);
        txtName.setText(hinhAnhList.get(i).getTen());
        Glide.with(context).load(hinhAnhList.get(i).getUrlHinh()).into(imgHinh);
        return view;
    }

    public void notifyItemInserted(int i) {
    }

    public void notifyItemRemoved(int scrollPosition) {
    }
}