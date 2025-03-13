package es.uah.matcomp.ed.e1.ListaSimplementeEnlazada;


class Elemento<T> {
    private T dato;
    private Elemento<T> siguiente;
    private T[] elementos;


    public Elemento(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.elementos =(T[]) new Object();
    }





}

