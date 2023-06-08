package com.egg.ejerjavaextras;

/**
 *
 * @author zero
 */
public class los3SonE {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String aux = i+"-"+j+"-"+k;
                    if (i==3) {
                        aux = "E-"+j+"-"+k;
                    } else if(j==3) {
                        aux = i+"-E-"+k;
                    } else if(k==3) {
                        aux = i+"-"+j+"-E";
                    }
                    System.out.println(aux);
                }}}}
}
