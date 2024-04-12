import java.util.Scanner;

public class Uni4Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um valor inteiro maior que 0: ");
        int inteiro = scanner.nextInt();

        if (inteiro % 2 ==0){
            System.out.println("O numero: " + inteiro + " é par");
        }

        else{
            System.out.println("O numero: " + inteiro + " é impar");
        }

        scanner.close();
    }
}
