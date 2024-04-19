package Provas.Ajuda;

import java.util.Scanner;

public class ordenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         *  se opção = 1, escreva os valores em ordem crescente
            se opção = 2, escreva os valores em ordem decrescente
            se opção = 3, escreva os valores de forma que o maior valor fique no meio
         */

        System.out.println("Escolha uma opção de 1 a 3");
        System.out.println("1 _ Ordem crescente");
        System.out.println("2 _ Ordem decrescente");
        System.out.println("3 _ O maior valor fique no meio");
        System.out.println();
        int opcao = scanner.nextInt();
        System.out.println();
        
        System.out.println("Escolha o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Escolha o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha o terceiro número: ");
        double num3 = scanner.nextDouble();
        
        System.out.println("Escolha o quarto número: ");
        double num4 = scanner.nextDouble();
        
        System.out.println("Escolha o quinto número: ");
        double num5 = scanner.nextDouble();
        System.out.println();

        switch (opcao) {
            case 1:
                // Ordenação crescente usando troca de valores
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
                if (num3 > num4) {
                    double temp = num3;
                    num3 = num4;
                    num4 = temp;
                }
                if (num4 > num5) {
                    double temp = num4;
                    num4 = num5;
                    num5 = temp;
                }
                if (num1 > num2) {
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                System.out.println("Números em ordem crescente:");
                System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
                break;

            case 2:
                // Ordenação decrescente usando troca de valores
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
                if (num3 < num4) {
                    double temp = num3;
                    num3 = num4;
                    num4 = temp;
                }
                if (num4 < num5) {
                    double temp = num4;
                    num4 = num5;
                    num5 = temp;
                }
                if (num1 < num2) {
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                System.out.println("Números em ordem decrescente:");
                System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
                break;
            
            case 3:
                // Ordenação com o maior valor no meio
                double[] sortedArray = {num1, num2, num3, num4, num5};
                // Ordena os valores
                for (int i = 0; i < sortedArray.length - 1; i++) {
                    for (int j = i + 1; j < sortedArray.length; j++) {
                        if (sortedArray[i] > sortedArray[j]) {
                            double temp = sortedArray[i];
                            sortedArray[i] = sortedArray[j];
                            sortedArray[j] = temp;
                        }
                    }
                }
                // O maior valor fica no meio
                double maior = sortedArray[sortedArray.length - 1];
                double[] resultado = {sortedArray[0], maior, sortedArray[1], sortedArray[2], sortedArray[3]};

                System.out.println("Maior valor no meio:");
                System.out.println(resultado[0] + ", " + resultado[1] + ", " + resultado[2] + ", " + resultado[3] + ", " + resultado[4]);
                break;
    
            default:
                System.out.println("Opção inválida, somente 1, 2 ou 3");
                break;
        }
        
        scanner.close();
    }
}
