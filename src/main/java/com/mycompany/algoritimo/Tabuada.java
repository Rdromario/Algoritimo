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
public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int multiplicacao, tabuada, cont = 1; 
        System.out.println("Ifome a Tabuada Desejada");
        System.out.println("------------------------");
        tabuada = entrada.nextInt();
        System.out.println("------------------------");
        
        while(cont <= 10){
            multiplicacao = tabuada * cont;
            System.out.println(tabuada + " x " + cont + " = " + multiplicacao);
            cont = cont + 1;
        }
    }
}
      

