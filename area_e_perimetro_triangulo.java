
package programaslista.pkg3;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        
        double n1,n2, area, perimetro;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Digite A LARGURA: ");
        n1 = read.nextDouble();
        System.out.println("Digite o A ALTURA: ");
        n2 = read.nextDouble();
        
        area = n1*n2;
        perimetro = 2*(n1+n2);
        System.out.println("Area: " + area + "\nPerimetro: " + perimetro);
        
    }
}
