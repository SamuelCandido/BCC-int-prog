import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe o valor da base da parede: ");
            double base = scanner.nextDouble();

            System.out.print("Informe o valor da altura da parede: ");
            double altura = scanner.nextDouble();

            double area = base * altura;

            double azuleijos = area * 9;

            double vMetroQuadrado = azuleijos * 12.50;

            System.out.println("A quantidade de azuleijos gastos é: " + azuleijos    );
            System.out.println("O valor dos azuleijos R$:" + vMetroQuadrado    );
        }
    }
}