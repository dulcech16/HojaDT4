/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Dulce
 */
public abstract class Lista<T> implements iLista {
    
    protected Nodo<T> Cabeza;
    protected Nodo<T> NodoActual;
    
  
    
    public void Lista(){
        NodoActual = Cabeza;

    }

    public void Agregar(){}
    public void Eliminar(){}
    
     public String toString(){
        Nodo Inicio = Cabeza;
        String strLista = "";
        StringBuilder _sb = new    StringBuilder();

        if (Inicio != null){        
            while (Inicio.getSiguiente() != null)
            {
                _sb.append(Inicio.getValor());
                _sb.append("  -> ");            
                Inicio = Inicio.getSiguiente();
            }
        }

        _sb.append(" null");

        return _sb.toString();
     }

}
