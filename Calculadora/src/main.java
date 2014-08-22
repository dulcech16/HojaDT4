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
        // TODO code application logic here
        Lista<Integer> _lista = new Lista<Integer>();
        Scanner _in = new Scanner(System.in);
        
        Calculadora<Integer> nuevaCalculadora = new Calculadora<Integer>(2);
        Calculadora<String> nuevaCalculadoraString = new Calculadora<String>("2");
        
        Calculadora<Integer>[] misNodos;
        miCalculadora = (Calculadora[])Array.newInstance(Nodo.class, 10);
        miCalculadora[0] = new Calculadora<Integer>(1);
        miCalculadora[1] = new Calculadora<Integer>(8);
        miCalculadora[2] = new Calculadora<Integer>(1);
        miCalculadora[3] = new Calculadora<Integer>(7);
        miCalculadora[4] = new Calculadora<Integer>(4);
        miCalculadora[5] = new Calculadora<Integer>(9);
        miCalculadora[6] = new Calculadora<Integer>(2);
        miCalculadora[7] = new Calculadora<Integer>(3);
        miCalculadora[8] = new Calculadora<Integer>(8);
        miCalculadora[9] = new Calculadora<Integer>(0);
        
        int opcion = 0;
        int i = 0;
        
        while (opcion!= 4){
            System.out.print("1. Agregar resultado a lista\n");
            System.out.print("2. Mostrar lista de resultados\n");
            System.out.print("3. Mostrar Vector Resultados\n");
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
                        System.out.print(miCalculadora[j].toString().concat(", "));
                    }
                    System.out.println();
                    break;
            }
            i++;
        } 
    }
}
