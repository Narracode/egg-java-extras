package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class esAdulto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String continuar = "";
        int adultez = 18;
        
        while(!continuar.equalsIgnoreCase("No")) {
            System.out.print("Ingrese el nombre: ");
            String nombre = leer.nextLine();
            System.out.println("Edad de "+nombre+": ");
            int edad = leerCantidad(0,110);
            if (edad >= adultez) {
                System.out.println("Con una edad de " + edad + " años, " + nombre
                + " es legalmente mayor de edad.");
            } else {
                System.out.println(nombre + " no puede comprar cerveza por que"
                        + "tiene " + edad + "años.");
            }
            System.out.println("¿Desea continuar?");
            continuar = leer.nextLine();
        }
    }
    
    public static void asiNo() {
        System.out.println("\nInvalido, intenta otra vez\n");
    }
    
    public static int leerCantidad(int min, int max) {
        Scanner leer = new Scanner(System.in);
        int x = 0;
        
        do {
            System.out.print("Introduce un numero entre "+min+" y "+max+" > ");
            x = leer.nextInt();
            if (x<min || x>max) {
                asiNo();
            }
        } while (x<min || x>max);
        return x;
    }
}
