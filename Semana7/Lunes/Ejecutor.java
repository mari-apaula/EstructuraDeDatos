/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lunes;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        Pila pila = new Pila(5);

        pila.IncertarPila();
        pila.IncertarPila();

// pila Imprimir
        pila.MostrarPila();

        pila.EliminarPila();
// pila ImprimePila();
        pila.MostrarPila();
    }
}
