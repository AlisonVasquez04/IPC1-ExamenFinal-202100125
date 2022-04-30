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
              case 3:
                  
                  //Como no es necesario pedir los datos al usuario
                  // Se ddefine que el mismo programa seleccionó los datos
                  //por ende se eligieron las vacas que producian la mayor de leche
                  // y no sobrepasarse del peso del camión 
                  
                  //8 vacas
                  int v1, v2, v3, v4, v6;
                  int peso;
                  int l1, l2, l3, l4, l6;
                  int leche;
                  v1= 223;
                  v2 = 243;
                  v3 = 100;
                  v4 = 200;
                  v6 = 155;
                  peso =  v1 + v2+ v3+ v4+ v6;
                  l1 = 30;
                  l2= 34;
                  l3 = 28;
                  l4 = 45;
                  l6= 50; 
                  leche = l1 + l2 +  l3 +  l4 +  l6;
                  if (peso>1000){
                      System.out.println("El camión lleva sobrepeso");
                  }else{
                       System.out.println("Produccion total en L:" +leche);
                  }
                  //10 vacas
                   int va1, va2, va3, va4, va5, va6, va7, va10;
                  int peso2;
                  int le1, le2, le3, le4, le5, le6, le7, le10;
                  int leche2;
                  va1= 340;
                  va2 = 355;
                  va3 = 223;
                  va4 = 243;
                  va5 = 130;
                  va6 = 240;
                  va7 = 260;
                 
                  va10 = 130;
                  peso2 =  va1 + va2 +  va3 +  va4 +  va5 +  va6 +  va7 + va10;
                  le1 = 45;
                  le2= 50;
                  le3 = 34;
                  le4 = 39;
                  le5 = 29;
                  le6= 40;
                  le7 = 30;
                 
                  le10 = 1;
                  leche2 = le1 + le2 +  le3 +  le4 +  le5 + le6 +  le7 +  le10;
                  if (peso2>2000){
                      System.out.println("El camión lleva sobrepeso");
                  }else{
                       System.out.println("Produccion total en L:" +leche2);
                  }
                  
                  break;
              case 4:
                salir=true;
                break;
          }
    }
    }   

   



}
