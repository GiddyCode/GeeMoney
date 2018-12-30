package com.example.root.geemoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class SecondActivity extends AppCompatActivity {

    private Button interstitialAdsBtn;
    private Button buttonMovingOn;
    private InterstitialAd mInterstitialAd;
    private InterstitialAd mInterstitialAd1;
    private InterstitialAd mInterstitialAd2;
    private InterstitialAd mInterstitialAd3;
    private InterstitialAd mInterstitialAd4;
    private InterstitialAd mInterstitialAd5;
    private InterstitialAd mInterstitialAd6;
    private InterstitialAd mInterstitialAd7;
    private InterstitialAd mInterstitialAd8;
    private InterstitialAd mInterstitialAd9;
    private InterstitialAd mInterstitialAd10;
    private InterstitialAd mInterstitialAd11;


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
        setContentView(R.layout.activity_second);


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



        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd1 = new InterstitialAd(this);
        mInterstitialAd1.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd1.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd2 = new InterstitialAd(this);
        mInterstitialAd2.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd2.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd3 = new InterstitialAd(this);
        mInterstitialAd3.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd3.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd4 = new InterstitialAd(this);
        mInterstitialAd4.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd4.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd5 = new InterstitialAd(this);
        mInterstitialAd5.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd5.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd6 = new InterstitialAd(this);
        mInterstitialAd6.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd6.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd7 = new InterstitialAd(this);
        mInterstitialAd7.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd7.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd8 = new InterstitialAd(this);
        mInterstitialAd8.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd8.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd9 = new InterstitialAd(this);
        mInterstitialAd9.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd9.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd10 = new InterstitialAd(this);
        mInterstitialAd10.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd10.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd11 = new InterstitialAd(this);
        mInterstitialAd11.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd11.loadAd(new  AdRequest.Builder().build());




        interstitialAdsBtn = (Button) findViewById(R.id.interstitialAdsBtn);


        interstitialAdsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd1.isLoaded()) {
                    mInterstitialAd1.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd2.isLoaded()) {
                    mInterstitialAd2.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd3.isLoaded()) {
                    mInterstitialAd3.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd4.isLoaded()) {
                    mInterstitialAd4.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd5.isLoaded()) {
                    mInterstitialAd5.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd6.isLoaded()) {
                    mInterstitialAd6.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd7.isLoaded()) {
                    mInterstitialAd7.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd8.isLoaded()) {
                    mInterstitialAd8.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd9.isLoaded()) {
                    mInterstitialAd9.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd10.isLoaded()) {
                    mInterstitialAd10.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                if (mInterstitialAd11.isLoaded()) {
                    mInterstitialAd11.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
        });
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                //load the next interstitial ad
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });



        Button ButtonMoingOn = (Button) findViewById(R.id.moving_on_btn);
        ButtonMoingOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movingOn = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(movingOn);
            }
        });



    }
}
