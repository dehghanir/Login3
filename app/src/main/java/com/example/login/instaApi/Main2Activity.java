package com.example.login.instaApi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.login.R;
import com.example.login.instaApi.Interfaces.AuthenticationListener;

public class Main2Activity extends AppCompatActivity implements AuthenticationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onCodeReceived(String auth_token) {

    }
}
