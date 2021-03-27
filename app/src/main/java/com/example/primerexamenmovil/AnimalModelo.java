package com.example.primerexamenmovil;

public class AnimalModelo {
    private String titulo;
    private String descripcionCorta;
    private String urlVideo;
    private String descripcionLarga;
    private int imagenAnimal;
    public AnimalModelo() {
    }
    public AnimalModelo(String titulo, String descripcionCorta,String descripcionLarga, String urlVideo, int imagenAnimal) {
        this.titulo = titulo;
        this.descripcionCorta = descripcionCorta;
        this.urlVideo = urlVideo;
        this.imagenAnimal = imagenAnimal;
        this.descripcionLarga = descripcionLarga;
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

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }
}
