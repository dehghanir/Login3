package com.example.login.Search;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.login.R;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchLayoutViewHolder> {


    Context context;
    LayoutInflater inflater;
    ArrayList<SearchModel> data;

    public SearchAdapter(Context context, ArrayList<SearchModel> data){

        this.context =context;
        inflater = LayoutInflater.from(context);
        this.data =data;
    }


    @NonNull
    @Override
    public SearchLayoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.search_layout,parent,false);
        SearchLayoutViewHolder vh = new SearchLayoutViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchLayoutViewHolder holder, int position) {
        holder.thumb.setImageResource(data.get(position).thump);

        if (data.get(position).type == true){

            holder.typr.setImageResource(R.mipmap.ic_video);
        }else holder.typr.setImageResource(R.mipmap.ic_imge);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
