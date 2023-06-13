package com.egg.ejerjavaextras;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class rellenarVectorAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dimension del vector");
        int[] vector = new int[leerCantidad(1,100)];
        rellenarVector(vector);
        mostrarVector(vector);
    }

    private static int[] rellenarVector(int[] v) {
        int l = v.length;
        
        for (int i = 0; i < l; i++) {
                v[i] = (int)(Math.random()*10);
        }
        return v;
    }

    public static void mostrarVector(int[] v) {
        String aux="";
        for (int valor : v) {
            aux += " " + valor;
        }
        System.out.println(aux);
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
