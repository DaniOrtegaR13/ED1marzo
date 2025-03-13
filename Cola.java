package es.uah.matcomp.ed.e1.PilasyColas;


    import es.uah.matcomp.ed.e1.PilasyColas.ListaSimplementeEnlazada2;

    public class Cola<T> {
        private ListaSimplementeEnlazada2<T> lista;

        public Cola(){
            lista = new ListaSimplementeEnlazada2<>();
        }

        public T enqueue(T elemento){
            lista.add(elemento);
            lista.incrementarElementos();
            return elemento;
        }

        public T dequeue(){
            if(lista.getCabeza()== null) return null;

            T dato = lista.getDatoCabeza();
            lista.setCabeza(lista.getSiguiente());
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



