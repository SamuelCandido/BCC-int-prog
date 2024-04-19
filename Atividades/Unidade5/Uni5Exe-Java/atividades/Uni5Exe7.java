import java.util.Scanner;

public class Uni5Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantantos numeros você quer escrever");
        int qtd = scanner.nextInt();

        double media = 0.0;
        double numero = 0.0;

        for (int i = 1; i <= qtd; i++) {
            System.out.println();
            System.out.println("Escreva a altura da pessoa numero " + i);
            numero = scanner.nextDouble();
            //Vai precisar de lista

        }

        System.out.println("A media é " + media);

        scanner.close();
    }
}
