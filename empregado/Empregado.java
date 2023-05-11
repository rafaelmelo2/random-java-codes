
package empregado;

public class Empregado {
    String nome = "Jose Dias";
    double salarioBruto = 2000.00;
    double salarioNovo = 0.00;
    
    public double calculaIR(double salario){
        if(salario <= 1903.98){
            salarioNovo = salario;
        }if((salario >= 1903.99) && (salario < 2826.65)){
            salarioNovo = (salario - (salario * (7.5/100)));
        }if((salario >= 2826.65) && (salario < 3751.05)){
            salarioNovo = (salario - (salario * (15.0/100)));
        }if((salario >= 3751.06) && (salario < 4664.68)){
            salarioNovo = (salario - (salario *(22.5/100)));
        }if(salario >= 4664.68){
            salarioNovo = (salario - (salario *(27.5/100)));
        }
        return salarioNovo;
        
    }
    
}
