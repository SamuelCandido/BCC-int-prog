import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double tenPosition[] = new double[3];
        int cont = 1;
        double soma = 0;
        double media = 0.0;

        for (int i = 2; i >= 0; i--){
            System.out.print("Digite o valor do vetor "+ cont +": ");
            tenPosition[i] = scanner.nextInt();
            cont++;
            soma += tenPosition[i];
        
        }
        
        media = soma / 3;
        System.out.println("media "+ media);

        for(double aux : tenPosition){
            if (aux > media) {
                System.out.println(aux);
            }
        }

        scanner.close();
    }
}
