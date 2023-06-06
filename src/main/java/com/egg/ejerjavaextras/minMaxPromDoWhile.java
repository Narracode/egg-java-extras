package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class minMaxPromDoWhile {

    public static void main(String[] args) {
        System.out.println("¿Cuantos numeros procesaremos?");
        int n = leerCantidad(1,50);
        buscarValores(n);
    }
    
    public static void buscarValores(int n) {
        int max = 0, min = 0, i = 1, sum = 0;
        
        do {
            System.out.println("Numero "+i);
            int a = leerCantidad(0,99);
            sum += a;
            if (i==1) {
                max = a;
                min = a;
            }else if (a>max) {
                max = a;
            }else if (a<min) {
                min = a;
            }
            i++;
        } while (i<=n);
        System.out.println("El numero mas alto es: "+max
        + "\nEl numero mas bajo es: "+min
        + "\nEl promedio es: "+(sum/n));
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