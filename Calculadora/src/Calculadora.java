/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Calculadora{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple<Integer> _lista = new ListaSimple<Integer>();
        Scanner _in = new Scanner(System.in);
        
        NodoSimple<Integer> nuevoNodo = new NodoSimple<Integer>(2);
        NodoSimple<String> nuevoNodoString = new NodoSimple<String>("2");
        // Nodo<Nodo> nuevoNodoNodo = new Nodo<> (new Nodo());
        
        Nodo<Integer>[] misNodos;
        misNodos = (Nodo[])Array.newInstance(Nodo.class, 10);
        misNodos[0] = new NodoSimple<Integer>(1);
        misNodos[1] = new NodoSimple<Integer>(8);
        misNodos[2] = new NodoSimple<Integer>(1);
        misNodos[3] = new NodoSimple<Integer>(7);
        misNodos[4] = new NodoSimple<Integer>(4);
        misNodos[5] = new NodoSimple<Integer>(9);
        misNodos[6] = new NodoSimple<Integer>(2);
        misNodos[7] = new NodoSimple<Integer>(3);
        misNodos[8] = new NodoSimple<Integer>(8);
        misNodos[9] = new NodoSimple<Integer>(0);
        
        int opcion = 0;
        int i = 0;
        
        while (opcion!= 4){
            System.out.print("1. Agregar nodo a lista\n");
            System.out.print("2. Mostrar lista de nodos\n");
            System.out.print("3. Mostrar Vector Nodos\n");
            System.out.print("4. Salir\n");
            opcion = _in.nextInt();
            switch(opcion)
            {
                case 1:
                    _lista.Agregar(i);
                    break;
                case 2:
                    System.out.print(_lista.toString());
                    System.out.print("\n");
                    break;
                case 3:
                    for (int j =0; j < 10; j++){
                        System.out.print(misNodos[j].toString().concat(", "));
                }
                System.out.println();
                break;
            }
            i++;
        }
    }
}
