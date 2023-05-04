package com.mycompany.numeros_inteiros;


import java.util.Scanner;

public class tres_inteiros {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);  
        
        System.out.println("Digite o 1 número inteiro");
        int n1 = read.nextInt();
        System.out.println("Digite o 2 número inteiro");
        int n2 = read.nextInt();
        System.out.println("Digite o 3 número inteiro");
        int n3 = read.nextInt();
        read.close();
        
  
        int multiplicacao = n1*n2*n3;
        System.out.println("Produto: " + multiplicacao);
        
    }
}
