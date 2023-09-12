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
public class Porcentagem_de_um_determidado_numero {
    public static void main(String[] args) {
        //Declara que sera exibido na tela
        Scanner entrada = new Scanner(System.in);
        //variavel para número quebrados
        float numero, porcentagem, resultado;
        
        //Printa na tela para o usuario 
        System.out.println("Ecolha o numeruo para retirar a porcentagem de 10%");
        
        //permite a entrada do numero escolhido 
        numero = entrada.nextInt();
        
        System.out.println("Valor da porcentagem");
        
        porcentagem = entrada.nextInt();
       
       
        //aqui foi utilizado (float devido ao confrito)
        resultado = (float) (numero * porcentagem / 100);
        
        System.out.println("Resultado da Porcetageam " + resultado);
   
       
        
                 
        
        
        
                
    }
    
}
