package com.example.login;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.login.Frogment.AddFrag;
import com.example.login.Frogment.HomeFrag;
import com.example.login.Frogment.LikeFrag;
import com.example.login.Frogment.ProfFrag;
import com.example.login.Frogment.SearchFrag;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgHome, imgSearch, imgAdd, imgLike, imgProf;
    LinearLayout btnHome, btnSearch, btnAdd, btnLike, btnProf;
    ViewPager vp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgHome = findViewById(R.id.imgHome);
        imgSearch = findViewById(R.id.imgSearch);
        imgAdd = findViewById(R.id.imgAdd);
        imgLike = findViewById(R.id.imgLike);
        imgProf = findViewById(R.id.imgProfile);

        btnHome = findViewById(R.id.btnHome);
        btnSearch = findViewById(R.id.btnSearch);
        btnAdd = findViewById(R.id.btnAdd);
        btnLike = findViewById(R.id.btnLike);
        btnProf = findViewById(R.id.btnProfile);

        btnHome.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnLike.setOnClickListener(this);
        btnProf.setOnClickListener(this);

        vp = findViewById(R.id.vp);
        vp.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position == 0 ) {
                    ActiveItem();
                    imgHome.setImageResource(R.mipmap.men_11);
                }
                if (position == 1 ) {
                    ActiveItem();
                    imgSearch.setImageResource(R.mipmap.men_21);
                }
                if (position == 2 ) {
                    ActiveItem();
                    imgAdd.setImageResource(R.mipmap.men_31);
                }
                if (position == 3 ) {
                    ActiveItem();
                    imgLike.setImageResource(R.mipmap.men_41);
                }
                if (position == 4 ) {
                    ActiveItem();
                    imgProf.setImageResource(R.mipmap.men_51);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {


        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0){
                return HomeFrag.newInstance();
            }

            if (position == 1){
                return SearchFrag.newInstance();
            }

            if (position == 2){
                return AddFrag.newInstance();
            }

            if (position == 3){
                return LikeFrag.newInstance();
            }

            if (position == 4){
                return ProfFrag.newInstance();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnHome) {
            ActiveItem();
            imgHome.setImageResource(R.mipmap.men_11);
            vp.setCurrentItem(0);
        }
        if (view.getId() == R.id.btnSearch) {
            ActiveItem();
            imgSearch.setImageResource(R.mipmap.men_21);
            vp.setCurrentItem(1);
        }
        if (view.getId() == R.id.btnAdd) {
            ActiveItem();
            imgAdd.setImageResource(R.mipmap.men_31);
            vp.setCurrentItem(2);
        }
        if (view.getId() == R.id.btnLike) {
            ActiveItem();
            imgLike.setImageResource(R.mipmap.men_41);
            vp.setCurrentItem(3);
        }
        if (view.getId() == R.id.btnProfile) {
            ActiveItem();
            imgProf.setImageResource(R.mipmap.men_51);
            vp.setCurrentItem(4);
        }

    }
    public void ActiveItem(){
        imgHome.setImageResource(R.mipmap.men_1);
        imgSearch.setImageResource(R.mipmap.men_2);
        imgAdd.setImageResource(R.mipmap.men_3);
        imgLike.setImageResource(R.mipmap.men_4);
        imgProf.setImageResource(R.mipmap.men_5);


    }

}
