package com.wcreation.ordinarylevel.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.wcreation.ordinarylevel.R;
import com.wcreation.ordinarylevel.modal.Messages;

import java.util.List;

/**
 * Created by Dinesh Wayaman from W Creation on 7/10/2020.
 */

public class InformationRecyclerViewAdapter extends RecyclerView.Adapter<InformationRecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Messages> mData ;
    RequestOptions option;

    public InformationRecyclerViewAdapter(Context mContext, List<Messages> mData){
        this.mContext = mContext;
        this.mData = mData;

        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.information_message,parent,false);
        final MyViewHolder viewHolder = new MyViewHolder(view) ;



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_message.setText(mData.get(position).getMessage());
        Glide.with(mContext).load(mData.get(position).getImage_URI()).apply(option).into(holder.img_thumbnail);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

       TextView tv_message;
       ImageView img_thumbnail;
       LinearLayout view_container;

       public MyViewHolder(@NonNull View itemView) {
           super(itemView);

           view_container = (itemView).findViewById(R.id.container);
           tv_message = itemView.findViewById(R.id.txtImformation);
           img_thumbnail = itemView.findViewById(R.id.img_thumbnail);
       }
   }
}
