import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas linhas o triangulo tem? ");
        int qtd = scanner.nextInt();
        System.out.println();

        int count = 1;
        for (int i = 1; i <= qtd; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        } 
        scanner.close();
        
    }
    
}  



