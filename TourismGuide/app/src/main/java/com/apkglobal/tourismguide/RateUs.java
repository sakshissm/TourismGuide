package com.apkglobal.tourismguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RateUs extends AppCompatActivity {
     WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
        webview=(WebView)findViewById(R.id.Web);
        webview.loadUrl("https://www.google.com/");
    }
}
