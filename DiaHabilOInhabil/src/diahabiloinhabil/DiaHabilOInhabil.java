/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabiloinhabil;

import java.util.Scanner;

/**
 *
 * @author lanz
 */
public class DiaHabilOInhabil {

    private static MetodoDia Metodo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introdusca un dia de la semana");
        MetodoDia dia = Metodo Dia();
        
        System.out.println("Introdusca un dia de la semana");
        dia.setDia(sc.nextLine());
        System.out.println(dia.getDia());
    }
    
}

class MetodoDia {
    
    private String dia;
    private String diaHF;
    
    public void setDia(String dia){
        
        this.dia = dia;
        
        if(this.dia.equalsIgnoreCase("lunes")|| this.dia.equalsIgnoreCase("martes")||
                this.dia.equalsIgnoreCase("miercoles")|| this.dia.equalsIgnoreCase("jueves")||
                this.dia.equalsIgnoreCase("viernes")){
            this.diaHF = "Dia Habil";
            
        } else if(this.dia.equalsIgnoreCase("sabado")|| this.dia.equalsIgnoreCase("domingo")){
        
            System.out.println("Dia inhabil, fin de semana");
            this.diaHF = "Fin de semana";
    } else{
            this.diaHF = "Introduce un dia correcto";
        }
    }
    public String getDia(){
        return this.diaHF;
    }
}