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
public class Media_entre_tres_numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         float num1, num2, num3,resultado;
         System.out.println("Informe Primeiro Número ");
         num1 = entrada.nextInt();
         System.out.println("Informe Segundo Número ");
         num2 = entrada.nextInt();
         System.out.println("Informe Terceiro Número ");
         num3 = entrada.nextInt();
         
         resultado = (num1 + num2 + num3) / 2 ;
         System.out.println("Informe o resutado" + num1 + " é " + num2 + " é " + num3 + " é " + resultado );
                 
                
    }
    
}
