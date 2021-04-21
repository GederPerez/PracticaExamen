/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.Scanner;

/**
 *
 * @author lanz
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce una hora en formato de 24hrs del dia para ver tu horario");
        int hora = sc.nextInt();
        
        if(hora >= 0 && hora <= 24){
            if(hora >= 1 && hora <= 24){
                if (hora == 6){
                    System.out.println("Despertar a las" + hora + "de la mañana");
                } else if(hora == 7){
                System.out.println("Desayunar a las " + hora + " de la mañana");
            } else if(hora >= 8 && hora < 10){
                System.out.println("Entrar a clases de Fisica Computacional desde las 8 de la mañana hasta las 10 de la mañana");
            } else if(hora >= 10 && hora < 12){
                System.out.println("Entrar a clase de Calculo desde las 10 de la mañana hasta las 12 del medio dia");
            } else if(hora == 12){
                System.out.println("Entrar a la clase de Sistemas1 a las " + hora + " de la tarde");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Estudiar y hacer tarea Desde la 1 pm hasta a las 3 pm");
            } else if(hora == 15){
                System.out.println("Almorzar a las 3 de la tarde");
            } else if(hora >= 16 && hora < 18 ){
                System.out.println("Tiempo de descanso desde las 4 de la tarde, hasta a las 6 de la tarde");
            } else if(hora >= 18 && hora < 20){
                System.out.println("Hacer actividad fisica desde las 6 de la tarde hasta las 8 de la noche");
            } else if(hora == 20){
                System.out.println("Cenar a partir de las 8 de la noche");
            } else if(hora >= 21 && hora < 23){
                System.out.println("Dos horas libres desde las 9 de la noche, hasta las 11 de la noche");
            } else if((hora >= 23 && hora <= 24) || (hora >= 0 && hora < 6)){
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("Dormir desde las 11 de la noche, hasta las 6 de la mañana");
            }
            } else {
                System.out.println("Introduce una hora en el rango de 0 a 24 Hrs");
                System.out.println("Introduce una hora en el rango de 1 a 24 Hrs");
            }
        }
    }
    
}
