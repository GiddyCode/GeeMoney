package com.example.root.geemoney;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {


    SwipeRefreshLayout swipeRefreshLayout;

    private Button mButton;

    private AdView mAdview;
    private AdView mAdview2;
    private AdView mAdview3;
    private AdView mAdview4;
    private AdView mAdview5;
    private AdView mAdview6;
    private AdView mAdview7;
    private AdView mAdview8;
    private AdView mAdview9;
    private AdView mAdview10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");




        mAdview = findViewById(R.id.adView);
        final AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        mAdview2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdview2.loadAd(adRequest2);

        mAdview3 = findViewById(R.id.adView3);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        mAdview3.loadAd(adRequest3);

        mAdview4 = findViewById(R.id.adView4);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        mAdview4.loadAd(adRequest4);

        mAdview5 = findViewById(R.id.adView5);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        mAdview5.loadAd(adRequest5);

        mAdview6 = findViewById(R.id.adView6);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        mAdview6.loadAd(adRequest6);

        mAdview7 = findViewById(R.id.adView7);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        mAdview7.loadAd(adRequest7);

        mAdview8 = findViewById(R.id.adView8);
        AdRequest adRequest8 = new AdRequest.Builder().build();
        mAdview8.loadAd(adRequest8);

        mAdview9 = findViewById(R.id.adView9);
        AdRequest adRequest9 = new AdRequest.Builder().build();
        mAdview9.loadAd(adRequest9);

        mAdview10 = findViewById(R.id.adView10);
        AdRequest adRequest10 = new AdRequest.Builder().build();
        mAdview10.loadAd(adRequest10);


        Button mButton =(Button) findViewById(R.id.lets_go);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mButton = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(mButton);

            }
        });

        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_layout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);

                    }
                }, 4000);
            }
        });


    }
}
