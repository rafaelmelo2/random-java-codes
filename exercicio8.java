    
package programaslista.pkg3;
import java.util.Scanner;






public class exercicio8 {
    public static class EmpregadoDaFaculdade{
        private String nome;
        private double salario;

        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

        public double getSalario(){
            return salario;
        }
        public void setSalario(double salario){
            this.salario = salario;
        }
    
    
        public String toString() {
            return "Nome: " + nome + ", Salário: " + salario;
        }
    }
    
    
    public static class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
        private int horasAula;

        public int getHorasAula() {
            return horasAula;
        }

        public void setHorasAula(int horasAula) {
            this.horasAula = horasAula;
        }
        public double getSalarioAtual(){
            return ((getSalario())+ this.horasAula*0.1);
        }
        public String toString(){
            return "Nome: " + getNome() + ", Salário: " + getSalario() + ", Horas: " + getHorasAula(); 
        }
    }
    
    public static void main(String[] args) {
        
        
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
        empregado.setNome("João");
        empregado.setSalario(2000.0);

        ProfessorDaFaculdade professor = new ProfessorDaFaculdade();
        professor.setNome("Maria");
        professor.setSalario(3000.0);
        professor.setHorasAula(40);
        System.out.println("Empregado: " + empregado.toString() + "\nProfessor: " + professor.toString() );
        
    }
}
