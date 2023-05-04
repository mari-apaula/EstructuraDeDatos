/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
//import static paquete1.Metodos.insertar1;
//import static paquete1.Metodos.presentar1;
import static paquete1.Metodos.*;


/**
 *
 * @author SALA I
 */
public class Asignar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int [] miArreglo = new int[5]; 
        insertar(miArreglo);
        presentar(miArreglo);
        
        insertar1(miArreglo);
        presentar1(miArreglo);
        
        for( int i=0; i < miArreglo.length; i++){
            System.out.println("Ingrese elemento en la posicion " + i + "");
            miArreglo[i]= entrada.nextInt(); 
        }

    }
    public static void insertar(int[] x) {
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < x.length; i++){
            System.out.println("Ingrese elemento en la posicion " + i + "");
            x[i]= entrada.nextInt(); 
        }
    }

    public static void presentar(int[] x) {
        for(int i = 0; i < x.length; i++){
            System.out.println(" " + x[i] + " ");
        }
        System.out.println("");
    }
}
