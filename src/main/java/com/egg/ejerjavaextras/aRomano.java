package com.egg.ejerjavaextras;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class aRomano {

    public static void main(String[] args) {
        System.out.println("Numero Romanos");
        enRomanos(leerCantidad(1,10));
    }
    
    public static void enRomanos(int n) {
        String msj = n+" equivale a ",r = "";
        int V = 5, X = 10;
        switch(n) {
            case 5:case 4:
                r = "V";
                if (n<V) {r = "I" + r;}
            break;
            case 10:case 9:
                r = "X";
                if (n<X) {r = "I" + r;}
            break;
            default:
                if (n>V) {r = "V"; n-=V;}
                r += String.join("", Collections.nCopies(n, "I"));
            break;
        }
        System.out.println(msj + r);
    }
    
    public static void asiNo() {
        System.out.println("\nInvalido, intenta otra vez\n");
    }
    
    public static int leerCantidad(int min, int max) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un numero entre "+min+" y "+max+" > ");
        int x = 0;
        do {
            x = leer.nextInt();
            if (x<min && x>max) {
                asiNo();
            }
        } while (x<min && x>max);
        return x;
    }
}
