package com.mycompany.numeros_inteiros;


import java.util.Scanner;

public class indice_massa_corporal {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
      
        System.out.println("Digite o peso da pessoa: ");
        double peso = read.nextDouble();
        System.out.println("Digite a altura da pessoa: ");
        double altura = read.nextDouble();     
        read.close();
     
        double imc = peso/(altura*altura);
        
        if(imc<16){
            System.out.println("IMC: "+ imc + ", MAGREZA GRAVE");
        }else if(imc < 17 ){
            System.out.println("IMC: "+ imc + ", MAGREZA MODERADA");
        }else if( imc < 18.5){
            System.out.println("IMC: "+ imc + ", MAGREZA LEVE");   
        }else if(imc < 25){
            System.out.println("IMC: "+ imc + ", SAUDÁVEL");
        }else if(imc < 30){
            System.out.println("IMC: "+ imc + ", SOBREPESO");
        }else if(imc < 35){
            System.out.println("IMC: "+ imc + ", OBESIDADE GRAU I");
        }else if(imc < 40){
            System.out.println("IMC: "+ imc + ", OBESIDADE GRAU II");
        }else{
          System.out.println("IMC: "+ imc + ", OBESIDADE GRAU II");
        }
       
        
    }
}
