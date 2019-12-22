package com.fernando.yogi.finalproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

/**
 * Created by xxxx on 19/05/2017.
 */

public class Splashscreen extends AppCompatActivity {
    //Set waktu lama splashscreen
    private static final int SPLASH_TIME = 3 * 1000;// Set waktu 3 Detik
    ProgressBar prg;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);//layout yang diload

        prg = (ProgressBar) findViewById(R.id.progressBar1);//Tampilan progress Bar
        prg.setAlpha(SPLASH_TIME);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, SPLASH_TIME);
    }
}
