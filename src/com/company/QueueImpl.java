package com.company;


import java.util.LinkedList;
import java.util.Queue;


public abstract class QueueImpl implements Queue {

    public QueueImpl(){

    }
 // creamos cola de objetos//
    Queue<Objetos> micola = new LinkedList<Objetos>() {

    };
  // añadir objeto
    public void añadirObjeto(Objetos o) {

        micola.add(o);

    }
// quitar objeto
    public void eliminarCola() {

         micola.poll();

    }




}