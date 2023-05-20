
package programaslista.pkg3;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        double n1,n2;
        boolean result;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o PRIMEIRO NUMERO: ");
        n1 = read.nextDouble();
        System.out.println("Digite o SEGUNDO NUMERO: ");
        n2 = read.nextDouble();
        result = n1>=0 && n1<=1 && n2>=0 && n2<=1;
        
        System.out.println(result);
        
    }
}
