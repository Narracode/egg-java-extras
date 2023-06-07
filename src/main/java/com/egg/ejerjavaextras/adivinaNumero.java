package com.egg.ejerjavaextras;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class adivinaNumero {

    public static void main(String[] args) {
        int tgt = (int)((Math.random()*10)*(Math.random()*10)), n=0;
//        System.out.println(tgt);
        do {
            n = leerCantidad(1,100);
            if (n == tgt) {
                System.out.println("Felicidades, le atinaste! el numero es "+n);
            } else {
                System.out.println("Ese no es el numero");
            }
        } while (tgt != n);
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
