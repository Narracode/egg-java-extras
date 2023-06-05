package com.egg.ejerjavaextras;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class esVocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra > ");
        confirmaVocal(leer.next());
    }
    public static void confirmaVocal(String v) {
        v = v.toLowerCase();
        if (v.equals("a") || v.equals("e") || v.equals("i")
                || v.equals("o") || v.equals("u") ) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
