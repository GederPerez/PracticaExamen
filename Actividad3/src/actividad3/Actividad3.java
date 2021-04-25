/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * @author lanz
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=======================================");
        System.out.println("==========   Bienvenido  ==============");
        System.out.println("=======================================");
        System.out.println("");
        System.out.println("Escoge un numero de la lista");
        System.out.println("");
        System.out.println("Suma del 1 al 10 == [1]");
        System.out.println("Factorial de 10 == [2]");
        System.out.println("Factorial introducido por ususario == [3]");
        System.out.println("Media del 0 hasta el numero introducido por el usuario == [4]");
        System.out.println("Promedio de n  numeros introducido por el ususario == [5]");
        System.out.println("Dia de la semana == [6]");
        System.out.println("Juego del gato == [7]");
        System.out.println("");
        System.out.print("Introduzca un número: ");
        
        actividad3(sc.nextInt());
        
    }

    private static void actividad3(int numero) {
        
        Scanner sc = new Scanner (System.in);
        
        int numeroE = numero;
        
        switch (numeroE){
        
            case 1:
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("===========  Suma del 1 al 10  ========");
                System.out.println("=======================================");
                System.out.println("");
                suma();
                break;
            case 2:
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("========= Factorial del 1 al 10 =======");
                System.out.println("=======================================");
                System.out.println("");
                factorial();
                break;
            case 3:
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("==============  Factorial  ============");
                System.out.println("=======================================");
                System.out.println("");
                System.out.println("Introduzca un número para calcular el factorial: ");
                scFactorial(sc.nextInt());
                break;
            case 4:
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("================  Media  ==============");
                System.out.println("=======================================");
                System.out.println("");
                System.out.println("Introduzca un número para calcular la media: ");
                media(sc.nextDouble());
                break;
            case 5:
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("===============  Promedio  ============");
                System.out.println("=======================================");
                System.out.println("");
                System.out.println("Introduzca una cantidad de numeros");
                sumaPromedio(sc.nextInt());
            case 6:
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("===========  Dia de la semana  ========");
                System.out.println("=======================================");
                System.out.println("");
                diaSemana();
                break;
            case 7:
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("===========  Juego del gato  =========");
                System.out.println("=======================================");
                System.out.println("");
                gato();
                break;
                
    }
    
}


public static void suma(){
    
    int suma = 0;
    
    for (int i = 1; i <= 10; i++){
        
        suma += i;
        
    }
    
    System.out.println("La suma del 1 al 10 es de: " + suma);
    
}

public static void factorial(){
    
    int factorial = 1;
    
    for (int i = 10; i >= 1; i--){
        
        factorial *= i;
        
    }
    System.out.println("El factorial de 10 es de: " + factorial);
    
}

public static void scFactorial(int numeroE){
    
    int numero = numeroE;
    int factorial = 1;
    
    for (int i = numero; i >= 1; i--){
        
        factorial *= i;
    }
    System.out.println(" El factorial de " + numero + "es de: " + factorial);
    
}

public static void media(double numeroE){
    
    double numeroI = numeroE;
    double suma = 0;
    
    for(int i = 1; i <= numeroI; i++){
        
        suma += i;
    }
    double media = suma/numeroI;
    
    System.out.println("La media de los números que estan entre 0 y " + numeroI + "es " + media);
    
}

public static void sumaPromedio(int numeroI){
    
    Scanner sc = new Scanner(System.in);
    
    int numero = numeroI;
    int suma = 0;
    double promedio;
    int diferencia;
    
    int array[] = new int [numero];
    
    for (int i = 0; i < array.length; i++){
        
        System.out.println("Introduzca un numero " + (i+1) + ": ");
        array[i] = sc.nextInt();
        
    }
    int mayor, menor;
    mayor = menor = array[0];
    
    for (int i = 0; i < array.length; i++){
        
        if (array[i] > mayor){
            mayor = array[i];
        } else if (array[i] < menor){
            menor = array[i];
        }
        
        suma += array[i];
    }
    
    promedio = (double)suma / (double)numero;
    diferencia = mayor - menor;
    
    System.out.println("Los numeros introducidos fueron: " + numero);
    System.out.println("El promedio de los numeros es de: " + promedio);
    System.out.println("El numero mayor es:" + mayor);
    System.out.println("El numero menor es: " + menor);
    System.out.println("La diferencia del mayor y menor es de: " + diferencia);
    
}

public static void diaSemana(){
 
    String dias[] = new String[7];
    
    dias[0] = "Lunes";
    dias[1] = "Martes";
    dias[2] = "Miercoles";
    dias[3] = "Jueves";
    dias[4] = "Viernes";
    dias[5] = "Sabado";
    dias[6] = "Domingo";
    
    for(String diaS : dias){
        System.out.println(diaS);
        
    }
}

public static void gato(){
    
    String gato[][] = new String [3][3];
    
    for (String V[]: gato){
        for (String H:V){
            System.out.println("+" + " ");
        }
        System.out.println("");
    }
  }
}