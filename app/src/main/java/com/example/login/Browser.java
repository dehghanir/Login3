package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

//public class Browser extends AppCompatActivity {
public class Browser extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        String url="http://pgu.hs";
        WebView myWebView = (WebView) findViewById(R.id.wv);

        myWebView.loadUrl(url);

        myWebView.clearCache(true);

        myWebView.clearHistory();

//
//        vistaWeb.getSettings().setJavaScriptEnabled(true);
//
//        vistaWeb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        myWebView.setWebViewClient(new WebViewClient(){
            @Override public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Toast.makeText(Browser.this, url, Toast.LENGTH_SHORT).show();
                if (url.endsWith(".mp4")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(Uri.parse(url), "video/mp4"); view.getContext().startActivity(intent);
                }
                else {
                    view.loadUrl(url);
                } return true;
            }
            public void onPageFinished(WebView view, String url)
            {
                //Toast.makeText(myActivity.this, "صفحه لود شد", Toast.LENGTH_SHORT).show();
            }
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
            {
                Toast.makeText(Browser.this, description, Toast.LENGTH_SHORT).show();
                // خطایی اتفاق افتاد
            }
        });


    }
}
