/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1java;

import java.util.Scanner;

/**
 *
 * @author lanz
 */
public class Practica1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parte#1 Declaracion de variales primitivas
        boolean booleano;
        char caracter;
        byte numeroMuyPequeno;
        short numeroPequeno;
        int entero;
        long largo;
        float flotante;
        double doble;
        //Parte#2 Diferencias entre los tipos de datos primitivos
        entero = 97;
        doble = 97;
        caracter = 97;
        
        System.out.println("El valor 97 como entero es: " + entero);
        System.out.println("El valor 97 como doble es: " + doble);
        System.out.println("El valor 97 como caracter es:" + caracter);
        //Parte#3
        String cadena = new String ("Variables de referencia");
        Scanner lector = new Scanner (System.in);
        System.out.println("Los Strings en Java son: " + cadena);
        System.out.println("");
        //Parte#4 Literales y valores por defecto
        booleano = true;
        caracter = '7';
        System.out.println(booleano);
        System.out.println(caracter);
        System.out.println("");
        
        booleano = false;
        caracter = '\u0037';
        System.out.println(booleano);
        System.out.println(caracter);
        
        caracter = '\n';
        System.out.println("El caracter salto de linea en acción");
        System.out.println(caracter);
        
        flotante = (float) 3.14159265;
        System.out.println(flotante);
        
        cadena = "¡Puedes asignar valores a String con literales!";
        System.out.println(cadena);
        System.out.println(caracter);
        //Parte#5 Lectura de datos de usuario
        System.out.println("¿Como te llamas?: ");
        String nombre = lector.nextLine();
        System.out.println("¿Cuantos años tienes?: ");
        int edad = lector.nextInt();
        System.out.println("¡Te llamas " + nombre + " y tienes " + edad + "años");
        
}
}
