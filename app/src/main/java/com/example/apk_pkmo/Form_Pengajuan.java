package com.example.apk_pkmo;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.apk_pkmo.R;

public class Form_Pengajuan extends AppCompatActivity {
    WebView webViewku;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_pengajuan);

        webViewku = (WebView)findViewById(R.id.WebView1);
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
        webViewku.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf3_Ys4IZZuY-ISuGLPMCfSubEfVsV-pTQj29lD2tQkQ_lfEA/viewform?usp=sf_link");


    }
}