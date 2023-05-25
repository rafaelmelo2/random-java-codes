
package principal;
import java.util.Scanner;
import java.util.Random;


class retornaNumAlea{
    Random random = new Random();
    public int num(){
        return random.nextInt(9000) + 1000;
    }
}




public class Principal {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);  
        Casa imovel1 = new Casa();
        retornaNumAlea numa = new retornaNumAlea();
        
        imovel1.setProprietario("João Bernardes");     
        imovel1.setCodigo(numa.num());      
        imovel1.setLocalidade("Rua dom marco, 22, margon 2");    
        imovel1.setTipo("Casa");
        imovel1.setTamanho(120);
        imovel1.setValor(60000);     
        imovel1.setSituacao("A venda");
        
        imovel1.setBanheiro(1);
        imovel1.setQuarto(3);
        imovel1.setSala(2);
        imovel1.setCozinha(1);
        imovel1.setSacada(0);
        
        
        
        
        
        
        Apartamento apto1 = new Apartamento();
        
        apto1.setProprietario("Frederico bento");     
        apto1.setCodigo(numa.num());      
        apto1.setLocalidade("Rua capitão, 232, centro");    
        apto1.setTipo("Casa");
        apto1.setTamanho(190);
        apto1.setValor(90000);     
        apto1.setSituacao("A venda");
        
             
        apto1.setBanheiro(2);
        apto1.setQuarto(2);
        apto1.setSala(1);
        apto1.setCozinha(1);
        apto1.setSacada(1);
        apto1.setAndar(3);
        apto1.setAptosNoAndar(2);
          
        
        
        System.out.println(imovel1.toString() + " \n\nAPTO: "+apto1.toString());
        
        
    }
    
    
}
