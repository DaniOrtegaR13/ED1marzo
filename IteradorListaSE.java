package es.uah.matcomp.ed.e1.PilasyColas;

public class IteradorListaSE<T> implements Iterador2SE<T>{
    private ListaSimplementeEnlazada2.Elemento<T> actual;
    private ListaSimplementeEnlazada2<T> lista;
    private ListaSimplementeEnlazada2.Elemento<T> anterior;

    public IteradorListaSE(ListaSimplementeEnlazada2<T> lista){
        this.lista = lista;
        this.actual = lista.getCabeza();
        this.anterior = null;
    }

    @Override
    public boolean hasNext(){
        return actual != null;
    }

    @Override
    public T next(){
        if(!hasNext()) return null;
        T dato = actual.getDato();
        anterior = actual;
        actual = actual.getSiguiente();
        return dato;
    }

    public void delete(){
        if(anterior != null){
            lista.delete(anterior.getDato());
            anterior = null;
        }
    }

}
