/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2java;

/**
 *
 * @author lanz
 */
public class Practica2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parte#1 Operadores urinarios
        //Operadores de incremento
        int x = 10;
        int y = 10;
        boolean b = false;
        System.out.println("Valor inicial de x : " + x);
        System.out.println("Valor inicial de y : " + y);
        System.out.println("Valor de X con pre-incremento : " + ++x);
        System.out.println("Valor de Y con pos-incremento : " + y++);
        System.out.println("Valor final de x : " + x);
        System.out.println("Valor final de y : " + y);
        
        //Operadores positovo/negativo| complemento booleano
        System.out.println("El negativo de X es: " + -x);
        System.out.println("El complemento de b es: " + !b);
        //Operador inversor a nivel de bits
        x = 192;
        System.out.println("El numero 192 en binario es: " + Integer.toBinaryString(x));
        System.out.println("El inverso de 192 en binario es:" + Integer.toBinaryString(~x));
        System.out.println("El inverso de 192 es:" + ~x);
        //Operador cast
        x = (int) 5.9999999999;
        System.out.println("Casteando un doble en entero es: " + x);
        // Segunda parte – Operadores binarios
        // Operadores aritméticos
        x = 5;
        y = 5;
        System.out.println("Suma : 5 + 5 = " + (x + y));
        System.out.println("Resta : 5 – 5 = " + (x - y));
        System.out.println("Multiplicación : 5 * 5 = " + (x * y));
        System.out.println("División : 5 / 5 = " + (x / y));
        System.out.println("Módulo : 5 % 5 = " + (x % y));
        // Concatenación
        String frase1 = "¡El operador Suma (+) ";
        String frase2 = "también une cadenas de texto!";
        System.out.println(frase1 + frase2);
        // División entera
        x = 7;
        y = 4;
        double z = x / y; // El resultado real es 1.75
        System.out.println("La división 7 / 4 es : " + z);
        // Operadores lógico-relacionales
        b = (x > y); // ¿7 mayor que 4? – true
        boolean b2 = (x < y); // ¿7 menor que 4? - false
        boolean b3 = (x != y); // ¿7 diferente de 4? – true
        System.out.println(" 7 > 4 AND 7 < 4? : " + (b && b2));
        System.out.println(" 7 > 4 OR 7 < 4? : " + (b || b2));
        System.out.println(" 7 > 4 AND 7 != 4? : " + (b && b3));
        System.out.println(" 7 > 4 OR 7 != 4? : " + (b || b3));
        System.out.println("¿frase1 es un String? " + (frase1 instanceof String));
        // Operadores de Asignación
        System.out.println("¡Hemos estado utilizando el operador " + "Asignación desde el principio! ¿Lo habías notado?");
        x = 10;
        y = 10;
        x += 20;
        y = y + 20;
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        // Operadores Bitwise
        int byte1 = 51;
        int byte2 = 112;
        System.out.println("El byte1 en binario: " + Integer.toBinaryString(byte1));
        System.out.println("El byte2 en binario: " + Integer.toBinaryString(byte2));
        System.out.println("Operacion Bitwise AND: " + Integer.toBinaryString(byte1 & byte2));
        System.out.println("Operacion Bitwise OR: " + Integer.toBinaryString(byte1 | byte2));
        System.out.println("Operacion Bitwise XOR: " + Integer.toBinaryString(byte1 ^ byte2));
        System.out.println("Desplazamiento 3 lugares a la izquierda: " + Integer.toBinaryString(byte1 << 3));
        System.out.println("Desplazamiento 3 lugares a la derecha: " + Integer.toBinaryString(byte1 >> 3));
        System.out.println("Desplazamiento sin signo 3 lugares a la " + "derecha: " + Integer.toBinaryString(byte1 >>> 3));
        
    }
    
}
