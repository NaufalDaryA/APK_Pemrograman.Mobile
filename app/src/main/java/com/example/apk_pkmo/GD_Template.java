package com.example.apk_pkmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.apk_pkmo.R;

public class GD_Template extends AppCompatActivity {
    WebView webViewku;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gd_template);

        webViewku = (WebView)findViewById(R.id.WebView3);
        webViewku.getSettings().setLoadsImagesAutomatically(true);
        webViewku.getSettings().setJavaScriptEnabled(true);
        webViewku.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        webViewku.getSettings().setSupportZoom(true);
        webViewku.getSettings().setBuiltInZoomControls(true);
        webViewku.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        webViewku.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


        webViewku.setWebViewClient(new WebViewClient());
        webViewku.loadUrl("https://drive.google.com/drive/folders/1DcGpTbcFox8hTMRno9O6bi_iK-9Y4xCq?usp=sharing");


    }
}
