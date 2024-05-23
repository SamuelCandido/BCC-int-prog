import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        double[] vetor = new double[tamanho];
        double esta = 0.0;

        for (int i = 0; i < vetor.length; i++ ){
            System.out.print("Informe o valor para povoar o vetor: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.print("Digite um valor para ver se esta dentro do vetor: ");
        esta = scanner.nextDouble();

        for (int i = 0; i < vetor.length; i++ ){
            if (vetor[i] == esta) {
                System.out.println(true);
            }
            
        }



        scanner.close();
    }
}
