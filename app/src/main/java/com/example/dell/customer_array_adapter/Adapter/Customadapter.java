package com.example.dell.customer_array_adapter.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.customer_array_adapter.Album;
import com.example.dell.customer_array_adapter.R;

import java.util.List;

public class Customadapter extends ArrayAdapter<Album> {
    Context context;
    int resource;
    List<Album> albumList;

    public Customadapter(Context context, int resource, List<Album> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.albumList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowItem = inflater.inflate(resource,parent,false);
        ImageView hinhalbum = (ImageView) rowItem.findViewById(R.id.ImgHinhAnh);
        TextView tenalbum = (TextView) rowItem.findViewById(R.id.TvTenAlbum);
        TextView ngaphathanh = (TextView) rowItem.findViewById(R.id.TvNhaPhatHanh);

        hinhalbum.setImageResource(albumList.get(position).getHinhAnh());
        tenalbum.setText("Ten Album" + albumList.get(position).getTenAlbum().toString());
        ngaphathanh.setText("Ngay phat hanh" + albumList.get(position).getNgayPhatHanh().toString());






        return rowItem ;
    }
}