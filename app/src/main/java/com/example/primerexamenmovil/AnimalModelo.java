package com.example.primerexamenmovil;

public class AnimalModelo {
    private String titulo, descripcion, urlVideo;
    private int imagenAnimal;
    public AnimalModelo() {
    }
    public AnimalModelo(String titulo, String descripcion, String urlVideo, int imagenAnimal) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlVideo = urlVideo;
        this.imagenAnimal = imagenAnimal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagenAnimal() {
        return imagenAnimal;
    }

    public void setImagenAnimal(int imagenAnimal) {
        this.imagenAnimal = imagenAnimal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
}
