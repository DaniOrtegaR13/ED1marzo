package es.uah.matcomp.ed.e1.Diccionarios;

import es.uah.matcomp.ed.e1.Diccionarios.ListaDE;

    public class ListaDoblementeEnlazada<T> implements ListaDE<T> {


        private ElementoDoble<T> cabeza;
        private ElementoDoble<T> cola;
        private int numElementos;

        public ListaDoblementeEnlazada() {
            this.cabeza = null;
            this.cola = null;
            this.numElementos = 0;
        }

        @Override
        public boolean add(T elemento) {
            ElementoDoble<T> nuevoElemento = new ElementoDoble<>(elemento);
            if (cabeza == null) {
                cabeza = nuevoElemento;
                cola = nuevoElemento;
            } else {
                cola.setSiguiente(nuevoElemento);
                nuevoElemento.setAnterior(cola);
                cola = nuevoElemento;
            }
            numElementos++;
            return true;
        }

        @Override
        public boolean delete(T elemento) {
            if (cabeza == null) {
                return false;
            }
            ElementoDoble<T> actual = cabeza;
            while (actual != null) {
                if (actual.getDato().equals(elemento)) {
                    if (actual.getAnterior() != null) {
                        actual.getAnterior().setSiguiente(actual.getSiguiente());
                    } else {
                        cabeza = actual.getSiguiente();
                    }
                    if (actual.getSiguiente() != null) {
                        actual.getSiguiente().setAnterior(actual.getAnterior());
                    } else {
                        cola = actual.getAnterior();
                    }
                    numElementos--;
                    return true;
                }
                actual = actual.getSiguiente();
            }
            return false;
        }

        public ElementoDoble<T> getCabeza(){
            return cabeza;
        }



        @Override
        public IteradorDEbis<T> getIteradorDE() {
            return new IteradorDEbis<T>(this.cabeza);
        }


        @Override
        public int getNumElementos() {
            return numElementos;
        }

        @Override
        public void insert(ElementoDoble<T> elemento, T dato) {
            //insertamos dato después de elemento
            ElementoDoble<T> nuevoElemento = new ElementoDoble<>(dato);
            if (elemento == null) {
                add(dato);
            } else {
                nuevoElemento.setSiguiente(elemento.getSiguiente());
                nuevoElemento.setAnterior(elemento);
                elemento.setSiguiente(nuevoElemento);
                if (elemento == cola) {
                    cola = nuevoElemento;
                }
                numElementos++;
            }
        }

        public interface IteradorDE<T> {
            boolean hasNext();
            boolean hasPrevious();
            T next();
            T previous();
            void delete();
        }
    }

