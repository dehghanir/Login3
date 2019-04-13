package com.example.login.Search;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.login.R;

public class SearchLayoutViewHolder extends RecyclerView.ViewHolder {




public ImageView thumb;
public  ImageView typr;

    public SearchLayoutViewHolder(View itemView) {
        super(itemView);

        thumb = itemView.findViewById(R.id.thump);
        typr = itemView.findViewById(R.id.type);

    }
}
