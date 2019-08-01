package com.dk.dk;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpleshScreen extends AppCompatActivity {
        private int waktu_loading=4000;

        //4000=4 detik

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splesh_screen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    //setelah loading maka akan langsung berpindah ke home activity
                    Intent home=new Intent(SpleshScreen.this,CardView.class);
                    startActivity(home);
                    finish();

                }
            },waktu_loading);
        }
    }