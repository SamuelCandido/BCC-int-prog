import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 1 - Soma de dois números.
        2 - Diferença entre dois números.
        3 - Produto entre dois números.
        4 - Divisão entre dois números (o denominador não pode ser zero).
         */
        System.out.println("Escolha uma das opções abaixo: ");
    
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números considere o primeiro numero como denominador");
        int opcao = scanner.nextInt();

        System.out.println();
        System.out.println("Escolha o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println();
        System.out.println("Escolha o segundo numero: ");
        System.out.println();
        double num2 = scanner.nextDouble();


        double calculo;

        switch (opcao) {
            case 1:
                calculo = num1 + num2;
                System.out.println("A soma dos dois numeros resulta em: " + calculo);
                break;

            case 2:
                if (num1 > num2) {
                    calculo = num1 - num2;
                    System.out.println("A diferença entre eles é: " + calculo);
                }

                else if (num2 > num1) {
                    calculo = num2 - num1;
                    System.out.println("A diferença entre eles é: " + calculo);
                }

                else{
                    System.out.println("Numeros iguals logo sem diferença");
                }

                break;

            case 3:
                calculo = num1 * num2;
                System.out.println("O produto dos dois numeros resulta em: " + calculo);
                break;

            case 4:
                if (num1 > 0) {
                    calculo = num1 / num2;
                    System.out.println("A divisão dos dois numeros resulta em: " + calculo);
                }

                else{
                    System.out.println("Divisão por 0, invalido");
                }

                break;

            default:
                System.out.println("Opção invalida, somente 1, 2, 3 ou 4");
                break;
        }










        scanner.close();
    }
}
