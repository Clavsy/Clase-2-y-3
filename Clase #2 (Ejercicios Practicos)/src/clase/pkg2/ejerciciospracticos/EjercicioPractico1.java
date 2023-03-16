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
public class EjercicioPractico1 {
    
      public static void main(String[] args) {
          
          System.out.println("Ingrese un numero a sumar:");
          
          Scanner leer = new Scanner(System.in);
          
          int num1 = leer.nextInt();
          
          System.out.println("Ingrese otro numero a sumar:");
          
          int num2 = leer.nextInt();
          
          int suma = num1 + num2;
          
          System.out.println( "El resultado es " + suma );
          
      }
    
}
