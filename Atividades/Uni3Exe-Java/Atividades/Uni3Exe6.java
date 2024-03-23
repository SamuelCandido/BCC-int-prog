import java.util.Scanner;

public class Uni3Exe6 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o peso do prato em gramas: ");
            double gramas = scanner.nextDouble();

            double vGrama = 0.025;

            double calculo = gramas * vGrama;

            System.out.println("O valor total a pagar é R$" + calculo);
        }
    }
}
