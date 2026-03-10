/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WEB1-20
 */

import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        
        //soy ricardoooooooooooooooooooooooooooo
        
        // Listas de datos: nombre del libro, días de retraso, tipo (1: General, 2: Novedad)
        String[] n = {"Don Quijote", "Clean Code", "Java 21", "Principito"};
        int[] d = {5, 0, 2, 10}; 
        int[] t = {1, 2, 2, 1};

        double m = 0; // Total multas

        for (int i = 0; i < n.length; i++) {
            // Si tiene más de 0 días de retraso
            if (d[i] > 0) {
                double v = 0;

                // Precio por día según tipo
                if (t[i] == 1) {
                    v = d[i] * 0.50; // 0.50€ por día libros normales
                } else {
                    v = d[i] * 1.20; // 1.20€ por día novedades
                }

                // Recargo extra si el retraso es de más de una semana
                if (d[i] > 7) {
                    v = v + 5.0;
                }

                System.out.println("Libro: " + n[i] + " | Multa: " + v + " euros");
                m = m + v;
            } else {
                System.out.println("Libro: " + n[i] + " | Sin retraso");
            }
        }

        System.out.println("---------------------------");
        System.out.println("RECAUDACION TOTAL: " + m + "€");
    }
}
