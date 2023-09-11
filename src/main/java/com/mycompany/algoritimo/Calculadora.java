/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritimo;

import java.util.Scanner;

/**
 *
 * @author romario.2919
 */
public class Calculadora {
    
    //Declaração da variavel do tipo Scanner
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
         
        // variavel referente a opação calculadora 
        int opcao;
        //Declaração das variaveis  
        float num1, num2, resultado;
        
        //Menu calculadora
        System.out.println("-----------------------------------------");
        System.out.println("Calculadora Das Quatros Operações Basícas");
        System.out.println("-----------------------------------------");
        System.out.println("Selecine uma opação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - divisão");
        System.out.println("-----------------------------------------");
         
         //Entrada opação
        opcao = entrada.nextInt();
        //Entrada Primeiro Valor
        System.out.println("Informe o primeiro número");
        num1 = entrada.nextFloat();
        
        //Entrada Segundo Valor
        System.out.println("Informe o segundo número");
        num2 = entrada.nextFloat();
        
        
        //Seleção 
        if(opcao == 1){
            resultado = num1 + num2;
        }else if(opcao == 2){
            resultado = num1 - num2;
        }else if(opcao == 3){
            resultado = num1 * num2; 
        }else if(opcao == 4){
            resultado = num1 / num2;
        }else{
            System.out.println("Opação inecistente");
        
        } 
        System.out.println("-----------------------------------------");
        
       
        
    }
}
