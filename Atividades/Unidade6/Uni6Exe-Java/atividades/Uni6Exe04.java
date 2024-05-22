import java.util.Scanner;

public class Uni6Exe04{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int vetor1[] = new int[3];
        int vetor2[] = new int[3];
        int somaVetor[] = new int[3];

        System.out.println("Valores do vetor 1");
        for (int i = 0; i < vetor1.length; i++ ){
            System.out.println("Digite um numero:");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Valores do vetor 2");
        for (int x = 0; x < vetor1.length; x++ ){
            System.out.println("Digite um numero:");
            vetor2[x] = scanner.nextInt();
        }

        System.out.println();

        for (int h = 0; h < vetor1.length; h++ ){
            somaVetor[h] = vetor1[h] + vetor2[h];
        }

        System.out.println("Valores do vetor 1");
        for (int v1 : vetor1){
            System.out.print(v1 + ", ");
        }

        System.out.println("Valores do vetor 2");
        for (int v2 : vetor2){
            System.out.print(v2 + ", ");
        }

        System.out.println("Soma dos vetores");
        for (int sV : somaVetor){
            System.out.print(sV + ", ");
        }

        scanner.close();
    }
}