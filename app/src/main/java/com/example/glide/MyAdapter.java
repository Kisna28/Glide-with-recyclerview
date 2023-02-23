package com.example.glide;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.collection.CircularArray;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<Data>dataList;
    CircularArray<Object> myUrls;

   public MyAdapter(List<Data>dataList){
       this.dataList=dataList;
   }





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.design,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


       holder.tv.setText(dataList.get(position).getTitel());


      //  Glide.with(dataList.get.load("https://rukminim1.flixcart.com/image/416/416/xif0q/computer/u/a/n/omen-gaming-laptop-hp-original-imagmha8fueffvkh.jpeg?q=70").into(Data));




    }

    @Override
    public int getItemCount() {
        return dataList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tv;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.image);
            tv=itemView.findViewById(R.id.tv);
        }

    }
}



