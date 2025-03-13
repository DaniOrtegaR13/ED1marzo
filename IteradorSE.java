package es.uah.matcomp.ed.e1.ListaSimplementeEnlazada;

public interface IteradorSE<T> {


    public boolean hasNext();
    public T next();
    public void delete();
}
