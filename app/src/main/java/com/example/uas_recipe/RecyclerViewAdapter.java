package com.example.uas_recipe;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Recipe>mData;

    public RecyclerViewAdapter(Context mContext, List<Recipe> mData){
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup ViewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_recipe,ViewGroup,false);

        return new MyHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {
        myHolder.recipeTitle.setText(mData.get(i).getNamaResep());
        myHolder.img_review_thumbnail.setImageResource(mData.get(i).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RecpieActivity.class);

                intent.putExtra("Name", mData.get(i).getNamaResep());
                intent.putExtra("Bahan",mData.get(i).getBahanResep());
                intent.putExtra("resep",mData.get(i).getResep());

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView recipeTitle;
        CardView cardView;
        ImageView img_review_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle = (TextView) itemView.findViewById(R.id.text_resep);
            img_review_thumbnail = (ImageView) itemView.findViewById(R.id.recipe_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);
        }
    }
}
