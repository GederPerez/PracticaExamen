/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numpares60993;

import java.util.Scanner;

/**
 *
 * @author lanz
 */
public class NumPares60993 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 1;
        
        for ( num = 1; num <= 47; num++){
            if (num%2 ==0){
                System.out.println(num + " Par " );
            }
        }
    }
    
}
