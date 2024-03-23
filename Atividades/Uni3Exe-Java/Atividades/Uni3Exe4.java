import java.util.Scanner;

public class Uni3Exe4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor da primeira nota (p5): ");
            double n1 = scanner.nextDouble();

            System.out.print("Digite o valor da segunda nota (p3): ");
            double n2 = scanner.nextDouble();

            System.out.print("Digite o valor da terceira nota (p2): ");
            double n3 = scanner.nextDouble();

            int p1 = 5;
            int p2 = 3;
            int p3 = 2;

            double somaNota = ((n1 * p1) + (n2 * p2) + (n3 * p3));
            double somaPeso = p1+p2+p3;

            double calculo = somaNota / somaPeso;

            System.out.println("O valor da media é: " + calculo);
        }
    }
}
