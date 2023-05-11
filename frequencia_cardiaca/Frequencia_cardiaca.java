
package frequencia_cardiaca;
import java.util.Scanner;


public class Frequencia_cardiaca {


    public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa();
       Pessoa pessoa2 = new Pessoa();
       Scanner sc = new Scanner(System.in);
       Scanner sc1 = new Scanner(System.in);
       
       System.out.println("Digite o nome da Pessoa1: ");
       pessoa1.nome = sc.nextLine();
       System.out.println("Digite a idade da Pessoa1: ");
       pessoa1.idade = sc.nextInt();
       
       System.out.println("Digite a frequencia cardiaca da Pessoa1: ");
       pessoa1.frequenciaCardiaca = sc.nextInt();
       
       
       
       System.out.println("Digite o nome da Pessoa2: ");
       pessoa2.nome = sc1.nextLine();
       System.out.println("Digite a idade da Pessoa2: ");
       pessoa2.idade = sc1.nextInt();
       System.out.println("Digite frequencia cardiaca da Pessoa2: ");
       pessoa2.frequenciaCardiaca = sc.nextInt();
       sc.close();
       sc1.close();
       
       //System.out.println("FreqMAXpessoa1: " + pessoa1.frequenciaCardiacaMaxima(pessoa1.idade));
       //System.out.println("FreqMAXpessoa2: " + pessoa2.frequenciaCardiacaMaxima(pessoa2.idade));
       
       if(pessoa1.frequenciaCardiaca > pessoa1.frequenciaCardiacaMaxima(pessoa1.idade)){
           System.out.println("NOME: " + pessoa1.nome + "\nIdade: "+pessoa1.idade + "\nFrequêcia cardíaca: " + pessoa1.frequenciaCardiaca + "\nALERTA: FREQUENCIA CARDIACA ESTÁ MAIOR QUE FREQUENCIA CARDIACA MAXIMA");
       
       }else{
           System.out.println("NOME: " + pessoa1.nome + "\nIdade: "+pessoa1.idade + "\nFrequêcia cardíaca: " + pessoa1.frequenciaCardiaca);
       }
       
       
       if(pessoa2.frequenciaCardiaca > pessoa2.frequenciaCardiacaMaxima(pessoa2.idade)){
           System.out.println("NOME: " + pessoa2.nome + "\nIdade: "+pessoa2.idade + "\nFrequêcia cardíaca: " + pessoa2.frequenciaCardiaca + "\nALERTA: FREQUENCIA CARDIACA ESTÁ MAIOR QUE FREQUENCIA CARDIACA MAXIMA");
       
       }else{
           System.out.println("NOME: " + pessoa2.nome + "\nIdade: "+pessoa2.idade + "\nFrequêcia cardíaca: " + pessoa2.frequenciaCardiaca);
       }
           
    }
    
}
