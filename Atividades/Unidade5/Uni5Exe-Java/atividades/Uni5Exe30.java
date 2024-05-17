import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da mochila M: ");
        int M = scanner.nextInt();

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        
        System.out.print("Digite o valor de K: ");
        int K = scanner.nextInt();
        
        int somaNaMochila = 0;
        int somaForaMochila = 0;
        int valorAtual = N;

        List<Integer> mochila = new ArrayList<>();
        List<Integer> foraMochila = new ArrayList<>();

        while (valorAtual > 0) {
            if (somaNaMochila + valorAtual <= M) {
                mochila.add(valorAtual);
                somaNaMochila += valorAtual;
            } 

            else {
                foraMochila.add(valorAtual);
                somaForaMochila += valorAtual;
            }
            valorAtual -= K;
        }

        System.out.println("Elementos a serem colocados na mochila: " + mochila);
        System.out.println("Elementos que entraram na mochila: " + mochila);
        System.out.println("Elementos que ficaram fora da mochila: " + foraMochila);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaNaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaForaMochila);

        scanner.close();
    }
}
