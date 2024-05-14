import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas irão participar");
        int pessoa = scanner.nextInt();

        double soma = 0.0;
        double media = 0.0;
        double altura = 0.0;

        for (int i = 1; i <= pessoa; i++) {
            System.out.println();
            System.out.println("Escreva a altura da pessoa numero " + i);
            altura = scanner.nextDouble();
            soma += altura;
            media = soma / pessoa;

        }

        System.out.println("A media é " + media);

        scanner.close();
    }
}
