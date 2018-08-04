package com.itkido.schoolchat;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";


    private ArrayList<String> mClassImageNames = new ArrayList<>();
    private ArrayList<String> mClassImages = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> classImageNames, ArrayList<String> classImages, Context context) {
        mClassImageNames = classImageNames;
        mClassImages = classImages;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: new item");
        Glide.with(mContext)
                .asBitmap()
                .load(mClassImages.get(position))
                .into(holder.classImage);

        holder.classImageName.setText(mClassImageNames.get(position));


        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mClassImageNames.get(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(mContext, activity_userclassroom.class);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mClassImageNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView classImage;
        TextView classImageName;
        RelativeLayout parentLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            classImage = itemView.findViewById(R.id.classImage);
            classImageName = itemView.findViewById(R.id.txtClassName);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }
    }
}


