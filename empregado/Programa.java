
package empregado;


public class Programa{

   
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        System.out.println("Nome: " + empregado1.nome + "\nSalário BRUTO: " + empregado1.salarioBruto + "\nSalário após IR: " + empregado1.salarioNovo);
        empregado1.salarioBruto = empregado1.calculaIR(3200);
        System.out.println("Nome: " + empregado1.nome + "\nSalário BRUTO: " + empregado1.salarioBruto + "\nSalário após IR: " + empregado1.salarioNovo);
        
    }
    
}
