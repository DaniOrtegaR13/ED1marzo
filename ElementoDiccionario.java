package es.uah.matcomp.ed.e1.Diccionarios;


public class ElementoDiccionario<K, V> {
    private K clave;
    private V valor;

    public ElementoDiccionario(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;

    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public boolean equals(Object o){
        if(o instanceof ElementoDiccionario<?,?> ed){
            return this.clave.equals(ed.getClave());
        }

        return false;
    }
}
