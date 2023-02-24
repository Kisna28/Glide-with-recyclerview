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
dataList.add(new Data("Kisna","https://rukminim1.flixcart.com/image/416/416/kzn17680/computer/1/i/z/-original-imagbhzqahdzyx4e.jpeg?q=70"));
dataList.add(new Data("hgfdh","https://rukminim1.flixcart.com/image/416/416/xif0q/computer/8/l/f/-original-imagg2ckcragzhhe.jpeg?q=70"));
dataList.add(new Data("ghdf","https://rukminim1.flixcart.com/image/416/416/l2qhjm80/computer/p/i/1/crosshair-15-b12uez-gaming-laptop-msi-original-imageymuhhs7djjf.jpeg?q=70"));
dataList.add(new Data("Kigfdhsna","https://rukminim1.flixcart.com/image/416/416/l0vbukw0/computer/z/o/e/-original-imagckcfz6jgjn3z.jpeg?q=70"));
dataList.add(new Data("Kifghsna","https://rukminim1.flixcart.com/image/416/416/xif0q/computer/8/l/c/raider-ge77hx-12uhs-205in-gaming-laptop-msi-original-imaghffpfubseq3n.jpeg?q=70"));
dataList.add(new Data("Kisgfdhna","https://rukminim1.flixcart.com/image/416/416/kkwwu4w0/mouse/2/h/g/g402-logitech-original-imagy5ny25h8nsms.jpeg?q=70"));
dataList.add(new Data("Kidfhfghdhsna","https://rukminim1.flixcart.com/image/416/416/xif0q/keyboard/2/u/a/-original-imagn3f8ybfyxsrf.jpeg?q=70"));
dataList.add(new Data("Khdghhgisna","https://rukminim1.flixcart.com/image/416/416/xif0q/headphone/n/e/0/e5000pro-eksa-original-imaggmshrzwnjchg.jpeg?q=70"));
dataList.add(new Data("Kivdfgsna","https://rukminim1.flixcart.com/image/416/416/koenl3k0/cooling-pad/n/u/7/dcx-a101-lapcare-original-imag2vd7dpb8r5ff.jpeg?q=70"));
dataList.add(new Data("Kifdgfdssna","https://rukminim1.flixcart.com/image/416/416/kpr8k280/mousepad/q/4/x/mp35st-redgear-original-imag3wzn8xhkgrz9.jpeg?q=70"));
dataList.add(new Data("Kifdgdfhsna","https://rukminim1.flixcart.com/image/416/416/xif0q/mobile/2/s/7/-original-imagmg6gktts6sfy.jpeg?q=70"));
dataList.add(new Data("Kfhdfhisna","https://rukminim1.flixcart.com/image/416/416/ky7lci80/mobile/t/x/j/-original-imagahvge92r5fmm.jpeg?q=70"));
dataList.add(new Data("Kfghfgdisna","https://rukminim1.flixcart.com/image/416/416/xif0q/headphone/l/j/e/-original-imagnfufffaczakh.jpeg?q=70"));

return dataList;


    }
}