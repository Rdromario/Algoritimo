/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetores;

/**
 *
 * @author romario.2919
 */
public class Soma_de_Elemetos {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int soma = 0;
        numeros[0] = 20;
        numeros[1] = 20;
        numeros[2] = 20;        
        numeros[3] = 20;
        numeros[4] = 520;
        
        for(int i = 0; i < numeros.length; i++){
   
            soma = soma + numeros[i];
            
       }
        System.out.println(" A somas dos Números " +soma);
    }
}
