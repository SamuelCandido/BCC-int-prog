import java.util.Scanner;

public class Uni5Exe1 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 20; i++) {
        System.out.println((i + 1) + ")Digite um número1: ");
        String aux = scanner.nextLine();

        try {
            int num = Integer.parseInt(aux);
            int resposta = num % 2;

            if (resposta == 0) {
                System.out.println();
                System.out.println((i + 1 ) + ")R:O numero "+ num + " é par");
                System.out.println();
            }
            else{
                System.out.println();
                System.out.println((i + 1 ) + ")R:O numero "+ num + " é impar");
                System.out.println();
            }
            
        } 
        
        catch (NumberFormatException e) {

            System.out.println();
            System.out.println("ENTRADA INVALIDA");
            System.out.println();
        }
    }

    scanner.close();
}
}