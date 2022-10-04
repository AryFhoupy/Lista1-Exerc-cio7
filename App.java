import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        float lado;

        System.out.println("Digite o valor da lateral do quadrado: ");
        lado = scan.nextFloat();
        scan.close();

        System.out.println("O dobro da area do quadrado é: " + ((lado * lado) * 2) );  
    }
}
