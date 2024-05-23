import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[3];
        double esta = 0.0;
        int gambiarra = 1;

        for (int i = 0; i < vetor.length; i++ ){
            System.out.print("Informe o valor para povoar o vetor: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.print("Digite um valor para ver se esta dentro do vetor: ");
        esta = scanner.nextDouble();

        for (int i = 0; i < vetor.length; i++ ){
            if (vetor[i] == esta) {
                gambiarra = 2;
                System.out.println(true);
            } 
        }

        if (gambiarra == 1) {
            System.out.println(false);
        } 

        Arrays.sort(vetor);
        System.out.println(Arrays.toString(vetor));

        scanner.close();
    }
}
