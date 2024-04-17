import java.util.Scanner;

public class Uni5Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int termos = scanner.nextInt();
        double soma = 0.0;

        for (int i = 1; i <= termos; i++) {
            double termo = 1.0 / i;
            soma += termo;
        }

        System.out.println("A soma dos primeiros " + termos + " termos da série é: " + soma);

        scanner.close();
    }
}
