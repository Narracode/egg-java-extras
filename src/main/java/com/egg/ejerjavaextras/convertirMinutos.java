package com.egg.ejerjavaextras;
import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class convertirMinutos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de minutos > ");
        tiempo(leer.nextInt()); 
    }
    
    public static void tiempo(int mins) {
        int d, restH, h, restM;
        d = (int) floor(mins/1440);
        restH = mins % 1440;
        h = (int) floor(restH/60);
        restM = restH % 60;
        
        System.out.println(mins+" minutos = "+d+" Dias con "+h+" Horas y "+restM+" minutos");
    }
}
