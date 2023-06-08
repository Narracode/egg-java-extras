package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class edadDeHijos {

    public static void main(String[] args) {
        int regs = 0;
        System.out.println("¿Cuantas familias se censaran?");
        int N = leerCantidad(1,25),sumaE = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("\n¿Hijos en la familia "+i+"?");
            int M = leerCantidad(0,9);
            for (int j = 1; j <= M; j++) {
                System.out.println("Edad del hijo "+j);
                sumaE += leerCantidad(0,18);
                regs++;
            }
        }
        int promE = sumaE/regs;
        System.out.println("El promedio de edad de los chicos del barrio es de "
            + promE + "años");
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
