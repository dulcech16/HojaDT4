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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<Integer> _lista = new Lista<Integer>();
        Scanner _in = new Scanner(System.in);
        
        Nodo<Integer> nuevoNodo = new Nodo<Integer>(2);
        Nodo<String> nuevoNodoString = new Nodo<String>("2");
        // Nodo<Nodo> nuevoNodoNodo = new Nodo<> (new Nodo());
        
        Nodo<Integer>[] misNodos;
        misNodos = (Nodo[])Array.newInstance(Nodo.class, 10);
        misNodos[0] = new Nodo<Integer>(1);
        misNodos[1] = new Nodo<Integer>(8);
        misNodos[2] = new Nodo<Integer>(1);
        misNodos[3] = new Nodo<Integer>(7);
        misNodos[4] = new Nodo<Integer>(4);
        misNodos[5] = new Nodo<Integer>(9);
        misNodos[6] = new Nodo<Integer>(2);
        misNodos[7] = new Nodo<Integer>(3);
        misNodos[8] = new Nodo<Integer>(8);
        misNodos[9] = new Nodo<Integer>(0);
        
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
