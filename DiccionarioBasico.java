package es.uah.matcomp.ed.e1.Diccionarios;


import es.uah.matcomp.ed.e1.Diccionarios.ListaDoblementeEnlazada;
import es.uah.matcomp.ed.e1.Diccionarios.IteradorDEbis;

public class DiccionarioBasico<K,V> {
    private ListaDoblementeEnlazada<ElementoDiccionario<K,V>> lista;

    public DiccionarioBasico() {
        this.lista = new ListaDoblementeEnlazada<>();
    }

    public void add(K clave, V valor){
        ElementoDiccionario<K,V> elemento = new ElementoDiccionario<>(clave, valor);
        IteradorDEbis<ElementoDiccionario<K,V>> iterador = lista.getIteradorDE();
        while(iterador.hasNext()){
            ElementoDiccionario<K,V> actual = iterador.next();
            if(actual.getClave().equals(clave)){
                actual.setValor(valor);
                return;
            }
        }
        lista.add(elemento);
    }

    public V get(K clave){
        IteradorDEbis<ElementoDiccionario<K,V>> iterador = lista.getIteradorDE();
        while(iterador.hasNext()){
            ElementoDiccionario<K,V> actual = iterador.next();
            if(actual.getClave().equals(clave)){
                return actual.getValor();
            }
        }
        return null;
    }

    public boolean delete(K clave){
        IteradorDEbis<ElementoDiccionario<K,V>> iterador = lista.getIteradorDE();
        while(iterador.hasNext()){
            ElementoDiccionario<K,V> actual = iterador.next();
            if(actual.getClave().equals(clave)){
                iterador.delete(actual);
                return true;
            }
        }

        return false;
    }

    public int size(){
        return lista.size();
    }

    public void mostrar(){
        lista.mostrarElementos();
    }
}
