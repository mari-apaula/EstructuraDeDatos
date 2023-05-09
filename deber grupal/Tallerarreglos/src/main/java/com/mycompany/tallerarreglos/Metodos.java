/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerarreglos;

import java.util.Scanner;

/**
 *
 * @author Gianfranco Sanchez
 */
public class Metodos {

    private int[] arreglo;
    private int cantidadElementos;

    public Metodos() {
        arreglo = new int[100];
        cantidadElementos = 0;
    }

    public void insertar() {
        if (cantidadElementos >= arreglo.length) {
            System.out.println("No se pueden insertar más elementos. El arreglo está lleno.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el elemento a insertar: ");
        int elemento = scanner.nextInt();

        arreglo[cantidadElementos] = elemento;
        cantidadElementos++;

        System.out.println("Elemento insertado correctamente.");
    }

    public void presentar() {
        if (cantidadElementos == 0) {
            System.out.println("No hay elementos para presentar.");
            return;
        }

        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void buscar() {
        if (cantidadElementos == 0) {
            System.out.println("No hay elementos para buscar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el elemento a buscar: ");
        int elemento = scanner.nextInt();

        boolean encontrado = false;
        int indice = -1;

        for (int i = 0; i < cantidadElementos; i++) {
            if (arreglo[i] == elemento) {
                encontrado = true;
                indice = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El elemento " + elemento + " se encuentra en la posición " + indice);
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el arreglo.");
        }
    }

    public void eliminar() {
        if (cantidadElementos == 0) {
            System.out.println("No hay elementos para eliminar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el elemento a eliminar: ");
        int elemento = scanner.nextInt();

        boolean encontrado = false;
        int indice = -1;

        for (int i = 0; i < cantidadElementos; i++) {
            if (arreglo[i] == elemento) {
                encontrado = true;
                indice = i;
                break;
            }
        }

        if (encontrado) {
            for (int i = indice; i < cantidadElementos - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }

            cantidadElementos--;
            System.out.println("El elemento " + elemento + " ha sido eliminado correctamente.");
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el arreglo.");
        }
    }

    public void ordenamientoBurbuja() {
        if (cantidadElementos == 0) {
            System.out.println("No hay elementos para ordenar.");
            return;
        }

        for (int i = 0; i < cantidadElementos - 1; i++) {
            for (int j = 0; j < cantidadElementos - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        System.out.println("El arreglo ha sido ordenado utilizando el método de ordenamiento burbuja.");
    }

    public void ordenamientoQuickSort() {
        if (cantidadElementos == 0) {
            System.out.println("No hay elementos para ordenar.");
            return;
        }

        quickSort(0, cantidadElementos - 1);

        System.out.println("El arreglo ha sido ordenado utilizando el método de ordenamiento quicksort.");
    }

    private void quickSort(int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(inicio, fin);
            quickSort(inicio, indiceParticion - 1);
            quickSort(indiceParticion + 1, fin);
        }
    }

    private int particion(int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }
}
