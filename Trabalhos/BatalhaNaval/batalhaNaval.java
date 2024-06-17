package Trabalhos.BatalhaNaval;

import java.util.Random;
import java.util.Scanner;

public class batalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int cont = 0;
        int colocados = 0;
        int naviosAchados = 0;
        int naviosRestantes = 0;

        int linha = 0;
        int coluna = 0;

        boolean jogo = false;

        char tabu [][] = new char[8][8];
        char tabuMostra [][] = new char[8][8];

        

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabu[i][j] = '~';
                tabuMostra[i][j] = '~';
        }}

        while (colocados < 10) {
            linha = random.nextInt(8);
            coluna = random.nextInt(8);
            if (tabu[linha][coluna] == '~') {
                tabu[linha][coluna] = 'N';
                colocados++;
            }
        }

        do {
            System.out.println();
            System.out.println("Tabuleiro:");
            System.out.print("  ");
            for (int j = 0; j < tabuMostra.length; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
    
            for (int i = 0; i < tabuMostra.length; i++) {
                System.out.print((i) + " ");
                for (int j = 0; j < tabuMostra[i].length; j++) {
                    System.out.print(tabuMostra[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Digite as coordenadas de ataque:");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
            System.out.println();

            if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
                System.out.println("Ataque fora do tabuleiro, tente novamente");
                continue;
            }

            if (tabuMostra[linha][coluna] == 'X' || tabuMostra[linha][coluna] == 'O') {
                System.out.println("Cordenada ja atacada");
                continue;
            }
            
            // TESTES NO TABU
            if (tabu[linha][coluna] == 'N') {
                System.out.println("Voce acertou um navio");
                tabuMostra[linha][coluna] = 'X';
                naviosAchados++;
            } else {
                System.out.println("");
                tabuMostra[linha][coluna] = 'O';
            }
            if (naviosAchados == 10){
                System.out.println("Você venceu");
                jogo = true;
            }
        
            cont++;
        } while (cont <= 30 && jogo == false);

        if (naviosAchados < 10){
            naviosRestantes = 10 - naviosAchados;
            System.out.println("Você foi derrotado, faltaram " + naviosRestantes + " navios para ganhar");
            System.out.println("Posicoes dos navios ");  
        }
        else{
            System.out.println("Fim de jogo");
        }
        for (int i = 0; i < tabu.length; i++) {
            for (int j = 0; j < tabu[i].length; j++) {
                if (tabu[i][j] == 'N') {
                    if (tabuMostra[i][j] != 'X')
                        tabuMostra[i][j] = 'N';
                }
            }
        } 

        System.out.print("  ");
        for (int j = 0; j < tabuMostra.length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < tabuMostra.length; i++) {
            System.out.print((i) + " ");
            for (int j = 0; j < tabuMostra[i].length; j++) {
                System.out.print(tabuMostra[i][j] + " ");
            }
            System.out.println();
        }
    scanner.close();
    }
}