package com.wcreation.ordinarylevel.ModelPapers;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.ads.*;


import com.wcreation.ordinarylevel.R;

public class ModelPaper1Part1Answer extends AppCompatActivity {


    private WebView webView;
    private ProgressBar progressBar;
    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_paper1_part1_answer);



        webView = findViewById(R.id.web);
        progressBar = findViewById(R.id.progressBar);



        progressBar.setMax(100);
        progressBar.setVisibility(View.VISIBLE);

        webView.loadUrl("https://drive.google.com/open?id=1xVWBel8HvnbTEDHxOk1vPXPRiIT7DiCW");
        //http://paperlanka.epizy.com/?i=1
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                progressBar.setVisibility(View.VISIBLE);
                setTitle("Loading Lesson..");
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {

                progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
                super.onPageFinished(view, url);
            }
        });


        AudienceNetworkAds.initialize(this);

        adView = new AdView(this, "1082372565497270_1082373332163860", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


    }


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}

