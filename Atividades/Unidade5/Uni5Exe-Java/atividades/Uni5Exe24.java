import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite de peso dos peixes: ");
        double limite = scanner.nextDouble();
        double totalPeixe = 0;

        String resposta;
        do {
            System.out.println();
            System.out.print("Deseja informar o peso de mais um peixe (s/n)?: ");
            resposta = scanner.next();

            if (resposta.equalsIgnoreCase("SIM")) {
                System.out.println();
                System.out.print("Digite o peso do peixe: ");

                double peixe = scanner.nextDouble();
                totalPeixe += peixe;
                System.out.println("Peso total dos peixes apos o ultimo peixe: " + totalPeixe);
            }
        } while (resposta .equalsIgnoreCase("SIM"));


        if (totalPeixe >= limite) {
            System.out.println();
            System.out.println("Limite de peso dos peixes atingido.");
            System.out.println("Peso total dos peixes: " + totalPeixe);
        } else {
            System.out.println("Peso total dos peixes: " + totalPeixe);
        }

        scanner.close();
    }
}
