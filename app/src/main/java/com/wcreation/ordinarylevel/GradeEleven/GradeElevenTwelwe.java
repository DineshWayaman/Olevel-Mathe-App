package com.wcreation.ordinarylevel.GradeEleven;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


import com.wcreation.ordinarylevel.R;

public class GradeElevenTwelwe extends AppCompatActivity {

    private WebView webView;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_eleven_twelwe);


        webView = findViewById(R.id.web);
        progressBar = findViewById(R.id.progressBar);



        progressBar.setMax(100);
        progressBar.setVisibility(View.VISIBLE);

        webView.loadUrl("https://drive.google.com/open?id=1QjMaSPqHcYInl7-IEM1JKXYW84EONyDI");
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

}
