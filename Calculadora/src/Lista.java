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
public abstract class Lista<T> {
    
    protected Calculadora<T> Cabeza;
    protected Calculadora<T> Actual;
    
  
    
    public void Lista(){
        Actual = Cabeza;

    }

    abstract public void Agregar(T valor);
    
    abstract public Calculadora Eliminar(T valor);


    public String toString(){
        Calculadora Inicio = Cabeza;
        String strLista = "";
        StringBuilder _sb = new StringBuilder();

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

