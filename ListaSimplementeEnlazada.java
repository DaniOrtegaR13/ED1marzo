package es.uah.matcomp.ed.e1.ListaSimplementeEnlazada;


import es.uah.matcomp.ed.e1.ListaSimplementeEnlazada.IteradorSE;
import es.uah.matcomp.ed.e1.ListaSimplementeEnlazada.ListaSE;
import es.uah.matcomp.ed.e1.PilasyColas.ListaSimplementeEnlazada2;

public class ListaSimplementeEnlazada<T> implements ListaSE<T> {
        public interface ListaSE<T> {
            boolean add(T elemento);
            boolean delete(T elemento);
            IteradorSE<T> getIteradorSE();
            int getNumElementos();
            boolean PrimerElemento(T dato);
        }
        private Elemento<T> cabeza;
        private int numElementos;
        private int T_max;
        private T[] elementos;



        public ListaSimplementeEnlazada() {
            this.cabeza = null;}

        static class Elemento<T> {
            T dato;
            Elemento<T> siguiente;

            public Elemento(T dato) {
                this.dato = dato;
                this.siguiente = null;

            }
            public T getDato(){
                return dato;
            }

            public ListaSimplementeEnlazada.Elemento<T> getSiguiente(){
                return siguiente;
            }

            public void setSiguiente(ListaSimplementeEnlazada.Elemento<T> siguiente){
                this.siguiente = siguiente;
            }
        }

            @Override
            public T getDatoCabeza(){
                return (cabeza != null) ? cabeza.getDato() : null;
            }
            public ListaSimplementeEnlazada.Elemento<T> getSiguiente(){
                return cabeza.getSiguiente();
            }
            public void setSiguiente(ListaSimplementeEnlazada.Elemento<T> siguiente){
                this.cabeza.setSiguiente(siguiente);
            }
        @Override
        public boolean add(T dato) {
            Elemento<T> nuevoElemento = new Elemento<>(dato);
            if (cabeza == null) {
                cabeza = nuevoElemento;
            } else {
                Elemento<T> actual = cabeza;


                while (actual.siguiente != null) {
                    actual = actual.siguiente;


                }
                actual.siguiente = nuevoElemento;

            }
            return false;

        }

        @Override
        public boolean delete(T elemento) {
            if (numElementos >= T_max || cabeza == null) {
                return false;
            }else {
                for(int i = 0; i < numElementos; i++) {
                    if(elementos[i] == elemento) {
                        for (int j = i; j < numElementos -1 ; j++) {
                            elementos[j] = elementos[j+1];

                        }
                        numElementos--;
                        return true;
                    }
                }

                return false;
            }

        }

        @Override
        public IteradorSE<T> getIterador() {
            return null;
        }

        @Override
        public int getNumElementos() {
            return numElementos;
        }

        @Override
        public boolean PrimerElemento(T dato) {

            if (numElementos >= T_max || elementos[0]  == null) {
                return false;
            }else{
                elementos[0] = dato;
                return true;
            }
        }

        public Elemento<T> getCabeza() {
            return cabeza;
        }

        public void setCabeza(Elemento<T> cabeza) {
            this.cabeza = cabeza;
        }

        public void incrementarElementos(){
            this.numElementos++;
        }

        public void decrementarElementos(){
            this.numElementos--;
        }

        public IteradorSE iterador() {
            return new IteradorSEbis();
        }
        public void mostrarElementos() {
            Elemento<T> actual = cabeza;
            while (actual != null) {
                System.out.print(actual.dato + "");
                actual = actual.siguiente;

            }
            System.out.println();
        }

    }



