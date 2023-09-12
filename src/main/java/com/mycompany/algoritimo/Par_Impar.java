/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicios;

import java.util.Scanner;

/**
 *
 * @author romario.2919
 */
public class Par_Impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, resultado;
        
        System.out.println("Imforme o Número");
        numero = entrada.nextInt();
        
        resultado = numero % 2;
        
        if(resultado == 0){
            System.out.println("O número " + numero + " é par");
        }else{
            System.out.println("O número " + numero + " é impar");  
        }
        
        
     
        
        
        
        

        
        
        
         
        
               
        
        
      
                
                
    }
    
}
