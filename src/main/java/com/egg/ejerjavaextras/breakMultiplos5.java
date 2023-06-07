package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class breakMultiplos5 {

    public static void main(String[] args) {
        int n=0, par = 0, impar = 0, cuenta = 0;
        do {
            int x = leerCantidad(0,1000);
            if (x%5 == 0) {
                break;
            }
            cuenta ++;
            if (x%2==0) {
                par++;
            } else {
                impar++;
            }
        } while (true);
        System.out.println("Numeros Pares: "+par+"\nImpares: "+impar+"\nTotal: "+cuenta);
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
