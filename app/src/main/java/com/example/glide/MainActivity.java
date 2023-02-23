package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView tv;
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.image);
        tv=findViewById(R.id.tv);
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(getinformation());  //Hear getinformation is a only function this name is given by your choice.
        recyclerView.setAdapter(adapter);


    }
    List<Data>getinformation(){
        List<Data> dataList = new ArrayList<>();
dataList.add(new Data("Kisna",R.drawable.ic_launcher_background));
dataList.add(new Data("hgfdh",R.drawable.ic_launcher_background));
dataList.add(new Data("ghdf",R.drawable.ic_launcher_background));
dataList.add(new Data("Kigfdhsna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kifghsna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kisgfdhna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kidfhfghdhsna",R.drawable.ic_launcher_background));
dataList.add(new Data("Khdghhgisna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kivdfgsna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kifdgfdssna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kifdgdfhsna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kfhdfhisna",R.drawable.ic_launcher_background));
dataList.add(new Data("Kfghfgdisna",R.drawable.ic_launcher_background));
dataList.add(new Data("dhd",R.drawable.ic_launcher_background));
return dataList;


    }
}