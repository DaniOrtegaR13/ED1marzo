package es.uah.matcomp.ed.e1.LIstaBAsica;

public class TestListaBasica {



        public static void main(String[] args) {
            ListaBasica<String> lista = new ListaBasica<>(10);

            lista.add("Elemento 1");
            lista.add("Elemento 2");
            lista.add("Elemento 3");

            Iterador<String> iterador = lista.getIterador();

            while(iterador.hasNext()){
                String valor = iterador.next();
                if(valor != null){
                    System.out.println("Valor: " + valor);
                }

                if("Elemento 3".equals(valor)){
                    iterador.delete();
                }
            }

            System.out.println("Tamaño de la lista: " + lista.getNumElementos());
        }
    }

