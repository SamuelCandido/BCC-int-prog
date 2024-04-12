import java.util.Scanner;

public class Uni4Uri3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        /*
         * Necessariamente tem que ser nesta ordem para nao 
         * entrar em outra condição pois se colocar por exemplo x == 0 && y > 0 
         * irá existir conflito de if a entrada atenderá duas condições 
         */

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }

        // Neste caso se voce eliminar a outra parte ele é obrigado a atender x == 0 
        // se vc passa essa condição primeiro vc induz a logica e como usasse parenteses
        // entao para suprir isso ou vc induz a logica ou usa o comando "||"
        // em resumo ta errada pois quando vc atende a duas condições vc está induzindo o usuario ao erro
        else if (x == 0){
            System.out.println("Eixo Y");

        }

        else if (y == 0){
            System.out.println("Eixo X");

        }

        else if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }

        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }

        else if (x > 0 && y < 0 ){
            System.out.println("Q4");
        }

        scanner.close();
    }
}
