package com.example.login.Frogment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.login.R;
import com.example.login.Search.SearchAdapter;
import com.example.login.Search.SearchModel;

import java.util.ArrayList;


public class SearchFrag extends Fragment {

    RecyclerView rv;
    GridLayoutManager layoutManager;
    SearchAdapter adapter;
    ArrayList<SearchModel> data;


    public SearchFrag() {

    }


    public static SearchFrag newInstance() {
        SearchFrag fragment = new SearchFrag();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_search,container,false);

    rv = v.findViewById(R.id.rvSearch);

    layoutManager = new GridLayoutManager(getContext(),3,LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(layoutManager);

    data = dataFromServer();
    adapter = new SearchAdapter(getContext(),data);
        rv.setAdapter(adapter);
        return v;
    }

    public ArrayList<SearchModel> dataFromServer()
    {

        ArrayList<SearchModel>  list = new ArrayList<>();

        SearchModel s1 = new SearchModel();
        s1.thump = R.mipmap.c;
        s1.type = false;

        SearchModel s2 = new SearchModel();
        s2.thump = R.mipmap.b;
        s2.type = false;

        SearchModel s3 = new SearchModel();
        s3.thump = R.mipmap.a;
        s3.type = true;

        SearchModel s4 = new SearchModel();
        s4.thump = R.mipmap.f;
        s4.type = true;

        SearchModel s5 = new SearchModel();
        s5.thump = R.mipmap.e;
        s5.type = false;

        SearchModel s6 = new SearchModel();
        s6.thump = R.mipmap.d;
        s6.type = false;

        SearchModel s7 = new SearchModel();
        s7.thump = R.mipmap.c;
        s7.type = false;

        SearchModel s8 = new SearchModel();
        s8.thump = R.mipmap.b;
        s8.type = false;

        SearchModel s9 = new SearchModel();
        s9.thump = R.mipmap.a;
        s9.type = true;

        SearchModel s10 = new SearchModel();
        s10.thump = R.mipmap.f;
        s10.type = false;

        SearchModel s11 = new SearchModel();
        s11.thump = R.mipmap.e;
        s11.type = true;

        SearchModel s12 = new SearchModel();
        s12.thump = R.mipmap.d;
        s12.type = false;

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
        list.add(s12);

        return list;

    }


}
