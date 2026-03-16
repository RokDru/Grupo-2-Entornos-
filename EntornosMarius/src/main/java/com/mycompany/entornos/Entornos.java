/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.entornos;

/**
 *
 * @author WEB1-26
 */
public class Entornos {

    public static int numero_mayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }
    }

    public static int ej1Bucle(int[] numeros) {
        int suma = 0;
        if (numeros != null) {
            for (int n : numeros) {
                if (n > 0) {
                    suma += n;
                }
            }
        }
        return suma;
    }
}
