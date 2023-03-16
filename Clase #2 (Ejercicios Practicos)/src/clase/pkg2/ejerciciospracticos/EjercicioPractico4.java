/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2.ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico4 {
   public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor en °C y se devolvera en °F");
        
        int num = leer.nextInt();
    
        System.out.println(num + " °C equivalen a " + (32+(9*num/5)) + " °F.");
        
   }
}
