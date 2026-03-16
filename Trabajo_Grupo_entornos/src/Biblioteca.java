/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikew
 */

import java.util.ArrayList;

public class Biblioteca {
    
    
    public static void main(String[] args) {
        // Listas de datos: nombre del libro, días de retraso, tipo (1: General, 2: Novedad)
        String[] lista = {"Don Quijote", "Clean Code", "Java 21", "Principito"};
        int[] diasRetraso = {5, 0, 2, 10}; 
        int[] tipoLibro = {1, 2, 2, 1};

        System.out.println("---------------------------");
        System.out.println("RECAUDACION TOTAL: " + multaCalc(diasRetraso,tipoLibro,lista) + "€");
    }
    
    
    public static double multaCalc(int[] retraso, int[]tipo,String[] lista){
    double multaTotal = 0; // Total multas

        for (int i = 0; i < lista.length; i++) {
            // Si tiene más de 0 días de retraso
            if (retraso[i] > 0) {
                double v = 0;

                // Precio por día según tipo
                if (tipo[i] == 1) {
                    v = retraso[i] * 0.50; // 0.50€ por día libros normales
                } else {
                    v = retraso[i] * 1.20; // 1.20€ por día novedades
                }

                // Recargo extra si el retraso es de más de una semana
                if (retraso[i] > 7) {
                    v = v + 5.0;
                }

                System.out.println("Libro: " + lista[i] + " | Multa: " + v + " euros");
                multaTotal += v;
            } else {
                System.out.println("Libro: " + lista[i] + " | Sin retraso");
            }
            
           
        }

     return multaTotal;
    }
}