package com.egg.ejerjavaextras;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author zero
 */
public class sopaDeLetras {

    public static void main(String[] args) {
        char[][] tablero = new char[20][20];
        char[][] objetivos = new char[5][5];
//        char[][] objetivos = {{'c','u','a','d','r'},{'a','l','g','o','i'},
//        {'n','a','d','a','h'},{'c','e','n','a','w'},{'c','i','n','c','o'}};
        leerPalabras(objetivos);
        mostrarMatriz(objetivos);
        repartirObjetivos(tablero,objetivos);
        mostrarMatriz(tablero);
        rellenarVacios(tablero);
        mostrarMatriz(tablero);
    }
    
    public static void repartirObjetivos(char[][] t, char[][] o) {
        for (int i = 0; i < o.length; i++) {
            int fila = new Random().nextInt(t.length);
            int columna = new Random().nextInt(t.length - o[i].length);
            System.arraycopy(o[i], 0,  t[fila],columna, o[i].length);
        }
    }
    
    public static void leerPalabras(char[][] obj) {
           Scanner leer = new Scanner(System.in);
           
           System.out.println("Introduzca 5 palabras");
           for (int i = 0; i < obj.length; i++) {
                String palabra = "";
                
                do {
                    System.out.print("Palabra numero "+(i+1)+"> ");
                    palabra = leer.next();
                    if (palabra.length() > 5 || palabra.length() < 3) {
                       asiNo();
                    }
                } while (palabra.length() > 5 || palabra.length() < 3);
                obj[i] = palabra.toCharArray();
            }
           
    }

    public static void asiNo() {
        System.out.println("\nInvalido, intenta otra vez\n");
    }
    
    public static void mostrarMatriz(char[][] m) {
        for (char[] fila : m) {
            String aux = "";
            for (char columna : fila) {
                aux += " " + columna;
            }
            System.out.println(aux);
        }
    }

    private static void rellenarVacios(char[][] t) {
        int l = t.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                int rdm = (int)(Math.random()*10)+'0'; // Se suma 0 para compatibilidad con tipo char.
                if (t[i][j] == '\u0000') { // Es el valor predeterminado de char.
                    t[i][j] = (char)rdm;
                }
            }
        }
    }
}
