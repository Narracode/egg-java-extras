package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class sumaMatriz {

    public static void main(String[] args) {
        System.out.println("Ingrese una dimension");
        int N = leerCantidad(1,100);
        System.out.println("Ingrese otra dimension");
        int M = leerCantidad(1,100);
        int[][] matriz = new int[N][M];
        int total = sumarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("La suma de todos los valores es: "+total);
    }

    private static int sumarMatriz(int[][] m) {
        int l = m.length, k = m[0].length, suma = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < k; j++) {
                m[i][j] = (int)(Math.random()*10);
                suma += m[i][j];
            }
        }
        return suma;
    }
        
    public static void mostrarMatriz(int[][] m) {
        for (int[] fila : m) {
            String aux = "";
            for (int columna : fila) {
                aux += " " + columna;
            }
            System.out.println(aux);
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
