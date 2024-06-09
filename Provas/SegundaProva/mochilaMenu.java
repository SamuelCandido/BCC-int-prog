package Provas.SegundaProva;

import java.util.Scanner;

public class mochilaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho da mochila:  ");
        int tamanho = scanner.nextInt();

        System.out.print("Capacidade maxima da mochila em Kg:  ");
        int capacidade = scanner.nextInt();

        int itemContador = 0;
        int opcao;

        String[] item = new String[tamanho];
        int[] pesos = new int[capacidade];

        do {
            menu();
            System.out.print("Digite a opcao desejada: ");
            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {
                case 1:
                    capacidade = inserir(scanner, item, pesos, itemContador, capacidade);
                    if (item[itemContador] != null) {
                        itemContador++;
                    }
                    break;

                case 2:
                    imprimirMochila(item, pesos, itemContador);
                    break;

                case 3:
                    itemMaisPesado(item, pesos, itemContador);
                    break;

                case 4:
                    ordenarMochila(item, pesos, itemContador);
                    break;

                case 5:
                    capacidade = excluirItem(scanner, item, pesos, itemContador, capacidade);
                    if (itemContador > 0) {
                        itemContador--;
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }

        } while (opcao != 6);
    }

    public static void menu() {
        System.out.println("##### Escolha uma opcao #####");
        System.out.println("1 - Inserir item");
        System.out.println("2 - Mostrar mochila");
        System.out.println("3 - Valor do item mais pesado");
        System.out.println("4 - Ordenar mochila");
        System.out.println("5 - Excluir item da mochila");
        System.out.println("6 - Sair");
        System.out.println();
    }

    public static int inserir(Scanner scanner, String[] item, int[] pesos, int itemContador, int capacidade) {
        if (itemContador >= item.length) {
            System.out.println("Nao e possivel adicionar. Tamanho maximo ja atingido");
            return capacidade;
        }

        System.out.print("Qual o nome do objeto: ");
        String nome = scanner.nextLine();

        System.out.print("Qual o peso do objeto: ");
        int peso = scanner.nextInt();

        scanner.nextLine();

        if (peso <= capacidade) {
            item[itemContador] = nome;
            pesos[itemContador] = peso;
            capacidade -= peso;
            System.out.println();
            System.out.println("Adicionado com sucesso");
        } 
        
        else {
            System.out.println("Nao inserido, ultrapassa o peso maximo");
        }
        return capacidade;
    }

    public static void imprimirMochila(String[] item, int[] pesos, int itemContador) {
        System.out.println();
        System.out.println("Itens na mochila:");

        for (int i = 0; i < itemContador; i++) {
            if (item[i] != null) {
                System.out.println("[" + item[i] + " (" + pesos[i] + "kg)] ");
            }
        }
        System.out.println();
    }

    public static void itemMaisPesado(String[] item, int[] pesos, int itemContador) {
        if (itemContador == 0) {
            System.out.println("A mochila está vazia.");
            return;
        }

        int maxItem = 0;
        for (int i = 1; i < itemContador; i++) {
            if (pesos[i] > pesos[maxItem]) {
                maxItem = i;
            }
        }

        System.out.println("O item mais pesado na mochila é: " + item[maxItem] + " (" + pesos[maxItem] + "kg)");
    }

    public static void ordenarMochila(String[] item, int[] pesos, int itemContador) {
        for (int i = 0; i < itemContador - 1; i++) {
            for (int j = i + 1; j < itemContador; j++) {
                if (pesos[i] > pesos[j]) {
                    int tempPeso = pesos[i];
                    pesos[i] = pesos[j];
                    pesos[j] = tempPeso;
                    String tempNome = item[i];
                    item[i] = item[j];
                    item[j] = tempNome;
                }
            }
        }

        System.out.println("Mochila ordenada:");
        imprimirMochila(item, pesos, itemContador);
    }

    public static int excluirItem(Scanner scanner, String[] item, int[] pesos, int itemContador, int capacidade) {
        if (itemContador == 0) {
            System.out.println("A mochila está vazia.");
            return capacidade;
        }

        System.out.println("Qual o nome do item que deseja excluir?");
        String nome = scanner.nextLine();

        for (int i = 0; i < itemContador; i++) {
            if (item[i].equals(nome)) {
                capacidade += pesos[i];
                item[i] = item[itemContador - 1];
                pesos[i] = pesos[itemContador - 1];
                item[itemContador - 1] = null;
                pesos[itemContador - 1] = 0;
                System.out.println("Item excluído.");
                return capacidade;
            }
        }

        System.out.println("Item não encontrado.");
        return capacidade;
    }
}