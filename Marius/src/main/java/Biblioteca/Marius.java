/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Biblioteca;

/**
 *
 * @author WEB1-26
 */
public class Marius {

    public static void main(String[] args) {
        //Este es el primer cambio
        //En mi primer cambio he hecho una Matriz. Por la diferencia de int y String he hecho castings
        //Tambien he quitado el import de arraylist porque no lo estaba usando
        Object[][] libros = {
            {"Don Quijote", 5, 1},
            {"Clean Code", 0, 2},
            {"Java 21", 2, 2},
            {"Principito", 10, 1}
        };
        double m = 0;
        for (int i = 0; i < libros.length; i++) {
            String nombre = (String) libros[i][0];
            int dias = (int) libros[i][1];
            int tipo = (int) libros[i][2];
            if (dias > 0) {
                double v = 0;
                if (tipo == 1) {
                    v = dias * 0.50;
                } else {
                    v = dias * 1.20;
                }
                if (dias > 7) {
                    v = v + 5.0;
                }
                System.out.println("Libro: " + nombre + " | Multa: " + v + " euros");
                m += v;

            } else {
                System.out.println("Libro: " + nombre + " | Sin retraso");
            }
        }
        System.out.println("---------------------------");
        System.out.println("RECAUDACION TOTAL: " + m + "€");
    }
}
