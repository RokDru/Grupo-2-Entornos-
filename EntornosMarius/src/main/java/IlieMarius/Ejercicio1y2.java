/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IlieMarius;

/**
 *
 * @author WEB1-26
 */
public class Ejercicio1y2 {

    public static int mayor(int a, int b, int c) {
        int tmp;
        tmp = c;
        if (a >= b) {
            if (a >= c) {
                tmp = a;
            }
        } else {
            if (b >= c) {
                tmp = b;
            }
        }
        return tmp;
    }

    public static int calcularMCM(int a, int b) {
        int resultadoMCM = 0;
        if (a != 0 && b != 0) {
            if (a < 0) {
                a = -a;
            }
            if (b < 0) {
                b = -b;
            }
            int producto = a * b;
            while (b!= 0){
                int temp = a / b;
                a=b;
                b=temp;
            }
            resultadoMCM = producto / a;
        }
        return resultadoMCM;
    }
}
