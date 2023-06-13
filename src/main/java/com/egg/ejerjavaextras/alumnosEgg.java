package com.egg.ejerjavaextras;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class alumnosEgg {

    public static void main(String[] args) {
        double [][] notas = new double[10][5];

        registrarNotas(notas);
        sacarPromedios(notas);
        mostrarAprobados(notas);
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

    public static void registrarNotas(double[][] n) {
        int trabajo1 = 0, trabajo2 = 1, parcial1 = 2, parcial2 = 3;
        for (int i = 0; i < n.length; i++) {
            System.out.println("\n    Notas Alumno "+(i+1));
            System.out.print("Primer Trabajo: ");
            n[i][trabajo1] = leerCantidad(0,10);
            System.out.print("Segundo Trabajo: ");
            n[i][trabajo2] = leerCantidad(0,10);
            System.out.print("Primer Integrador: ");
            n[i][parcial1] = leerCantidad(0,10);
            System.out.println("Segundo Integrador: ");
            n[i][parcial2] = leerCantidad(0,10);
        }
    }

    private static void sacarPromedios(double[][] n) {
        int trabajo1 = 0, trabajo2 = 1, parcial1 = 2, parcial2 = 3, general = 4;

        for (int i = 0; i < n.length; i++) {
            double promedio = 0;
            promedio += n[i][trabajo1]*.1;
            promedio += n[i][trabajo2]*.15;
            promedio += n[i][parcial1]*.25;
            promedio += n[i][parcial2]*.5;
            n[i][general] = promedio;
        }
    }

    private static void mostrarAprobados(double[][] n) {
        int aprobados = 0, general = 4, l = n.length, grupo = l+1;
        double aprueba = 7;
        
        for (int i = 0; i < l; i++) {
            if (n[i][general] > aprueba) {
                aprobados++;
            }
        }
        System.out.println("Hay " + aprobados + "alumnos aprobados y "
                + (grupo-aprobados) + " que no superaron el curso");
    }
}
