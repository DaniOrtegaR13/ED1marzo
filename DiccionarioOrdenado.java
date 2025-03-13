package es.uah.matcomp.ed.e1.Diccionarios;


public class DiccionarioOrdenado<K,V> {
    private ListaDoblementeEnlazada<ElementoDiccionario<K,V>> lista;

    public DiccionarioOrdenado() {
        this.lista = new ListaDoblementeEnlazada<>();
    }

    public void add(K clave, V valor) {
        ElementoDiccionario<K,V> elemento = new ElementoDiccionario<>(clave, valor);
        ElementoDoble<ElementoDiccionario<K,V>> actual = lista.getCabeza();

        while(actual != null && actual.getDato().getClave().compareTo(clave) < 0) {
            actual = actual.getSiguiente();
        }

        if(actual != null && actual.getDato().getClave().equals(clave)) {
            actual.getDato().setValor(valor);
        } else {
            lista.insertar(actual != null ? actual.getAnterior() : null, elemento);
        }
    }

    public V get(K clave) {
        ElementoDoble<ElementoDiccionario<K,V>> actual = lista.getCabeza();
        while(actual != null) {
            if(actual.getDato().getClave().equals(clave)) {
                return actual.getDato().getValor();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public boolean delete(K clave) {
        ElementoDoble<ElementoDiccionario<K,V>> actual = lista.getCabeza();
        while(actual != null) {
            if(actual.getDato().getClave().equals(clave)) {
                lista.delete(actual.getDato());
                return true;
            }
            actual = actual.getSiguiente();
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

