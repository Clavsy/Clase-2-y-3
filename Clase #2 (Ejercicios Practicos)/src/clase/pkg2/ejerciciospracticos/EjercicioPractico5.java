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
public class EjercicioPractico5 {
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero. Se le devolvera el doble, triple y su raiz cuadrada.");
        
        int num = leer.nextInt();
                
        System.out.println("El doble del numero es = " + num*2);
        System.out.println("El triple del numero es = " + num*3);
        System.out.println("La raiz cuadrada del numero es = " + Math.sqrt(num));
                
    }
}
