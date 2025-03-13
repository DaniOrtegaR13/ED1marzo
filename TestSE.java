package es.uah.matcomp.ed.e1.ListaSimplementeEnlazada;

public class TestSE {
    public static<T> void main(String[] args){

        ListaSimplementeEnlazada<T> lista = new ListaSimplementeEnlazada<>();


        IteradorSE<T> r1 = lista.getIterador();
        System.out.println(r1);




    }

}
