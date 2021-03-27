package com.example.primerexamenmovil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvAnimales;
    private AnimalesAdapter adapterAnimales;
    private CardView card;
    private Repositorio repo = new Repositorio();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // nuestro layout
        rcvAnimales = findViewById(R.id.rcvLista);

        //Definir la forma de la lista vertical, similar a la de un
        // ListView
        rcvAnimales.setLayoutManager(new LinearLayoutManager(this));

        //Asignar la información al Recycler de nuestro Layout
        adapterAnimales = new AnimalesAdapter(repo.getAnimales());
        rcvAnimales.setAdapter(adapterAnimales);

        rcvAnimales.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(),
                rcvAnimales, new RecyclerItemClickListener.OnItemClickListener() {


            @Override
            public void onItemClick(View view, int position) {
                Context context = rcvAnimales.getContext();
                Intent detalle = new Intent(context, actividy_detalle_final.class);
                detalle.putExtra("posicion",String.valueOf(position));
                startActivity(detalle);
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        }));
    }
        //mostrar y ocultar menu overflow
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuoverflow,menu);
        return true;
    }
    //Metodo ara los item del menu
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        //Obtener el item seleccionado
        int id = item.getItemId();

        if (id == R.id.itIntegrantes) {
            Intent integrantes = new Intent(MainActivity.this,Integrantes.class );
            startActivity(integrantes);
        }

        return super.onOptionsItemSelected(item);
    }
}