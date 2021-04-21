/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1if;

import java.util.Scanner;

/**
 *
 * @author lanz
 */
public class Actividad1if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int añoactual = 2021;
       int nuevoaño, pasado, futuro;
       
       Scanner sc = new Scanner ( System.in);
        System.out.println("¿Que año desea diferenciar del acutal?");
        nuevoaño = sc.nextInt();
        
        if (añoactual > nuevoaño){
            pasado = añoactual - nuevoaño;
            System.out.println("Han pasado " + pasado + "años" );
        } else {
            futuro = nuevoaño - añoactual;
            System.out.println("Faltan "+ futuro + "años");
        }
       
    }
    
}
