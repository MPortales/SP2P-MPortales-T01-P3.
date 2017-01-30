/*Maythé Portales Barrios
A01411461
Ing. Industrial y de Sistemas
Problema 3
 */
package spp2.mportales.t01.p3;
import java.util.Scanner;
/**
 *
 * @author may37
 */
public class SPP2MPortalesT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de distancia de entre dos puntos");
        Scanner teclado= new Scanner(System.in);
        double x1, y1, x2, y2, D;
        System.out.println("Introduce el punto x1");
        x1 = teclado.nextDouble();
        System.out.println("Introduce el punto x2");
        x2 = teclado.nextDouble();
        System.out.println("Introduce el punto y1");
        y1 = teclado.nextDouble();
        System.out.println("Introduce el punto y2");
        y2 = teclado.nextDouble();
        D = Math.sqrt(Math.pow(x1-x2,2)+ Math.pow(y1-y2,2));
        System.out.println("La distancia es " +D);
        
                
        
    }
    
}
