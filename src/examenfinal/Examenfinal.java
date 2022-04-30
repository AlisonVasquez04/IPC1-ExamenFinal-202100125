/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Examenfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("1. Problema 1 ");
            System.out.println("2. Problema 2 ");
            System.out.println("3. Problema 3");
             System.out.println("4. Salir");
             
         System.out.println("Introduzca una opción ");
         opcion = sn.nextInt();
         
          switch (opcion) {
              
              
              case 4:
                salir=true;
                break;
          }
    }
    }   
}
