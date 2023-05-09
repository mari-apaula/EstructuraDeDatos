/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;
import static clase01.Imprimir.imprimir;
/**
 *
 * @author SALA I
 */

public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int n = 5000;
        int[] arr = new int[n];

// Llenamos el arreglo desordenado
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n) + 1;
        }

        System.out.println("Arreglo desordenado:");
        imprimir(arr);

// Aplicamos el método de ordenamiento burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nArreglo ordenado:");
        imprimir(arr);
    }
    
}
