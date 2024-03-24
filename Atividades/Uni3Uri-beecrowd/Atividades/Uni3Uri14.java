import java.util.Scanner;

public class Uni3Uri14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int centavos = (int) (valor * 100);

        int[] notas_moedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            int qtd_notas_moedas = centavos / notas_moedas[i];
            System.out.printf("%d nota(s) de R$ %.2f%n", qtd_notas_moedas, notas_moedas[i] / 100.0);
            centavos %= notas_moedas[i];
        }

        System.out.println("MOEDAS:");
        for (int i = 6; i < notas_moedas.length; i++) {
            int qtd_notas_moedas = centavos / notas_moedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtd_notas_moedas, notas_moedas[i] / 100.0);
            centavos %= notas_moedas[i];
        }

        scanner.close();
    }
}
