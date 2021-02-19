/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion.pkg60993;

import java.util.Scanner;

/**
 *
 * @author lanz
 */
public class Ejercicio1Seleccion60993 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe un numero.");
        num1 = miConsola.nextInt();
        
        System.out.println("Escribe otro numero.");
        num2 = miConsola.nextInt();
        
        System.out.println("Escribe un 3er numero.");
        num3 = miConsola.nextInt();
        
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("El numero mayor es: " + num1);
                                                                }
                else {
                        System.out.println("El numero mayor es: " + num3);
                                                                        }
                        }else
                if (num2 > num3){
                        System.out.println("El numero mayor es: " + num2);
                        
                        }
                else
                    System.out.println("El numero mayor es: " + num3);
            }
}
