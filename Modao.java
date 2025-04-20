import java.util.Scanner;

public class Modao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Por favor, insira o valor inicial da conta. ");
        double conta = sc.nextDouble();
        System.out.print("agora insira o valor de uma dose. ");
        double dose = sc.nextDouble();
        System.out.println("deseja ouvir mais um modão?\n[1] Sim \n[2] Não");
        int repetir = sc.nextInt();
        for (i = 0; repetir == 1; i++) {
        System.out.println("deseja ouvir mais um modão?\n[1] Sim \n[2] Não");
        repetir = sc.nextInt();
        }
        System.out.println("você bebeu " + i + " doses e o valor foi " + (dose * i) + ", adicionando os 10% do garçom, sua conta ficou de: " + ((conta + dose * i) * 110 / 100) + "\n que bom que as duas são ricas.");
    }
}