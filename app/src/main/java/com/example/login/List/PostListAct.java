package com.example.login.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.login.R;

public class PostListAct extends AppCompatActivity {

    RecyclerView rv;
    LinearLayoutManager layoutManager;
    PostAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_list);
        rv = findViewById(R.id.rv);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);

        adapter = new PostAdapter(this);
        rv.setAdapter(adapter);


    }
}
