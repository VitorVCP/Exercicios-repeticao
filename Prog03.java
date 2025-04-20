
import java.util.Scanner;

public class Prog03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escolha um número inteiro.");
        numero = sc.nextInt();
        long fator = 1;
        for (int i = 1; i <= numero; i++) {
            fator *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fator);
    }
}
