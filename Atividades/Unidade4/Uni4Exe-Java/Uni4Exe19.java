import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para x: ");
        double x = scanner.nextDouble();

        System.out.println("Digite um valor para y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }

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