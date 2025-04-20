import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da data mais antiga: ");
        int dia1 = scanner.nextInt();
        System.out.print("Digite o mês da data mais antiga: ");
        int mes1 = scanner.nextInt();
        System.out.print("Digite o ano da data mais antiga: ");
        int ano1 = scanner.nextInt();

        System.out.print("Digite o dia da data mais recente: ");
        int dia2 = scanner.nextInt();
        System.out.print("Digite o mês da data mais recente: ");
        int mes2 = scanner.nextInt();
        System.out.print("Digite o ano da data mais recente: ");
        int ano2 = scanner.nextInt();

        int DiaDoMes = switch (mes1) {
            case 1 -> 31;
            case 2 -> 31 + 28;
            case 3 -> 31 + 28 + 31;
            case 4 -> 31 + 28 + 31 + 30;
            case 5 -> 31 + 28 + 31 + 30 + 31;
            case 6 -> 31 + 28 + 31 + 30 + 31 + 30;
            case 7 -> 31 + 28 + 31 + 30 + 31 + 30 + 31;
            case 8 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
            case 9 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            case 10 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            case 11 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            case 12 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
            default -> throw new IllegalArgumentException("Mês inválido: " + mes1);
        }; 
        dia1 += (ano1 * 365) + (DiaDoMes);

        int DiaDoMes2 = switch (mes2) {
            case 1 -> 31;
            case 2 -> 31 + 28;
            case 3 -> 31 + 28 + 31;
            case 4 -> 31 + 28 + 31 + 30;
            case 5 -> 31 + 28 + 31 + 30 + 31;
            case 6 -> 31 + 28 + 31 + 30 + 31 + 30;
            case 7 -> 31 + 28 + 31 + 30 + 31 + 30 + 31;
            case 8 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
            case 9 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            case 10 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            case 11 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            case 12 -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
            default -> throw new IllegalArgumentException("Mês inválido: " + mes2);
        }; 
        dia2 += (ano2 * 365) + (DiaDoMes2);

        dia2 -= dia1;
        if (!(dia2 % 1461 == 0)) {
            System.out.println("Foram " + (dia2 + (dia2 % 1461)) + " Dias entre esses anos.");
        }
    }
}
