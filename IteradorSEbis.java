package es.uah.matcomp.ed.e1.ListaSimplementeEnlazada;

public class IteradorSEbis<T> implements IteradorSE<T> {
    public class Iterador {
        private ListaSimplementeEnlazada.Elemento<T> actual;


        public Iterador(ListaSimplementeEnlazada.Elemento<T> cabeza) {
            this.actual = cabeza;
        }

        public boolean hasNext() {
            return actual != null;
        }

        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No hay más elementos.");
            }
            T dato = actual.dato;
            actual = actual.siguiente;
            return dato;
        }
        public void delete() {}
        //flta el void delete
    }

}
