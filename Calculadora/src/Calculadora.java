/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dulce
 */
public class Calculadora<T> implements Comparable {
    private T _valor;
    private Calculadora _siguiente;
    
    public Calculadora (){
        _valor = null;
        _siguiente = null;
    }
    
    public Calculadora (T valor){
        _valor = valor;
        _siguiente = null;
    }
    
    public Calculadora (T valor, Calculadora siguiente){
        _valor = valor;
        _siguiente = siguiente;
    }
    
    public void setValor(T valor){
        this._valor = valor;
    }


    public void setSiguiente(Calculadora siguiente){
        _siguiente =  siguiente;
    }

    public T getValor(){
        return _valor;
    }

    public Calculadora getSiguiente(){
        return _siguiente;
    }

    @Override
    public String toString()
    {
        return _valor.toString();
    }

    @Override
    public boolean equals(Object other)
    {
        return this._valor == ((Calculadora)other).getValor();
    }
    
    @Override
    public int compareTo(Object other) {
        return ((Comparable) _valor).compareTo(other);
    }
    
}
