package com.example.primerexamenmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        video.findViewById(R.id.wvVideos);
        String html = "";
        html += "<html lang=\"en\" dir=\"ltr\">\n" +
                "  <body>\n" +
                "      <iframe src=\""+ url +"\" width=\"100%\" height=\"100%\" frameborder=\"0\"></iframe>\n" +
                "  </body>\n" +
                "</html>";
        video.loadData(html, "text/html", "utf-8" );
    }
}