
package frequencia_cardiaca;


public class Pessoa {
    String nome = "Nome default";
    int idade = 0;
    int frequenciaCardiaca = 0;
    
    int frequenciaCardiacaMaxima(int idade){
        int frequenciaCardiacaMaxima =0;
        frequenciaCardiacaMaxima = 220-idade;
        return frequenciaCardiacaMaxima;
    }
}
