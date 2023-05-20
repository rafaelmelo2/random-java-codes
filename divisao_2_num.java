
package programaslista.pkg3;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int n1,n2;
        double result;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o DIVIDENDO: ");
        n1 = read.nextInt();
        System.out.println("Digite o DIVISOR: ");
        n2 = read.nextInt();
        result = n1/n2;
        
        System.out.println("Resultado: " + result);
        
    }
}
