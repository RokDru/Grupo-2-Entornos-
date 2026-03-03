/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoGrupo;

import java.util.ArrayList;

/**
 *
 * @author WEB1-26
 */
public class Principal {
    //DECISION GRUPAL: VAMOS A HACER UNA ARRAYLIST.
    //CADA UNO LO HACE A SU MANERA Y LUEGO DECIDIMOS CUAL ES MEJOR

    public static void main(String[] args) {
        // Listas de datos: nombre del libro, días de retraso, tipo (1: General, 2: Novedad)
        String[] n = {"Don Quijote", "Clean Code", "Java 21", "Principito"};
        int[] d = {5, 0, 2, 10};//Dias de retraso(Podriamos juntar las 2 arrays y hacer una array de matriz [][])
        int[] t = {1, 2, 2, 1};//Tipo de libro
        double m = 0; // Total multas
        for (int i = 0; i < n.length; i++) {
            // Si tiene más de 0 días de retraso
            if (d[i] > 0) {
                double v = 0;//Multa por instancia de libro (Esta declarado dentro. Podriamos declararlo fuera)
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
