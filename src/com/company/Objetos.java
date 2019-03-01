package com.company;

public class Objetos {

    private String nombre;
    private int valor;



    public Objetos() {
    }


    public Objetos(String nombre, int valor){

        this.nombre = nombre;
        this.valor = valor;


    }

    public Objetos(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        valor = valor;
    }



}