/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos_grupo2;

public class Entornos_grupo2 {
    /*CAMBIAMOS EL TIPO DE ALMACENAMIENTO DE ARRAY A OBJETOS EN LOS 
    QUE ALMACENAMOS LOS DATOS ASOCIADOS A CADA PRESTAMO*/
    public static class prestamo {

        String nombre;
        int dias_retra;
        int tipo_prestamo;

        public prestamo(String nombre, int dias_retra, int tipo_prestamo) {
            this.nombre = nombre;
            this.dias_retra = dias_retra;
            this.tipo_prestamo = tipo_prestamo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getDias_retra() {
            return dias_retra;
        }

        public void setDias_retra(int dias_retra) {
            this.dias_retra = dias_retra;
        }

        public int getTipo_prestamo() {
            return tipo_prestamo;
        }

        public void setTipo_prestamo(int tipo_prestamo) {
            this.tipo_prestamo = tipo_prestamo;
        }

    }

    public static void main(String[] args) {
        //Array de objetos prestamos
        prestamo a = new prestamo("Don Quijote", 5, 1);
        prestamo b = new prestamo("Clean Code", 0, 2);
        prestamo c = new prestamo("Java 21", 2, 2);
        prestamo d = new prestamo("Principito", 10, 1);
        prestamo[] prestamos = {a, b, c, d};
        /*CAMBIAMOS EL NOMBRE DE LAS VARIABLES PARA QUE HACER EL CODIGO
        MAS LEGIBLE*/
        double total_multas = 0; // Total multas

        for (int i = 0; i < prestamos.length; i++) {
            // Si tiene más de 0 días de retraso
            if (prestamos[i].getDias_retra() > 0) {
                double multa = 0;

                // Precio por día según tipo
                if (prestamos[i].getDias_retra() == 1) {
                    /*EN EL CODIGO ORIGINAL MULTIPLICABA POR EL TIPO DE LIBRO
                    Y NO POR EL NUMERO DE DIAS DE RETRASO*/
                    multa = prestamos[i].getDias_retra() * 0.50; // 0.50€ por día prestamos normales
                } else {
                    multa = prestamos[i].getDias_retra() * 1.20; // 1.20€ por día novedades
                }

                // Recargo extra si el retraso es de más de una semana
                if (prestamos[i].getDias_retra() > 7) {
                    multa = multa + 5.0;
                }

                System.out.println("prestamo: " + prestamos[i].getNombre() + " | Multa: " + multa + " euros");
                total_multas = total_multas + multa;
            } else {
                System.out.println("prestamo: " + prestamos[i].getNombre() + " | Sin retraso");
            }
        }

        System.out.println("---------------------------");
        System.out.println("RECAUDACION TOTAL: " + total_multas + " euros");
    }
}
