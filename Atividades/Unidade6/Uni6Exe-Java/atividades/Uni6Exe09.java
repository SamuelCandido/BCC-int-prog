import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUM_CLIENTES = 6;
        int[] sexos = new int[NUM_CLIENTES];
        int[] notas = new int[NUM_CLIENTES];
        int[] idades = new int[NUM_CLIENTES];

        // Coleta de dados
        for (int i = 0; i < NUM_CLIENTES; i++) {
            System.out.print("Informe o sexo (1=feminino, 2=masculino) do cliente " + (i + 1) + ": ");
            sexos[i] = scanner.nextInt();
            System.out.print("Informe a nota (0 a 10) do cliente " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
            System.out.print("Informe a idade do cliente " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        double mediaNota = calcularMediaNota(notas);
        double mediaNotaHomens = calcularMediaNotaHomens(sexos, notas);
        int notaMulherMaisJovem = notaDaMulherMaisJovem(sexos, notas, idades);
        int mulheresMaisDe50AnosComNotaMaiorQueMedia = mulheresMaisDe50AnosComNotaMaiorQueMedia(sexos, notas, idades, mediaNota);

        System.out.println("Nota média recebida pelo cinema: " + mediaNota);
        System.out.println("Nota média atribuída pelos homens: " + mediaNotaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Número de mulheres com mais de 50 anos que deram nota superior à média: " + mulheresMaisDe50AnosComNotaMaiorQueMedia);

        scanner.close();
    }

    public static double calcularMediaNota(int[] notas) {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.length;
    }

    public static double calcularMediaNotaHomens(int[] sexos, int[] notas) {
        int soma = 0;
        int contador = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 2) { 
                soma += notas[i];
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) soma / contador;
    }

    public static int notaDaMulherMaisJovem(int[] sexos, int[] notas, int[] idades) {
        int menorIdade = Integer.MAX_VALUE;
        int nota = -1;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1 && idades[i] < menorIdade) { 
                menorIdade = idades[i];
                nota = notas[i];
            }
        }
        return nota;
    }

    public static int mulheresMaisDe50AnosComNotaMaiorQueMedia(int[] sexos, int[] notas, int[] idades, double mediaNota) {
        int contador = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > mediaNota) { 
                contador++;
            }
        }
        return contador;
    }
}
