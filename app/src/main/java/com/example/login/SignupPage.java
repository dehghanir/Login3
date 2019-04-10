package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignupPage extends AppCompatActivity {

    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        user = findViewById(R.id.u);
        pass = findViewById(R.id.p);

        String u = getIntent().getExtras().getString("u");
        String p = getIntent().getExtras().getString("p");

        user.setText(u);
        pass.setText(p);


    }
}
