import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do pedágio ao qual se nega a pagar: ");
        double valorNegado = scanner.nextDouble();

        int negado = 0;
        int trechos = 0;
        int trechoAcima = 0;

        while (true) {
            trechos++;

            System.out.print("Digite o custo do pedágio "+ trechos +" (ou um valor negativo para encerrar): ");
            double pedagio = scanner.nextDouble();

            if (pedagio < 0) {
                break;
            }

            System.out.print("Digite a distância do trecho em km: ");
            double distancia = scanner.nextDouble();

            if (pedagio > valorNegado) {
                negado++;
            }

            else if (distancia > 150 && pedagio <= valorNegado) {
                trechoAcima++;
            }

        }

        System.out.println("Trechos com valor de pedágios negados: " + negado);
        System.out.println("Total de trechos informados: " + trechos);
        System.out.println("Trechos acima de 150 km com valor de pedágio aceitável por Astolfo: " + trechoAcima);

        scanner.close();
    }
}