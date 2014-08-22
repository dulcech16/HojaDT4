/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public interface iLista<T> {

    
    public void Lista();

    abstract public void Agregar(T valor);
    
    abstract public Nodo Eliminar(T valor);

    public String toString();
}
