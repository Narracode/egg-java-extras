package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class numerosPrimos {
 
    public static void main(String[] args) {
        int numero = leerCantidad(2,200);
        
        boolean primo = esPrimo(numero);
        
        if(primo) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("Hay otro numero que divide a " + numero);
        }
    }

    public static boolean esPrimo(int n) {
        boolean p = true;
        int i = 2;
        
        while(p && i < n) {
            p = n % i != 0;
            i++;
        }
        return p;
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
