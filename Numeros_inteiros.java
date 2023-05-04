package com.mycompany.numeros_inteiros;


import java.util.Scanner;

public class Numeros_inteiros {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite o 1 número inteiro");
        int n1 = read.nextInt();
        System.out.println("Digite o 2 número inteiro");
        int n2 = read.nextInt();
        System.out.println("Digite o 3 número inteiro");
        int n3 = read.nextInt();
        read.close();
        
        System.out.println("Números " + n1 + ", " + n2 + ", " + n3);
            
        int soma = n1+n2+n3;
        System.out.println("Soma: " + soma);
       
        float media = (n1+n2+n3)/3;
        System.out.println("Média: " + media);
        
        int multiplicacao = n1*n2*n3;
        System.out.println("Multiplicação: " + multiplicacao);
        
        int maior_numero = n1;
        if(n2 > maior_numero)
            maior_numero = n2;
        
        if(n3 > maior_numero)
            maior_numero = n3;
        
        System.out.println("Maior número: " + maior_numero);

    }
}
