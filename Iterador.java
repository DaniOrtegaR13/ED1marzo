package es.uah.matcomp.ed.e1.Diccionarios;


interface Iterador<T> {


    boolean hasNext();

    T next();

    void delete();
}

