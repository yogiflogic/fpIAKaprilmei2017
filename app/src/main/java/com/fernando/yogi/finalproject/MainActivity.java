package com.fernando.yogi.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout buahalpukat,buahanggur,buaharbei,buahbelimbing,buahbengkoang,buahblueberry,
                buahjeruk,buahkelapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindingData();

        buahalpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Alpukat.class);
                startActivity(intentActivity);
            }
        });


        buahanggur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Anggur.class);
                startActivity(intentActivity);
            }
        });

        buaharbei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Arbei.class);
                startActivity(intentActivity);
            }
        });

        buahbelimbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Belimbing.class);
                startActivity(intentActivity);
            }
        });

        buahbengkoang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Bengkoang.class);
                startActivity(intentActivity);
            }
        });

        buahblueberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Blueberry.class);
                startActivity(intentActivity);
            }
        });

        buahjeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Jeruk.class);
                startActivity(intentActivity);
            }
        });;

        buahkelapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity = new Intent(MainActivity.this, Kelapa.class);
                startActivity(intentActivity);
            }
        });



    }

    public void bindingData() {
        buahalpukat = (LinearLayout) findViewById(R.id.lytalpukat);
        buahanggur = (LinearLayout) findViewById(R.id.lytanggur);
        buaharbei = (LinearLayout) findViewById(R.id.lytarbei);
        buahbelimbing = (LinearLayout) findViewById(R.id.lytbelimbing);
        buahbengkoang = (LinearLayout) findViewById(R.id.lytbengkoang);
        buahblueberry = (LinearLayout) findViewById(R.id.lytblueberry);
        buahjeruk = (LinearLayout) findViewById(R.id.lytjeruk);
        buahkelapa = (LinearLayout) findViewById(R.id.lytkelapa);

    }

    public interface userDao{

    }

}