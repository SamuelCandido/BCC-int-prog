import java.util.Scanner;

public class Uni3Exe6 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o peso do prato em KG: ");
            double kg = scanner.nextDouble();

            double pesoComida = kg - 0.750;

            double calculo = pesoComida * 25;

            System.out.println("O valor total a pagar é R$" + calculo);
        }
    }
}
