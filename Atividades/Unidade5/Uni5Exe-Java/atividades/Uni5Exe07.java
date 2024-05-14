import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros você quer escrever");
        int qtd = scanner.nextInt();

        double tempPositivo = 0.0;
        double tempNegativo = 0.0;
        double numero = 0.0;
        double maior = 0.0;
        double menor = 0.0;

        for (int i = 1; i <= qtd; i++) {
            System.out.println();
            System.out.println(i + ") Escreva um numero");
            numero = scanner.nextDouble();
            if (numero >= 0) {
                if (tempPositivo < numero) {
                    tempPositivo = numero;
                    maior = numero;
                }
            }
            else{
                if (tempNegativo > numero) {
                    tempNegativo = numero;
                    menor = numero;
                }
            }

        }
        System.out.println();
        System.out.println("Menor numero: " + menor);
        System.out.println("Maior numero: " + maior);

        scanner.close();
    }
}
