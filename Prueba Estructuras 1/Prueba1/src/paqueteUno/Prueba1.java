/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        try {
            File file = new File("C:\\Users\\SALA A\\Desktop\\Prueba Estructuras 1\\HistorialMedicoNacional.txt");
            if (file.createNewFile()) { 
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya exite");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        
        System.out.println("Cantidad de paciente de los que se va a ingresar la información\n");
        int cantPacientes = entrada.nextInt(); 
        entrada.nextLine(); 
        String informeFinal = "";
        
        for (int i = 1; i <= cantPacientes; i++) { 
                System.out.print("Ingrese el numero de cedula\n");
                String numCedula = entrada.nextLine(); 
                System.out.print("Ingrese los apellidos completos\n");
                String apellidos= entrada.nextLine(); 
                System.out.print("Ingrese los nombres completos\n");
                String nombres = entrada.nextLine(); 
                System.out.print("Ingrese la fecha de nacimiento\n");
                String fNacimineto = entrada.nextLine(); 
                System.out.print("Ingrese la estatura\n");
                double estatura = entrada.nextDouble(); 
                System.out.print("Ingrese el peso\n");
                double peso = entrada.nextDouble(); 
                entrada.nextLine(); 
                System.out.print("Ingrese las alergias\n");
                String alergias = entrada.nextLine(); 
                informeFinal = String.format("%s\tPaciente: %d\n"
                        + "Cedula de identidad: %s\n"
                        + "Apellidos: %s\n"
                        + "Nombres: %s\n"
                        + "Fecha de Nacimiento: %s\n"
                        + "Estatura: %.2f\n"
                        + "Peso: %.2f\n"
                        + "Alergias: %s\n\n", 
                        informeFinal,i, numCedula, apellidos, nombres, fNacimineto, 
                        estatura, peso, alergias);
            }
        
        try ( FileWriter miArchivo = new FileWriter("C:\\Users\\SALA A\\"
                + "Desktop\\Prueba Estructuras 1\\HistorialMedico"
                + "Nacional.txt", true)) {
            
            miArchivo.append(informeFinal);
            miArchivo.close();
            System.out.println("\nArchivo ha sido escrito");
        } catch (IOException e) {
            System.out.println("\nError de escritura");
        }

        //Leer ARCHIVO
        System.out.println("\nLeemos el archivo\n");
        try ( FileReader miArchivo = new FileReader("C:\\Users\\SALA A\\Desktop\\Prueba Estructuras 1\\HistorialMedicoNacional.txt")) {
            int i;
            while ((i = miArchivo.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("Error de lectura");
        }

    }

}
