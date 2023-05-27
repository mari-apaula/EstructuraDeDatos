/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        Cola cola = new Cola(10);
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.printf("\nMenú"
                    + "1. Tomar ticket"
                    + "2. Atender"
                    + "3. Mostrar elemento"
                    + "4. Salir"
                    + "Seleccione una opción:\n");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cola.IncertarCola();
                    break;
                case 2:
                    cola.EliminarCola();
                    break;
                case 3:
                    cola.MostrarCola();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
