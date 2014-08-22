/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dulce
 */
public class ListaCircular<T> extends Lista {

    @Override
    public void Agregar(Object valor) {
        NodoCircular<T> _newNodo = new NodoCircular(valor);

        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            _newNodo.setCabeza(true);
            
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            _newNodo.setAnterior(NodoActual);
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
            if(nodoActual.getSiguiente().getValor() == valor)
            {
                eliminar = nodoActual.getSiguiente();
                nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                salir = true;
            }
        }
        return eliminar;
    }
    
    
}

