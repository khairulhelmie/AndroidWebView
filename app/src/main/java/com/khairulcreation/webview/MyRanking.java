package com.khairulcreation.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyRanking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ranking);

        WebView webb = (WebView)findViewById(R.id.web1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("https://fifamyranking.blogspot.my/?m=0");



    }
}