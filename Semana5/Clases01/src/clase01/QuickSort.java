/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

/**
 *
 * @author SALA I
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] numeros = new int[100];

//Llenar arreglo con números aleatorios del 1 al 10000
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) Math.floor(Math.random() * 101);
        }

        System.out.println("Números antes del ordenamiento:");
        imprimir(numeros);

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nNúmeros después del ordenamiento:");
        imprimir(numeros);
    }

    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[inicio];
        while (inicio < fin) {
            while (inicio < fin && arr[fin] >= pivote) {
                fin--;
            }
            if (inicio < fin) {
                arr[inicio++] = arr[fin];
            }

            while (inicio < fin && arr[inicio] <= pivote) {
                inicio++;
            }
            if (inicio < fin) {
                arr[fin--] = arr[inicio];
            }
        }
        arr[inicio] = pivote;
        return inicio;
    }

    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int p = particion(arr, inicio, fin);
            quickSort(arr, inicio, p - 1);
            quickSort(arr, p + 1, fin);
        }
    }

    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
