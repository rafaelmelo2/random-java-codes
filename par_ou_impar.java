package com.mycompany.numeros_inteiros;


import java.util.Scanner;

public class par_ou_impar {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
      
        System.out.println("Digite um número inteiro");
        int n1 = read.nextInt();
        float resto =  n1 % 2;
        if(resto == 0){
            System.out.println("O número é PAR");
        }else{
            System.out.println("O número é IMPAR");
        }
        
        read.close();
        
    }
}
