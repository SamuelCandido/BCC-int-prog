// Aluno: Samuel Candido

package Provas.SegundaProva;

import java.util.Scanner;

public class espaconave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho da espaconave:  ");
        int tamanho = scanner.nextInt();

        System.out.print("Capacidade maxima da espaconave em Kg:  ");
        int capacidade = scanner.nextInt();

        int contadordeItem = 0;
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
                    capacidade = inserir(scanner, item, pesos, contadordeItem, capacidade, capacidade);
                    if (item[contadordeItem] != null) {
                        contadordeItem++;
                    }
                    break;

                case 2:
                    imprimirEspaconave(item, pesos, contadordeItem);
                    break;

                case 3:
                    valorItemMaisPesado(item, pesos, contadordeItem);
                    break;

                case 4:
                    ordenarEspaconave(item, pesos, contadordeItem);
                    break;

                case 5:
                    capacidade = excluirItemEspaconave(scanner, item, pesos, contadordeItem, capacidade);
                    if (contadordeItem > 0) {
                        contadordeItem--;
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("opção inválida");
                    return;
            }

        } while (opcao != 6);
    }

    public static void menu() {
        System.out.println("######## Escolha uma opcao ########");
        System.out.println("1- Inserir item na espaconave");
        System.out.println("2- Mostrar interior da espaconave");
        System.out.println("3- Valor do item mais pesado");
        System.out.println("4- Ordenar item da espaçonave");
        System.out.println("5- Excluir item da espaconave");
        System.out.println("6- Sair");
        System.out.println();
    }

    public static int inserir(Scanner scanner, String[] item, int[] pesos, int contadordeItem, int capacidade, int i) {
        if (contadordeItem >= item.length) {
            System.out.println("Nao e possivel adicionar. Tamanho maximo ja atingido");
            return capacidade;
        }
        System.out.print("Qual o nome do objeto: ");
        String nome = scanner.nextLine();

        System.out.print("Qual o peso do objeto: ");
        int peso = scanner.nextInt();

        scanner.nextLine();

        if (peso <= capacidade) {
            item[contadordeItem] = nome;
            pesos[contadordeItem] = peso;
            capacidade -= peso;
            System.out.println();
            System.out.println("Adicionado com sucesso");
        } 
        
        System.out.println("Nao inserido, ultrapassa o peso maximo");
        return capacidade;
    }

    public static void imprimirEspaconave(String[] item, int[] pesos, int contadordeItem) {
        if (contadordeItem == 0) {
            System.out.println("A espaçonave esta vazia");
            return;
        }

        System.out.println();
        System.out.println("Itens na espaçonave:");

        for (int i = contadordeItem - 1; i >= 0; i--) {
            if (item[i] != null) {
                System.out.println("[" + item[i] + " (" + pesos[i] + "kg)] ");
            }
        }
        
        System.out.println();
    }

    public static void valorItemMaisPesado(String[] item, int[] pesos, int contadordeItem) {
        if (contadordeItem == 0) {
            System.out.println("A espaçonave esta vazia");
            return;
        }

        int maxItem = 0;
        for (int i = 1; i < contadordeItem; i++) {
            if (pesos[i] > pesos[maxItem]) {
                maxItem = i;
            }
        }

        System.out.println("O item mais pesado da espaçonave e: " + item[maxItem] + " (" + pesos[maxItem] + "kg)");
    }

    public static void ordenarEspaconave(String[] item, int[] pesos, int contadordeItem) {

        for (int i = 0; i < contadordeItem - 1; i++) {
            for (int j = i + 1; j < contadordeItem; j++) {
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

        System.out.println("Espaconave ordenada:");
        imprimirEspaconave(item, pesos, contadordeItem);
    }

    public static int excluirItemEspaconave(Scanner scanner, String[] item, int[] pesos, int contadordeItem, int capacidade) {
        if (contadordeItem == 0) {
            System.out.println("A espaconave esta vazia");
            return capacidade;
        }

        System.out.println("Qual o nome do item que deseja excluir?");
        String nome = scanner.nextLine();

        for (int i = 0; i < contadordeItem; i++) {
            if (item[i].equals(nome)) {
                capacidade += pesos[i];
                item[i] = item[contadordeItem - 1];
                pesos[i] = pesos[contadordeItem - 1];
                item[contadordeItem - 1] = null;
                pesos[contadordeItem - 1] = 0;
                System.out.println("Item excluido");
                return capacidade;
            }
        }

        System.out.println("Item nao encontrado");
        return capacidade;
    }
}