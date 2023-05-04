package com.mycompany.numeros_inteiros;


import java.util.Scanner;

public class multiplos {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
      
        System.out.println("Digite o primeiro número inteiro");
        int n1 = read.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int n2 = read.nextInt();     
        read.close();
     
        float resto =  n2%n1;
        if(resto == 0){
            System.out.println("O número NÃO é MÚLTIPLO");
        }else{
            System.out.println("O número é MÚLTIPLO");
        }
        
    }
}
