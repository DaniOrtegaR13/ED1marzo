package es.uah.matcomp.ed.e1.PilasyColas;


import es.uah.matcomp.ed.e1.ListaSimplementeEnlazada.IteradorSE;

public interface ListaSE<T> {
    T getDatoCabeza();

    boolean add(T elemento);
    boolean delete(T elemento);
    Iterador2SE<T> getIterador();
    int getNumElementos();
    boolean PrimerElemento(T dato);



}