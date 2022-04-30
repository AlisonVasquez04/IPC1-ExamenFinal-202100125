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
              
              case 1:
                  int numero1;
                  int numero2;
                  Scanner numeros = new Scanner(System.in);
                  System.out.println("Ingrese el primer número");
                  numero1 = numeros.nextInt();
                  System.out.println("Ingrese el segundo número");
                  numero2 = numeros.nextInt();
                  
                  if(numero1>numero2){
                      System.out.println("El número mayor es:" +numero1);
                      
                  }else{
                     System.out.println("El número mayor es:" +numero2); 
                  }
                  break;
              case 2:
                  int numero;
                  Scanner piramide = new Scanner(System.in);
                  System.out.println("Ingrese el primer número");
                  numero = piramide.nextInt();
                  for (int i=0; i<numero; i++){
                      for (int j =0; j> numero-i; j++){
                      System.out.println("  ");
                      }
                        for(int k=0; k<i; k++){
                        System.out.print("*");
                  }
                      System.out.println();    
                  }
                  break;
              case 4:
                salir=true;
                break;
          }
    }
    }   

   



}
