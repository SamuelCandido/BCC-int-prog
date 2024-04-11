import java.util.Scanner;

public class Uni4Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Descubra se seu numero contem ou nao ponto flutuante: ");
        double n1 = scanner.nextDouble();
    
        int force = (int) n1;

        if (n1 != force) {
            System.out.println("O número " + n1 + " tem parte fracionária.");
        } else if (n1 == force) {
            System.out.println("O número " + n1 + " não tem parte fracionária (é um número inteiro).");
        }


        scanner.close();
    }
}
