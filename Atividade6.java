import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIdade = -1;
        int menorIdade = Integer.MAX_VALUE;
        int contadorMulheresVerdeLouro = 0;

        while (true) {
            System.out.print("Digite a idade (-1 para encerrar): ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade == -1) {
                break;
            }

            System.out.print("Digite o sexo (masculino/feminino): ");
            String sexo = scanner.nextLine().toLowerCase();

            System.out.print("Cor dos olhos (azuis/verdes/castanhos): ");
            String olhos = scanner.nextLine().toLowerCase();

            System.out.print("Cor dos cabelos (louros/castanhos/pretos): ");
            String cabelos = scanner.nextLine().toLowerCase();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo.equals("feminino") &&
                olhos.equals("verdes") &&
                cabelos.equals("louros") &&
                idade >= 18 && idade <= 35) {

                contadorMulheresVerdeLouro++;
            }

            System.out.println();
        }

        System.out.println("\nRESULTADOS:");
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de mulheres com olhos verdes e cabelos louros entre 18 e 35 anos: " + contadorMulheresVerdeLouro);

    }
}