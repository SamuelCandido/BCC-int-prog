import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        double numero = scanner.nextDouble();

        int divisor = 2;

        while (true) {
            if (numero >= 0 && numero % 2 == 0) {
                System.out.printf("%-10s | %s%n", "numero", "decomposição");
    
                while (numero > 1) {
                    while (numero % divisor == 0) {
                        
                        System.out.printf("%-10d | %d%n", numero, divisor);
    
                        numero /= divisor;
                    }
                    divisor++; 
                }
    
                break;
            } 
    
            else {
                System.out.print("Numero incorreto, tem que ser INTEIRO e POSITIVO: ");
                numero = scanner.nextInt();          
            }
        }

        scanner.close();
    }
}
