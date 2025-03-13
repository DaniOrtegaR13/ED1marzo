package es.uah.matcomp.ed.e1.Diccionarios;


import es.uah.matcomp.ed.e1.LIstaBAsica.Iterador;

interface Diccionario<K, V> {
    boolean add (K clave, V valor);
    boolean delete (K clave);
    Iterador<ElementoDiccionario<K,V>> getIterador ();
    boolean exists(K clave);
    V get(K clave);
    int getNumElementos();
}
