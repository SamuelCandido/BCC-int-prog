import java.util.Scanner;

public class Uni5Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int termo = scanner.nextInt();
        double soma = 0.0;
        double numerador = 1.0;
        double denominador = 1.0;

        for (int i = 0; i <= (termo - 1); i++) {
            numerador += 2;
            denominador = 2 / (numerador + i);
            soma += termo;
            System.out.println(numerador +"/"+ denominador);
        }

        
        System.out.println("A soma dos primeiros " + termo + " termos da série é: " + soma);

        scanner.close();
    }
}
