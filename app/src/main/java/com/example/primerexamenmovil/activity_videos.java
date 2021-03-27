package com.example.primerexamenmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class activity_videos extends AppCompatActivity {
        WebView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        // recibimos los datos
        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");
        video = (WebView) findViewById(R.id.wvVideos);
        WebSettings webSettings = video.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String html = "";
        html += "<html lang=\"en\" dir=\"ltr\">\n" +
                "  <body>\n" +
                "<iframe width=\"100%\" height=\"315\" src=\""+url+"\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>" +
                "  </body>\n" +
                "</html>";
        video.loadData(html, "text/html", "utf-8" );
    }
}