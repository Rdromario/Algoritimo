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
public class Autenticacao_Usuario {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);
        
        String nome, senha;
        Boolean autorizado = false;
        
        while(!autorizado){
        
            System.out.println("Usuário");
            nome = scanner.nextLine();


           System.out.println("seha");
            senha = scanner.nextLine();


            if(nome.equals("Romario") && senha.equals("123")) {
                System.out.println("Autorizado");
                autorizado = true;

            }else{

                System.out.println("Não autorizado");
                System.err.println("Incira novamente as informações");
                autorizado = false;
            }
        }
        
        
        System.err.println(" Entrou no sistama! ");
        
    }
    }
