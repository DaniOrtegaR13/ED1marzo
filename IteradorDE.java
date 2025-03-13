package es.uah.matcomp.ed.e1.ListaDoblementeEnlazada;

public interface  IteradorDE<T> {
    public boolean hasNext();
    public boolean hasPrevious();
    public T next();
    public T previous();
    public void delete();

}
