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
public class Cola {
   
    int[] cola;
    int tope;
    int max;
    int contador = 1;
    Scanner teclado = new Scanner(System.in);

// crear clase y valor max
    public Cola(int max) {
        this.tope = -1;
        this.max = max;
        this.cola = new int[this.max];
    }

    public int GetTOPE() {
        return tope;
    }

    public void VaciarCola() {
        this.tope = -1;
    }

    public boolean ColaLlena() {
        if (this.max - 1 == this.tope) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ColaVacia() {
        if (this.tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void IncertarCola() {
        if (this.ColaLlena()) {
            System.out.println("Cola llena");
        } else {
            int ITEM;
            ITEM = contador ++;
            this.tope++;
            this.cola[this.tope] = ITEM;
            
        }
    }

    public void EliminarCola()
    {
        if(this.ColaVacia())
        {
            System.out.println("Pila Vacía");
        }
        else
        {
            int ITEM = this.cola[0];
            System.out.println("El item " + ITEM + " se ha eliminado");
            if (this.tope==0) {
                VaciarCola();
            }
            else {
                
            for( int i= 0; i<this.tope; i++){
               this.cola[i]= this.cola[i+1];  
            }
            }
            this.tope--; 
        }
    }

    public void MostrarCola() {
        if (this.ColaVacia()) {
            System.out.println("La Cola esta Vacia\nNo hay nada que mostrar");
        } else {
            int i;
            String mostrar = "";
            for (i = 0; i <= this.tope; i++) {
                mostrar = mostrar + this.cola[i] + "\n";
            }

            System.out.println("Los datos de la Cola son:\n" + mostrar);
        }
    }

}

