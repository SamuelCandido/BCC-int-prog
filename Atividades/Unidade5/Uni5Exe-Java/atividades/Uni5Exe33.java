import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosC1 = 0;
        int votosC2 = 0;
        int votosC3 = 0;
        int votosC4 = 0;
        int nulo = 0;
        int branco = 0;
        int total = 0;

        double percentualNulo = 0;
        double percentualBrancos = 0;

        while (true) {
            System.out.print("Informe seu voto (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para sair): ");
            int voto = scanner.nextInt();

            if (voto == 0) {
                break;
            } else if (voto == 1) {
                votosC1++;
                total++;
            } else if (voto == 2) {
                votosC2++;
                total++;
            } else if (voto == 3) {
                votosC3++;
                total++;
            } else if (voto == 4) {
                votosC4++;
                total++;
            } else if (voto == 5) {
                nulo++;
                total++;
            } else if (voto == 6) {
                branco++;
                total++;
            } else {
                System.out.println("Opção incorreta. Tente novamente.");
            }
        }

        if (total > 0) {
            percentualNulo = (nulo * 100.0) / total;
            percentualBrancos = (branco * 100.0) / total;
        }

        System.out.println("\nResultados da eleição:");
        System.out.println("Candidato 1: " + votosC1 + " votos");
        System.out.println("Candidato 2: " + votosC2 + " votos");
        System.out.println("Candidato 3: " + votosC3 + " votos");
        System.out.println("Candidato 4: " + votosC4 + " votos");
        System.out.println("Votos nulo: " + nulo);
        System.out.println("Votos em branco: " + branco);
        System.out.printf("Percentual de votos nulo: %.2f%%\n", percentualNulo);
        System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualBrancos);

        scanner.close();
    }
}

