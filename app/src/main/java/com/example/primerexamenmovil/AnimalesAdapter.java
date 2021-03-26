package com.example.primerexamenmovil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class AnimalesAdapter extends RecyclerView.Adapter<AnimalesAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo, descripcion, url;
        ImageView fotoAnimal;
        public ViewHolder(View itemView){
            super(itemView);
            titulo = itemView.findViewById(R.id.tvTitulo);
            descripcion = itemView.findViewById(R.id.tvDescripcion);
            fotoAnimal = itemView.findViewById(R.id.imgAnima);
        }
    }
    public List<AnimalModelo> listaAnimales;
    //Generar el constructor de la lista creada para que pueda recibir los valores
    public AnimalesAdapter(List<AnimalModelo> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.
                        from(parent.getContext()).
                        inflate(R.layout.lista_animales,parent,false); ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(listaAnimales.get(position).getTitulo());
        holder.descripcion.setText(listaAnimales.get(position).getDescripcion());
        holder.fotoAnimal.setImageResource(listaAnimales.get(position).getImagenAnimal());
    }

    @Override
    public int getItemCount() {
        return listaAnimales.size();
    }





}
