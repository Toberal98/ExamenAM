package com.example.primerexamenmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Integrantes extends AppCompatActivity {

    //Se declara objeto
    WebView html;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrantes);

        //Se vincula el webview al layout
        html = findViewById(R.id.wvContenido);

        String texto;
        texto = "<html><body>";
        texto+="<div style=\"border-radius: 25px; border-style:solid;background-color: #D66148; ";
        texto+="padding: 60px;border-width: 2px\">";
        texto+="<p align=\"justify\">";
        texto+="<h2>";
        texto+="Integrantes del Grupo: <br/ >";
        texto+="</h2>";
        texto+="<p >";
        texto+="--------DS39-----------<br/ >";
        texto+="Oscar Alfredo Caceres Hernandez <br/ >";
        texto+="Douglas Alberto Menjivar Quiterio<br/ >";
        texto+="Oscar Napoleon Saenz Quintanilla<br/ >";
        texto+="<br><br><strong>Grupo</strong><br> DS39 </p>";
        texto+="<p><strong>2021</strong>";
        texto +="</p></div></body></html>";


        html.loadData(texto,"text/html","utf-8");

    }
}