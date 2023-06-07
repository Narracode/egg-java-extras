package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class contarDigitos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el monto que te gustaria en tu cuenta bancaria");
        int cantidad = leer.nextInt();
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
}
