package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class contarDigitos {

    public static void main(String[] args) {
        
        System.out.println("Ingresa el monto que te gustaria en tu cuenta bancaria");
        int cantidad = leerCantidad(0,999999999);
        contarDigitos(cantidad);
    }

    public static void contarDigitos(int n) {
        int cuenta = 1;
        System.out.print(n+"contiene ");
        while(n>9) {
            n = n/10;
            cuenta++;
        }
        System.out.println(cuenta+" Digitos");
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
