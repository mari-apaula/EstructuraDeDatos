/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Metodos {

    public static void insertar1(int[] x) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingrese elemento en la posicion " + i + "");
            x[i] = entrada.nextInt();
        }
    }

    public static void presentar1(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(" " + x[i] + " ");
        }
        System.out.println("");
    }

    public static int busquedaSecl(int[] x, int num) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static void eliminar1(int[] x, int num) {
        int pos = busquedaSecl(x,num);
        if (pos != -1) {
               for (int i = pos; i < x.length; i++) {
                   x[i] = x [i +1];
               }
               x[x.length-1] = 0;
               
            }else {
            System.out.println("El elemento no exite");
        }
    }
}
