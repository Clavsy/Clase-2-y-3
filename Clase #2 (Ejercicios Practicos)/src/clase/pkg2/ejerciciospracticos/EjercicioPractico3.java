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
public class EjercicioPractico3 {
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        String frase;
        
        System.out.println("Ingrese una frase:");
        
        frase = leer.nextLine();
        
        frase = frase.toUpperCase();
        System.out.println("Frase en mayusculas:");
        System.out.println( frase );
        
        frase = frase.toLowerCase();
        System.out.println("Frase en minusculas:");
        System.out.println( frase );
    
    }
}
    
