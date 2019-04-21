package com.example.login.Frogment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.login.List.PostAdapter;
import com.example.login.List.PostModel;
import com.example.login.R;

import java.util.ArrayList;


public class HomeFrag extends Fragment {

    RecyclerView rv;
    LinearLayoutManager layoutManager;
    PostAdapter adapter;
    ArrayList<PostModel> data;



    public HomeFrag() {

    }


    public static HomeFrag newInstance() {
        HomeFrag fragment = new HomeFrag();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_post_list,container,false);
        rv = v.findViewById(R.id.rv);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        data = getFromServer();

        adapter = new PostAdapter(getContext(),data);
        rv.setAdapter(adapter);

        return v;
    }

    public  ArrayList<PostModel>  getFromServer(){
        ArrayList<PostModel> list = new ArrayList<>();

        PostModel m1 = new PostModel();
        m1.mainImage = R.mipmap.b;
        m1.isLiked = true;
        m1.numOfLikes = 25;

        PostModel m2 = new PostModel();
        m2.mainImage = R.mipmap.e;
        m2.isLiked = false;
        m2.numOfLikes = 165;


        PostModel m3 = new PostModel();
        m3.mainImage = R.mipmap.d;
        m3.isLiked = false;
        m3.numOfLikes = 5;

        PostModel m4 = new PostModel();
        m4.mainImage = R.mipmap.e;
        m4.isLiked = true;
        m4.numOfLikes = 238;

        PostModel m5 = new PostModel();
        m5.mainImage = R.mipmap.f;
        m5.isLiked = true;
        m5.numOfLikes = 111;

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);


        return list;

    }


}
