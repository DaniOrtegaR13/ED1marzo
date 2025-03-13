package es.uah.matcomp.ed.e1.Diccionarios;

// Las clases estaban

import es.uah.matcomp.ed.e1.ListaDoblementeEnlazada.ElementoDoble;
import es.uah.matcomp.ed.e1.ListaDoblementeEnlazada.IteradorDE;

public interface ListaDE<T> {
    boolean add(T elemento);

    boolean delete(T elemento);

    IteradorDE<T> getIteradorDE();

    int getNumElementos();


    void insert(ElementoDoble<T> elemento, T dato);

}