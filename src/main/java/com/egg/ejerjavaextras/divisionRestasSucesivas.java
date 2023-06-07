package com.egg.ejerjavaextras;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class divisionRestasSucesivas {

    public static void main(String[] args) {
        System.out.println("Dividendo:");
        int d = leerCantidad(0,999);
        System.out.println("Divisor:");
        int s = leerCantidad(0,999);
        
        dividirConRestas(d,s);
    }

    public static void dividirConRestas(int a,int b) {
        int cociente = 0;
        while(a>=b) {
            a-=b;
            cociente++;
        }
        if (cociente>0) {
            System.out.println("Cociente de a/b ="+cociente+"\ncon "+a+" residual");
        } else {
            System.out.println("El cociente es menor a 1");
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
