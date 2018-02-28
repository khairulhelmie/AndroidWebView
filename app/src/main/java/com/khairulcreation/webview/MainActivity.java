package com.khairulcreation.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webb = (WebView)findViewById(R.id.web1);
        webb.setWebViewClient(new WebViewClient());
        webb.getSettings().getBuiltInZoomControls();
        webb.loadUrl("https://khairulcreation.000webhostapp.com/Main%20Page.html");



    }
}


