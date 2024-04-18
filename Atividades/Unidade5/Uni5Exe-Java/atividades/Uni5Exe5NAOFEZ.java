import java.util.Scanner;

public class Uni5Exe5NAOFEZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        double soma = 0.0;

        for (int i = 1; i <= numero; i++) {
            double termo = 1.0 / i;
            soma += termo;
        }

        System.out.println("A soma dos primeiros " + numero + " termos da série é: " + soma);

        scanner.close();
    }
}
