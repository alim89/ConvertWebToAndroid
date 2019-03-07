package com.example.a20140550.convertwebtoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private WebView webViewa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webViewa= (WebView) findViewById(R.id.webid);

        WebSettings ws=webViewa.getSettings();
        ws.setJavaScriptEnabled(true);
        webViewa.setWebViewClient(new WebViewClient());

        webViewa.loadUrl("http://www.pust.ac.bd/");


    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        if(webViewa.canGoBack())
        {
            webViewa.goBack();
        }
        else
        {

            super.onBackPressed();
        }
    }

}
