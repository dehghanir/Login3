package com.example.login;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class insta_p1 extends AppCompatActivity {


    ImageView hartwhite;
    ImageView btnlike;
    TextView txtlike;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_p1);

        hartwhite = findViewById(R.id.hart_white);
        btnlike = findViewById(R.id.btn_like);
        txtlike = findViewById(R.id.txt_like);


        btnlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                hartwhite.setVisibility(view.VISIBLE);
                btnlike.setImageResource(R.mipmap.liked_heart);
                txtlike.setText("849 Likes");

                Handler h = new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        hartwhite.setVisibility(view.INVISIBLE);


                    }
                }, 2000);


            }
        });


    }

}
