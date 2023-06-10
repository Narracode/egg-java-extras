package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class sumarVector {

    public static void main(String[] args) {
        System.out.println("Dimension del vector");
        int[] vector = new int[leerCantidad(1,100)];
        
        System.out.println("Valores dentro del vector");
        llenarVector(vector);
        sumarVector(vector);
    }
    
    public static void sumarVector(int[] v) {
        int suma = 0;
        
        for (int n : v) {
            suma += n;
        }
        
        System.out.println("La suma de los valores en el vector es: "+suma);
    }
    
    public static void llenarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vector["+i+"] ");
            v[i] = leerCantidad(-100,100);
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
