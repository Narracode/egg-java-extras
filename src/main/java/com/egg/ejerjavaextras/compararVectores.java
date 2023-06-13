package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class compararVectores {

    public static void main(String[] args) {
        System.out.println("Dimension de los vectores");
        int n = leerCantidad(1,100);
        int[] vectorA = new int[n], vectorB = new int[n];
        System.out.println("Valores dentro del vector A");
        llenarVector(vectorA);
        System.out.println("Valores dentro del vector B");
        llenarVector(vectorB);
        compararVectores(vectorA,vectorB);
    }

    public static void compararVectores(int[] vA, int[] vB) {
        System.out.println("\nComparando...\n   Vector A:");
        mostrarVector(vA);
        System.out.println("\n   Vector B");
        mostrarVector(vB);
        boolean iguales = true;
        int i = 0;
        
        do {
            iguales = vA[i] == vB[i];
            i++;
        } while (iguales && i < vA.length);
        
        if(iguales) {
            System.out.println("Los vectores A y B son identicos");
        } else {
            System.out.println("Los vectores A y B difieren");
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
        
    public static void llenarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Posicion ["+i+"] ");
            v[i] = leerCantidad(-100,100);
        }
    }

    public static void mostrarVector(int[] v) {
        String aux="";
        for (int valor : v) {
            aux = valor + " " + aux;
        }
        System.out.println(aux);
    }
}
