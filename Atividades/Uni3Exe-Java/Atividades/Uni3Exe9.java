import java.util.Scanner;

public class Uni3Exe9 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor da altura da lata de oleo: ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o valor do raio da lata de oleo: ");
            double raio = scanner.nextDouble();

            double pi = 3.141592653589793;

            double volume = pi * (raio * raio) * altura;

            System.out.println("O valor do volume da lata é:" + volume);
        }
    }
}
