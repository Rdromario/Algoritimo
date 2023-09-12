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
public class Contagem_regresiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int c; 
        
        System.out.println("Imorme o valor");
        System.out.println("--------------");
        c = entrada.nextInt();
        System.out.println("--------------");
        while(c >= 0){
            
            System.out.println(c);
            
            c = c - 1;             
        }
                
    }
    
}
