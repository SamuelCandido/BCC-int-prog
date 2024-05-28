import java.util.Scanner;

public class Uni6Exe10 {

    public static void incluirValor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                vetor[i] = valor;
                System.out.println("Valor incluído no vetor.");
                return;
            }
        }
        System.out.println("Não há espaço no vetor para incluir o valor.");
    }

    public static void pesquisarValor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                System.out.println("Valor encontrado no vetor.");
                return;
            }
        }
        System.out.println("Valor não encontrado no vetor.");
    }

    public static void alterarValor(int[] vetor, int valorAntigo, int valorNovo) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorAntigo) {
                vetor[i] = valorNovo;
                System.out.println("Valor alterado com sucesso.");
                return;
            }
        }
        System.out.println("Número não encontrado.");
    }

    public static void excluirValor(int[] vetor, int valor) {
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                vetor[i] = 0; // Valor excluído, substituído por 0
                encontrado = true;
            } else if (encontrado && i < vetor.length - 1) {
                vetor[i] = vetor[i + 1]; // Preenche a posição com o valor seguinte
            }
        }
        if (encontrado) {
            System.out.println("Valor excluído do vetor.");
        } else {
            System.out.println("Valor não encontrado no vetor.");
        }
    }

    public static void mostrarValores(int[] vetor) {
        System.out.print("Valores no vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }

    public static void ordenarValores(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados.");
    }

    public static void inverterValores(int[] vetor) {
        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }
        System.out.println("Valores invertidos.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[50];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser incluído: ");
                    int valorIncluir = scanner.nextInt();
                    incluirValor(vetor, valorIncluir);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser pesquisado: ");
                    int valorPesquisar = scanner.nextInt();
                    pesquisarValor(vetor, valorPesquisar);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser alterado: ");
                    int valorAntigo = scanner.nextInt();
                    System.out.print("Digite o novo valor: ");
                    int valorNovo = scanner.nextInt();
                    alterarValor(vetor, valorAntigo, valorNovo);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser excluído: ");
                    int valorExcluir = scanner.nextInt();
                    excluirValor(vetor, valorExcluir);
                    break;
                case 5:
                    mostrarValores(vetor);
                    break;
                case 6:
                    ordenarValores(vetor);
                    break;
                case 7:
                    inverterValores(vetor);
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}
