package es.uah.matcomp.ed.e1.Diccionarios;

public class ElementoDoble<T> {
    private T dato;
    private ElementoDoble<T> anterior ;
    private ElementoDoble<T> siguiente;

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setAnterior(ElementoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(ElementoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public ElementoDoble<T> getAnterior() {
        return anterior;
    }

    public ElementoDoble<T> getSiguiente() {
        return siguiente;
    }



    public ElementoDoble(T dato) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;


    }
}
