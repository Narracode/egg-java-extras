package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class descuentoSocios {

    public static void main(String[] args) {
        double desc = ingresarMembresia();
        System.out.println("Costo del tratamiento");
        double costo = leerCantidad(1,15000);
        double importe = costo-(costo*desc);
        System.out.println("Importe para Socios $"+importe);
    }
    
    public static void asiNo() {
        System.out.println("\nInvalido, intenta otra vez\n");
    }
    
    public static double leerCantidad(double min, double max) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un numero entre "+min+" y "+max+" > ");
        double x = 0;
        do {
            x = leer.nextInt();
            if (x<min && x>max) {
                asiNo();
            }
        } while (x<min && x>max);
        return x;
    }
    
    public static double ingresarMembresia() {
        Scanner leer = new Scanner(System.in);
        char m;
        double descuento = 0;
        do {
            System.out.print("Ingresa el codigo de tu membresia (A, B o C) > ");
            m = leer.next().charAt(0);
            if (m!='A' && m!='B' && m!='C') {
                asiNo();
            }
        } while (m!='A' && m!='B' && m!='C');
        switch(m) {
            case 'A': descuento = .50;break;
            case 'B': descuento = .35;break;
            case 'C': descuento = 0;break;
        }
        return descuento;
    }
}
