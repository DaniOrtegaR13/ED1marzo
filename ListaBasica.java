package es.uah.matcomp.ed.e1.LIstaBAsica;


    public class ListaBasica<T> implements Lista<T> {
        public T[] elementos;
        private int tamaño;

        public ListaBasica(int numElementos) {
            elementos = (T[]) new Object[10]; //array inicial de tamaño 10
            tamaño = 0;
        }


        public boolean add (T elemento){
            if(tamaño == elementos.length){
                //elementos = Arrays.copyOf(elementos, (elementos.length * 2));
                T[] nuevoArray = (T[]) new Object[elementos.length * 2];

                //copiar los elementos uno a uno al nuevo array
                for(int i = 0; i < elementos.length; i++){
                    nuevoArray[i] = elementos[i];
                }

                //reemplazar el array que teniamos por el nuevo
                elementos = nuevoArray;
            }

            elementos[tamaño++] = elemento;

            return true;
        }

        public boolean delete(T elemento){
            for(int i = 0; i < elementos.length; i++){
                if(elementos[i].equals(elemento)){
                    for(int j = i; j < elementos.length - 1; j++){
                        elementos[j] = elementos[j + 1]; //desplazamiento izquierda
                    }

                    elementos[--tamaño] = null; //reduciendo el tamaño del array
                    return true;
                }
            }

            return false;
        }

        public Iterador<T> getIterador(){
            return new Iterador<>(this);
        }

        public int getNumElementos(){
            return this.tamaño;
        }
    }




