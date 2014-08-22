/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dulce
 */
public class ListaSimple<T> extends Lista{

    @Override
    public void Agregar(Object valor) {

        NodoSimple<T> _newNodo = new NodoSimple(valor);

        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            NodoActual = _newNodo;
        }
    }
    
    @Override
    public Nodo Eliminar(Object valor){
        Nodo nodoActual = Cabeza;
        Nodo eliminar = null;
        boolean salir = false;
        while(!salir)
        {
            if(nodoActual.getSiguiente() == null)
                salir = true;
            if(nodoActual == Cabeza && nodoActual.getValor() == valor)
            {
                eliminar = nodoActual;
                Cabeza = nodoActual.getSiguiente();
                salir = true;
            }
            else if(nodoActual.getSiguiente().getValor() == valor)
            {
                eliminar = nodoActual.getSiguiente();
                nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                salir = true;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return eliminar;
    }
    
}
