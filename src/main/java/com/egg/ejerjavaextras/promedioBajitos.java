package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class promedioBajitos {

    public static void main(String[] args) {
        System.out.println("Cantidad de registros de altura");
        int n = (int) leerCantidad(1, 100), cB = 0;
        double g = 0, b = 0,p,pB;

        for (int i = 0; i < n; i++) {
            System.out.println("Registro "+(i+1));
            double e = leerCantidad(0.5,2.29);
            g += e;
            if (e < 1.6) {
                b += e;
                cB++;
            }
        }
        p = Math.round(g/n * 100) / 100d;
        pB = Math.round(b/cB * 100) / 100d;
        System.out.println("La estatura promedio es de "+p+"m, mientras que "
                +"el promedio de \nlas estaturas debajo de 1.60m  es de "+pB+"m");
    }
    
    public static void asiNo() {
        System.out.println("\nInvalido, intenta otra vez\n");
    }

    public static double leerCantidad(double min, double max) {
        Scanner leer = new Scanner(System.in);
        double x = 0;
        do {
            System.out.print("Introduce un numero entre "+min+" y "+max+" > ");
            x = leer.nextDouble();
            if (x<min || x>max) {
                asiNo();
            }
        } while (x<min || x>max);
        return x;
    }
}
