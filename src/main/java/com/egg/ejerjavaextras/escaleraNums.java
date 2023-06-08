package com.egg.ejerjavaextras;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class escaleraNums {

    public static void main(String[] args) {
        int n = leerCantidad(1,149);
        
        dibujaEscalera(n);
    }

    public static void dibujaEscalera(int escalones) {

        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
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
