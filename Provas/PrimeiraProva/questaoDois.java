package Provas.PrimeiraProva;

import java.util.Scanner;


public class questaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha uma opção de A a D");
        System.out.println("A _ Peso do pasciente mais magro");
        System.out.println("B _ Peso do pasciente com mais peso ");
        System.out.println("C _ Pesos em ordem decrescente");
        System.out.println("D _ Media dos pesos");
        System.out.println();
        String opcao = scanner.nextLine();
        System.out.println();
        
        System.out.println("Digite o peso do pasciente um: ");
        double peso1 = scanner.nextDouble();
        
        System.out.println("Digite o peso do pasciente dois: ");
        double peso2 = scanner.nextDouble();

        System.out.println("Digite o peso do pasciente tres: ");
        double peso3 = scanner.nextDouble();
        System.out.println();

        double media;
        
        String opcaoUpper = opcao.toUpperCase();

        switch (opcaoUpper) {
            case "A":
                if (peso1 > peso2) {
                    double temp = peso1;
                    peso1 = peso2;
                    peso2 = temp;
                }
                if (peso2 > peso3) {
                    double temp = peso2;
                    peso2 = peso3;
                    peso3 = temp;
                }
                if (peso1 > peso2) {
                    double temp = peso1;
                    peso1 = peso2;
                    peso2 = temp;
                }
                System.out.println("O peso do pasciente mais magro é: " + peso1);
                break;

            case "B":
                if (peso1 < peso2) {
                    double temp = peso1;
                    peso1 = peso2;
                    peso2 = temp;
                }
                if (peso2 < peso3) {
                    double temp = peso2;
                    peso2 = peso3;
                    peso3 = temp;
                }
                if (peso1 < peso2) {
                    double temp = peso1;
                    peso1 = peso2;
                    peso2 = temp;
                }
                System.out.println("O peso do pasciente com mais peso é: " + peso1);
                break;
            
            case "C":
                if (peso1 < peso2) {
                    double temp = peso1;
                    peso1 = peso2;
                    peso2 = temp;
                }
                if (peso2 < peso3) {
                    double temp = peso2;
                    peso2 = peso3;
                    peso3 = temp;
                }
                if (peso1 < peso2) {
                    double temp = peso1;
                    peso1 = peso2;
                    peso2 = temp;
                }

                System.out.println("Os pesos em ordem decrescente são: ");
                System.out.println(peso1 + ", " + peso3 + ", " + peso2);
                break;

            case "D":
                    media = (peso1 + peso2 + peso3) / 3;
                    System.out.println("A media dos pesos dos pasascientes é: " + media);
                break;
    
            default:
                System.out.println("Opção invalida, somente A, B, C ou D");
                break;
        }
        
        
        scanner.close();
    }
}
