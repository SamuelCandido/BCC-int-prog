import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uni6Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas;
        int colunas = 2;
        do {
            System.out.print("Informe o número de linhas na matriz (máximo 20): ");
            linhas = scanner.nextInt();
        } while (linhas < 1 || linhas > 20);;

        double[][] matriz = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        Map<Double, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                double valor = matriz[i][j];
                freqMap.put(valor, freqMap.getOrDefault(valor, 0) + 1);
            }
        }

        System.out.println("----------------------------");
        System.out.println("|  VALOR   |   FREQUENCIA  |");
        System.out.println("----------------------------");
        for (Map.Entry<Double, Integer> entry : freqMap.entrySet()) {
            System.out.printf("|%9.2f |%11d    |\n", entry.getKey(), entry.getValue());
        }
        System.out.println("----------------------------");

        scanner.close();
    }
}
