import java.util.Scanner;
import java.util.Arrays;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         *  se opção = 1, escreva os 3 valores em ordem crescente
            se opção = 2, escreva os 3 valores em ordem decrescente
            se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
         */

        System.out.println("Escolha uma opção de 1 a 3");
        System.out.println("1 _ Ordem crescente");
        System.out.println("2 _ Ordem decrescente");
        System.out.println("3 _ O maior valor fique no meio");
        System.out.println();
        int opcao = scanner.nextInt();
        System.out.println();
        
        System.out.println("Escolha um numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Escolha outro numero");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha o ultimo numero");
        double num3 = scanner.nextDouble();
        System.out.println();

        switch (opcao) {
            case 1:
                if (num1 > num2) {
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                if (num2 > num3) {
                    double temp = num2;
                    num2 = num3;
                    num3 = temp;
                }
                if (num1 > num2) {
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                System.out.println("Números em ordem crescente:");
                System.out.println(num1 + ", " + num2 + ", " + num3);
                break;

            case 2:
                if (num1 < num2) {
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                if (num2 < num3) {
                    double temp = num2;
                    num2 = num3;
                    num3 = temp;
                }
                if (num1 < num2) {
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                System.out.println("Números em ordem decrescente:");
                System.out.println(num1 + ", " + num2 + ", " + num3);
                break;
            
            case 3:
                double[] sortedArray = {num1, num2, num3};
                Arrays.sort(sortedArray);
                num1 = sortedArray[0];
                num2 = sortedArray[1];
                num3 = sortedArray[2];

                System.out.println();
                System.out.println("Maior valor no meio:");
                System.out.println(num1 + ", " + num3 + ", " + num2);
                
                break;
    
            default:
                System.out.println("Opção invalida, somente 1, 2 ou 3");
                break;
        }
        
        
        scanner.close();
    }
}
