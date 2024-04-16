import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma das opções abaixo: ");

        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");
        System.out.println();

        String opcao = scanner.nextLine();
        String opcaoUpper = opcao.toUpperCase();

        double calculo;

        double pi = 3.141592;

        switch (opcaoUpper) {
            case "T":
                System.out.println();
                System.out.println("Escolha um numero para a base do triangulo: ");
                double base = scanner.nextDouble();

                System.out.println();
                System.out.println("Escolha um numero para a altura do triangulo: ");
                double altura = scanner.nextDouble();

                calculo =  base * altura / 2;

                System.out.println("Area do triangulo com os valores fornecido é: " + calculo);
                break;

            case "Q":
                System.out.println();
                System.out.println("Escolha um numero para o lado do quadrado: ");
                double lado = scanner.nextDouble();

                calculo = lado * 4;

                System.out.println("Area do quadrado com o valor fornecido é: " + calculo);
                break;

            case "R":
                System.out.println();
                System.out.println("Escolha um numero para a base do retangulo: ");
                double baseR = scanner.nextDouble();

                System.out.println();
                System.out.println("Escolha um numero para a altura do retangulo: ");
                double alturaR = scanner.nextDouble();
                System.out.println();

                calculo = baseR * alturaR;

                System.out.println("Area do retangulo com os valores fornecido é: " + calculo);
                break;

            case "C":
                System.out.println();
                System.out.println("Escolha um numero para o raio do circulo: ");
                double raio= scanner.nextDouble();

                calculo = pi * (raio*raio);

                System.out.println("Area do circulo com o valor fornecido é: " + calculo);
                break;           

            default:
                System.out.println("Opção invalida, somente T, Q, R ou C");
                break;
        }


        scanner.close();
    }
}
