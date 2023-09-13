/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritimo;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author romario.2919
 */
public class Troca_valoers_variaveis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorA, valorB;
        
        System.out.println("Informar valo A");
        valorA = entrada.nextInt();
        System.out.println("---------------");
        System.out.println("Informe valor B");
        valorB = entrada.nextInt();
        
        
        System.out.println("O valor trocado de A é " + valorA + ", e o valor de B é " + valorB);
                
    }
    
}
