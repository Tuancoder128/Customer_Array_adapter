package com.example.dell.customer_array_adapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.dell.customer_array_adapter.Adapter.Customadapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    ListView listViewalbum;
    int[] HinhAlbum = {R.drawable.aqua, R.drawable.aslongasyouloveme, R.drawable.images, R.drawable.nevergone, R.drawable.noname};
    String[] TenAlbum = {"con co be be", "hai con cua", "tam cam", "thach sanh", "lao hac"};
    String[] NgayPhatHanh = {"12/1/1991", "02/02/1993", "19/8/1945", "8/3/2011", "6/8/2018"};
    List<Album> DanhSachAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewalbum = (ListView) findViewById(R.id.LvAlbum);

        DanhSachAlbum = new ArrayList<>();
        for (int i = 0; i < HinhAlbum.length; i++) {
            Album album = new Album();
            album.setHinhAnh(HinhAlbum[i]);
            album.setTenAlbum(TenAlbum[i]);
            album.setNgayPhatHanh(NgayPhatHanh[i]);
            DanhSachAlbum.add(album);
        }
        Customadapter arayadapter = new Customadapter(this,R.layout.customer_album,DanhSachAlbum);
        arayadapter.notifyDataSetChanged();
        listViewalbum.setAdapter(arayadapter);





    }


}
