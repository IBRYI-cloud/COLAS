import lse.ListaSimplementeEnlazada;
import pc.Cola;
import pc.Pila;

public class Main {
    public static void main(String [] args){
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        System.out.println(listaSimplementeEnlazada.estaVacia());
        //inster elementos a nuestra lista
        listaSimplementeEnlazada.insertar( 1);
        listaSimplementeEnlazada.insertar( 1);
        listaSimplementeEnlazada.insertar( 1);
       listaSimplementeEnlazada.insertar( 2);
        listaSimplementeEnlazada.insertar( 3);
       listaSimplementeEnlazada.insertar( 4);

       //mostrarnos nuestra lista
        listaSimplementeEnlazada.mostrar();
        //insertar algunos elementos
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(1);
        //mostrarnos nuestra lista
        listaSimplementeEnlazada.mostrar();
        Pila pila = new Pila();
        System.out.println(pila.estaVacia());
        for (int i = 1; i <=5; i++) {
            pila.insertar(i);
        }
        pila.mostrar();
        }
    }
