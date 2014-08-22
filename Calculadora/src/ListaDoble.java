/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dulce
 */
public class ListaDoble<T> extends Lista{

    public ListaDoble() {
        NodoActual = Cabeza;
    }

    @Override
    public void Agregar(Object valor) {
        
        NodoDoble<T> _newNodo = new NodoDoble(valor);

        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            
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
            if(nodoActual == Cabeza && nodoActual.getValor() == valor)
            {
                eliminar = nodoActual;
                Cabeza = nodoActual.getSiguiente();
                salir = true;
            }
            if(nodoActual.getSiguiente() == null)
                salir = true;
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

