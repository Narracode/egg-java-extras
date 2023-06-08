package com.egg.ejerjavaextras;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class operacionesFunciones {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String menu = "\nMENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir";
                
        System.out.println("Cantidad A");
        int numA = leerCantidad(1,9999999);
        System.out.println("Cantidad B");
        int numB = leerCantidad(1,9999999);
        int opcion;
        
        do {
            System.out.println(menu);
            System.out.print("Elija opcion: > ");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1:
                    mostrarAB(numA,numB);
                    System.out.println("Suma = " + sumar(numA, numB));
                break;
                case 2:
                    mostrarAB(numA,numB);
                    System.out.println("Resta = " + restar(numA, numB));
                break;
                case 3:
                    mostrarAB(numA,numB);
                    System.out.println("Producto = " + multiplicar(numA, numB));
                break;
                case 4:
                    mostrarAB(numA,numB);
                    System.out.println("Cociente = " + dividir(numA, numB));
                break;
                case 5:
                    System.out.println("Desea Salir? S/N");
                    String meVoy = leer.next();
                    if (meVoy.equalsIgnoreCase("s")){
                        System.out.println("Bye");
                    } else {
                        opcion = 0;
                }
                break;
                default:
                    asiNo();
            }
        } while (opcion != 5);
    }
    
    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }
    
    public static int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }
    
    public static int multiplicar(int a, int b) {
        int producto = a * b;
        return producto;
    }
    
    public static int dividir(int a, int b) {
        int cociente = a / b;
        return cociente;
    }
    
    public static void mostrarAB(int a, int b) {
        System.out.println("A = "+a+"  B = "+b);
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