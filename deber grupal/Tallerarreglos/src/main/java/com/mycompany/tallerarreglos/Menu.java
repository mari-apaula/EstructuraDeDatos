/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerarreglos;

/**
 *
 * @author Gianfranco Sanchez
 */
import java.util.Scanner;

public class Menu {

    private Metodos datos;

    public Menu() {
        datos = new Metodos();
    }

    void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Insertar");
            System.out.println("2. Presentar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Ordenamiento Burbuja");
            System.out.println("6. Ordenamiento QuickSort");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    datos.insertar();
                    break;
                case 2:
                    datos.presentar();
                    break;
                case 3:
                    datos.buscar();
                    break;
                case 4:
                    datos.eliminar();
                    break;
                case 5:
                    datos.ordenamientoBurbuja();
                    break;
                case 6:
                    datos.ordenamientoQuickSort();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}

