/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicios;

import java.util.Scanner;

/**
 *
 * @author romario.29191
 */
public class Lista_numero_maior {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.println("--------------------------");
        //Usuario Informrá os números dessejado;
        System.out.println("Informe números 1");
        num1 = entrada.nextInt();
        System.out.println("--------------------------");
        System.out.println("Informe  números 2");
        System.out.println("----------------------------");
        num2 = entrada.nextInt();
        
        if(num1 > num2){
            System.out.println(num1 + " é maior do que " + num2);
        }else if(num1 < num2){
            System.out.println(num1 + " é menor do que " + num2);
        }else{
            System.out.println(num1 + " é igual a " + num2);
        }
    }
}
