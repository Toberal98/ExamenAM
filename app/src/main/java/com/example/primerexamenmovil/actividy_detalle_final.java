package com.example.primerexamenmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        titulo = (TextView)findViewById(R.id.tvTituloDetalle);
        descripcion = (TextView)findViewById(R.id.tvDescripcionDetalle);
        imagen = (ImageView)findViewById(R.id.ivImagenDetalle);
        boton = (Button)findViewById(R.id.btnVideo);

        lista = repo.getAnimales();
        Bundle bundle = getIntent().getExtras();
        int position = Integer.parseInt(bundle.getString("posicion"));

        animal = lista.get(position);

        titulo.setText(animal.getTitulo());
        descripcion.setText(animal.getDescripcion());
        imagen.setImageResource(animal.getImagenAnimal());
        boton.setText("Ver video sobre los " + animal.getTitulo());
    }
}