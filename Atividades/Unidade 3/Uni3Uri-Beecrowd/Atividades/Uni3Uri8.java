import java.util.Scanner;

public class Uni3Uri8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peca1 = scanner.nextLine().split(" ");
        String[] peca2 = scanner.nextLine().split(" ");

        int codigoPeca1 = Integer.parseInt(peca1[0]);
        int numPeca1 = Integer.parseInt(peca1[1]);
        double valorUnitarioPeca1 = Double.parseDouble(peca1[2]);

        int codigoPeca2 = Integer.parseInt(peca2[0]);
        int numPeca2 = Integer.parseInt(peca2[1]);
        double valorUnitarioPeca2 = Double.parseDouble(peca2[2]);

        double totalAPagar = (numPeca1 * valorUnitarioPeca1) + (numPeca2 * valorUnitarioPeca2);

         
        System.out.println(codigoPeca1);
        System.out.println(codigoPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAPagar);

        scanner.close();
    }
}
