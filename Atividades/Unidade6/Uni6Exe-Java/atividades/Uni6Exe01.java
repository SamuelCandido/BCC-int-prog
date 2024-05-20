import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tenPosition[] = new int[3];
        int cont = 1;

        for (int i = 2; i >= 0; i--){
            System.out.print("Digite o valor do vetor "+ cont +": ");
            tenPosition[i] = scanner.nextInt();
            cont++;
        }

        System.out.println("Valores do vetor ao contrario");

        for(int aux : tenPosition){
            System.out.print(aux + ", ");
        }

        scanner.close();
    }
}