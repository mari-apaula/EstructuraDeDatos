/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lunes;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Pila {

    int[] pila;
    int tope;
    int max;
    Scanner teclado = new Scanner(System.in);

// crear clase y valor max
    public Pila(int max) {
        this.tope = -1;
        this.max = max;
        this.pila = new int[this.max];
    }

    public int GetTOPE() {
        return tope;
    }

    public void VaciarPila() {
        this.tope = -1;
    }

    public boolean PilaLlena() {
        if (this.max - 1 == this.tope) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PilaVacia() {
        if (this.tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void IncertarPila() {
        if (this.PilaLlena()) {
            System.out.println("Pila llena");
        } else {
            int ITEM;
            System.out.println("Ingrese item a insertar");
            ITEM = teclado.nextInt();
            this.tope++;
            this.pila[this.tope] = ITEM;
            System.out.println("el item" + ITEM + "se ha insertado");
        }
    }

    public void EliminarPila() {
        if (this.PilaVacia()) {
            System.out.println("Pila Vacia");
        } else {
            int ITEM = this.pila[this.tope];
            this.tope--;

            System.out.println("el item" + ITEM + "se ha eliminado");
        }
    }

    public void MostrarPila() {
        if (this.PilaVacia()) {
            System.out.println("La Pila esta Vacia\nNo hay nada que mostrar");
        } else {
            int i;
            String mostrar = "";
            for (i = 0; i <= this.tope; i++) {
                mostrar = mostrar + this.pila[i] + "\n";
            }

            System.out.println("Los datos de la pila son:\n" + mostrar);
        }
    }

}

