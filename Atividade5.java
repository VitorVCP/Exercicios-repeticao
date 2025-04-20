import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        int n = sc.nextInt();
        long soma = 0;
        
        for (int i = 1; i <= n; i++) {
            soma += Math.pow(i, i);
            System.out.println("A soma de S^" + n + " é: " + soma);
        }
    }
}
