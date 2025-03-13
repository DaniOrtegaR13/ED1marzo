package es.uah.matcomp.ed.e1.PilasyColas;



    public class Pila<T> {
        private ListaSimplementeEnlazada2<T> lista;

        public Pila(){
            lista = new ListaSimplementeEnlazada2<>();
        }

        public void push(T elemento){
            ListaSimplementeEnlazada2.Elemento<T> nuevoElemento = new ListaSimplementeEnlazada2.Elemento<>(elemento);
            nuevoElemento.siguiente = lista.getCabeza();
            lista.setCabeza(nuevoElemento);
            lista.incrementarElementos();
        }

        public T pop(){

            if(lista.getCabeza() == null) return null;

            T dato = lista.getCabeza().dato;
            lista.setCabeza(lista.getCabeza().siguiente);
            lista.decrementarElementos();
            return dato;
        }

        public int size(){
            return lista.getNumElementos();
        }

        public void mostrar(){
            lista.mostrarElementos();
        }
    }

