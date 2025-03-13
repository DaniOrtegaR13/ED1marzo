package es.uah.matcomp.ed.e1.Diccionarios;

import es.uah.matcomp.ed.e1.ListaDoblementeEnlazada.ElementoDoble;
import es.uah.matcomp.ed.e1.ListaDoblementeEnlazada.IteradorDE;

public class IteradorDEbis<T> implements IteradorDE<T> {

    private ElementoDoble<T> actual;

    public IteradorDEbis(ElementoDoble<T> actual) {
        this.actual = actual;
    }

    public boolean hasNext() {
        return actual != null && actual.getSiguiente() != null;
    }


    public boolean hasPrevious() {
        return actual != null && actual.getAnterior() != null;
    }


    public T next() {
        if (actual != null) {
            T dato = actual.getDato();
            actual = actual.getSiguiente();
            return dato;
        }
        return null;
    }

    public T previous() {
        if (actual != null) {
            T dato = actual.getDato();
            actual = actual.getAnterior();
            return dato;
        }
        return null;
    }

    @Override
    public void delete() {
        if (actual != null) {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(actual.getAnterior());
        }
    }
}
