package com.example.login.List;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.R;

public class postViewHolder extends RecyclerView.ViewHolder {

    ImageView hartwhite;
    ImageView btnlike;
    TextView txtlike;
    ImageView mainImage;


    public postViewHolder(View itemView) {
        super(itemView);

        hartwhite = itemView.findViewById(R.id.hart_white);
        btnlike = itemView.findViewById(R.id.btn_like);
        txtlike = itemView.findViewById(R.id.txt_like);
        mainImage = itemView.findViewById(R.id.mainImage);


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
