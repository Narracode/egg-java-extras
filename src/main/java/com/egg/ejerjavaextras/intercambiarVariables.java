package com.egg.ejerjavaextras;

/**
 *
 * @author zero
 */
public class intercambiarVariables {

    public static void main(String[] args) {
        int A = 16, B = 80, C = 28, D = 54, aux;
        System.out.println("Iniciales\nA = "+A+", B = "+B+", C = "+C+", D = "+D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Finales\nA = "+A+", B = "+B+", C = "+C+", D = "+D);
    }
}
