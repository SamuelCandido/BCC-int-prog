import java.util.Scanner;

public class Uni3Exe5 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de frangos: ");
            double frango = scanner.nextDouble();

            double aChip = 4;
            double aComida = 7;

            double aneis = aChip + aComida;

            double calculo = frango * aneis;

            System.out.println("O valor gasto com os frangos é: " + calculo);
        }
    }
}
