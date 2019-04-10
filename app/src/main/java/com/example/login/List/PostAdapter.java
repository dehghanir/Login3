package com.example.login.List;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.login.R;

import java.util.zip.Inflater;

public class PostAdapter extends RecyclerView.Adapter<postViewHolder> {


    Context context;
    LayoutInflater inflater;

    public PostAdapter(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);

    }


    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.activity_insta_p1, parent, false);
        postViewHolder pvh = new postViewHolder(v);


        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {

//        Log.d("hhhh", "this is position" + position);

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
