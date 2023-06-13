package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class vectorFibonacci {

    public static void main(String[] args) {
        System.out.println("Dimension del vector");
        int[] fibonacci = new int[leerCantidad(2,100)];
        calcularSucesionFibonacci(fibonacci);
        mostrarVector(fibonacci);        
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
        
    public static void calcularSucesionFibonacci(int[] f) {
        int base = 1, incremento = 1;
        f[0] = base; f[1] = incremento;
        
        for (int i = 2; i < f.length; i++) {
            int siguiente = base+incremento;
            f[i] = siguiente;
            incremento = base;
            base = siguiente;
        }
    }

    public static void mostrarVector(int[] v) {
        String aux="";
        for (int valor : v) {
            aux += " " + valor;
        }
        System.out.println(aux);
    }
}