package es.uah.matcomp.ed.e1.LIstaBAsica;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void delete();
}
