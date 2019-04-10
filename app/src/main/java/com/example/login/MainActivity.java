package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.List.PostListAct;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    Button loggin,signup;
    EditText user,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loggin = findViewById(R.id.btn_Login);
        signup = findViewById(R.id.btnSignup);
        user = findViewById(R.id.txtUser);
        pass = findViewById(R.id.txtPass);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(this, "Onresume", Toast.LENGTH_SHORT).show();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String us = user.getText().toString();
               String pa = pass.getText().toString();

                Intent j = new Intent(MainActivity.this,SignupPage.class);
                j.putExtra("u",user.getText().toString());
                j.putExtra("p",pass.getText().toString());


                startActivity(j);


            }
        });

        loggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(MainActivity.this,"Click", Toast.LENGTH_SHORT).show();
                String u = user.getText().toString();
                String p = pass.getText().toString();

                if(u.equals("admin")&&p.equals("admin"))
                {
                    Intent i = new Intent(MainActivity.this, PostListAct.class);


//                    Toast.makeText(MainActivity.this,"Succes!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this,"Wrong usernam or password", Toast.LENGTH_SHORT).show();
                }

            }
        }
        );
    }
}
