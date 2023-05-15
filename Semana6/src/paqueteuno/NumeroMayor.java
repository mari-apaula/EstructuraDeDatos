/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author crocks
 */
public class NumeroMayor {

    /**
     *
     */
    public static void main(String[] args) {

        int filas, columnas;

        Scanner in = null;
        in = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas");
        filas = in.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = in.nextInt();

        //declaracion de matriz
        int miMatriz[][] = new int[filas][columnas];

        //Leer los valores de la matriz
        System.out.println("Ingrese elementos de la matriz");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese elemento");
                miMatriz[i][j] = in.nextInt();
            }
        }

        int mayor = miMatriz[0][0];
        int filaM = 0;
        int columnaM = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (miMatriz[i][j] > mayor) {
                    mayor = miMatriz[i][j];
                    filaM = i;
                    columnaM = j;
                }
            }
        }

        System.out.printf("El numero mayor es %d y se encuentra en la fila %d y en la columna %d",
                mayor, filaM, columnaM);
    }

}
