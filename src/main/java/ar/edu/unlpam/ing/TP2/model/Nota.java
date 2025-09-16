package ar.edu.unlpam.ing.TP2.model;

import java.sql.Date;

public class Nota {
    private static int nextId = 0;
    private int id;
    private String titulo;
    private String contenido;
    private Date fechaCreacion;

    public Nota(String titulo, String contenido) {
        this.id = nextId++;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = new Date(System.currentTimeMillis());
    }


    public int getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getContenido(){
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public Date getFechaCreacion(){
        return fechaCreacion;
    }
}