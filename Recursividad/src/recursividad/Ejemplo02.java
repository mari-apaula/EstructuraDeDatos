/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author SALA I
 */
public class Ejemplo02 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 5;
        int resultado = suma(n);
        System.out.println("La suma de los numeros del " + n + " al 1 es " + resultado);

    }

    public static int suma(int n) {
        
        if (n == 1) {
            
            return 1;
        } else {
            return (n + suma(n-1)) ;
        }
    }
}