package com.example.primerexamenmovil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class actividy_detalle_final extends AppCompatActivity {
    private List<AnimalModelo> lista = new ArrayList<>();
    private Repositorio repo = new Repositorio();
    private AnimalModelo animal;
    TextView titulo, descripcion;
    ImageView imagen;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividy_detalle_final);
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        titulo = (TextView)findViewById(R.id.tvTituloDetalle);
        descripcion = (TextView)findViewById(R.id.tvDescripcionDetalle);
        imagen = (ImageView)findViewById(R.id.ivImagenDetalle);
        boton = (Button)findViewById(R.id.btnVideo);

        lista = repo.getAnimales();
        Bundle bundle = getIntent().getExtras();
        int position = Integer.parseInt(bundle.getString("posicion"));

        animal = lista.get(position);

        titulo.setText(animal.getTitulo());
        descripcion.setText(animal.getDescripcionLarga());
        imagen.setImageResource(animal.getImagenAnimal());
        boton.setText("Ver video sobre " + animal.getTitulo());
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void abrirVideo(View view){
        Intent video = new Intent(actividy_detalle_final.this, activity_videos.class);
        video.putExtra("url", animal.getUrlVideo());
        startActivity(video);
    }
}