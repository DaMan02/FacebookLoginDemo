package com.dayal.facebooklogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private String postUrl = "https://api.androidhive.info/webview/index.html";
    private WebView webView;
    private ImageView imgHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(MainActivity.this,LoginActivity.class));
//
//        webView = (WebView) findViewById(R.id.webView);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl(postUrl);
//        webView.setHorizontalScrollBarEnabled(false);
    }


}
