package lse;

public class Nodo {
    Object dato;
    Nodo siguiente;


    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    public Object getDato(){
        return dato;
    }
    public void setDato(){
        this.dato = dato;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(){
        this.siguiente = siguiente;
    }

    public void setSiguiente(Nodo nuevo) {
    }
}
