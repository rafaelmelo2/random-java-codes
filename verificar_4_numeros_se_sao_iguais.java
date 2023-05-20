
package programaslista.pkg3;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        int n1,n2,n3,n4;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o PRIMEIRO NUMERO: ");
        n1 = read.nextInt();
        System.out.println("Digite o SEGUNDO NUMERO: ");
        n2 = read.nextInt();
        System.out.println("Digite o TERCEIRO NUMERO: ");
        n3 = read.nextInt();
        System.out.println("Digite o QUARTO NUMERO: ");
        n4 = read.nextInt();
        
        if (n1 == n2 && n1 == n3 && n1 == n4) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("Os números não são iguais!");
        }
        
    }
    
}
