/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexamen;

/**
 *
 * @author lanz
 */
public class PracticaExamen {

    private static String nombre;
    private static int cantidadUsuarios;
    private static Integer tiempo;
    private static String nivel;
    private static int estrella;
    
    public PracticaExamen(String nombre, int cantidadUsuarios, int tiempo, String nivel, int estrella) {
        PracticaExamen.nombre = nombre;
        PracticaExamen.cantidadUsuarios = cantidadUsuarios;
        PracticaExamen.tiempo = tiempo;
        PracticaExamen.estrella = estrella;
        PracticaExamen.nivel = nivel;
    }
    
    public static int calidad(){
        return cantidadUsuarios*tiempo*estrella;
                
    }
    public static void main(String[] args) {
        
        PracticaExamen miExamen = new PracticaExamen("Zoom", 40, 4, "Libre", 5);
        System.out.println(calidad());
    }
    
}
