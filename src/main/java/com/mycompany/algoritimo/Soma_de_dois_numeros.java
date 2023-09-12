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
public class Soma_de_dois_numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int num1, num2, resultado;
        
        System.out.println("Informe primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Informe segundo número: ");
        num2 = entrada.nextInt();
       
        resultado = num1 + num2;
        System.out.println("O resultado entre as soma " + num1 + " + " + num2 + " é igual á " + resultado );
      
        
        
                
    }
}
