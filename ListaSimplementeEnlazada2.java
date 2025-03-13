package es.uah.matcomp.ed.e1.PilasyColas;


import es.uah.matcomp.ed.e1.ListaSimplementeEnlazada.IteradorSE;

public class  ListaSimplementeEnlazada2<T> implements ListaSE<T> {
        private Elemento<T> cabeza;
        private int numElementos;
        private int T_max;
        private T[] elementos;



        public ListaSimplementeEnlazada2() {
            this.cabeza = null;}

        public static class Elemento<T> {
            public T dato;
            public Elemento<T> siguiente;

            public Elemento(T dato) {
                this.dato = dato;
                this.siguiente = null;

            }

            public T getDato(){
                return dato;
            }

            public Elemento<T> getSiguiente(){
                return siguiente;
            }

            public void setSiguiente(Elemento<T> siguiente){
                this.siguiente = siguiente;
            }
        }

        @Override
        public T getDatoCabeza(){
            return (cabeza != null) ? cabeza.getDato() : null;
        }
        public Elemento<T> getSiguiente(){
            return cabeza.getSiguiente();
        }
        public void setSiguiente(Elemento<T> siguiente){
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
        public Iterador2SE<T> getIterador() {
            return new IteradorListaSE<>(this);
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

        public void mostrarElementos(){
            Elemento<T> actual = cabeza;
            while(actual != null){
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            }
        }
    }



