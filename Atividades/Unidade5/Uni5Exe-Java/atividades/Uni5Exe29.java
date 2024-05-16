import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser sacado: ");
        int valor = scanner.nextInt();
        
        int[] cedulas = {20, 10, 5, 2, 1};
        int[] qtdCedulas = new int[cedulas.length];

        int cont = 0;
        int minimo = 0;

        while (valor > 0 && cont < cedulas.length) {
            if (valor >= cedulas[cont]) {
                qtdCedulas[cont]++;
                valor -= cedulas[cont];
            } 
            
            else {
                cont++;
            }
        }

        for (int j = 0; j < cedulas.length; j++) {
            if (qtdCedulas[j] > 0) {
                System.out.println("Cedulas de " + cedulas[j] + ": " + qtdCedulas[j]);
                minimo = minimo + qtdCedulas[j];
            }
        }
        System.out.println("Quantidade minima de cédulas: " + minimo);

        scanner.close();
    }
}