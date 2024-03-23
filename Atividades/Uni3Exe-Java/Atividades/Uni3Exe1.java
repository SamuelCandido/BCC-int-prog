import java.util.Scanner;

public class Uni3Exe1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um numero para a base: ");
            double base = scanner.nextDouble();

            System.out.print("Digite um numero para a altura: ");
            double altura = scanner.nextDouble();

            double area = base * altura;

            System.out.println("O valor da area é: " + area);

        }
    }
}
