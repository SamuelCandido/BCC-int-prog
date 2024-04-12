import java.util.Scanner;

public class Uni3Uri2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        double raio = scanner.nextDouble();
        
        double area = pi *  Math.pow(raio, 2);

        // Imprimindo a área formatada diretamente na saída
        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
