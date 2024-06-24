package Projetos.GerenciaTarefas;

import java.util.Scanner;

public class GerenciaTarefa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String titulo;
        String corpo;
        boolean concluida;
        int respostaMenu;
    }

    public void menu(){
        System.out.println("######## Escolha uma opçao #######");
        System.out.println("#   0- sair do programa          #");
        System.out.println("#   1- criar titulo              #");
        System.out.println("#   2- escrever no corpo         #");
        System.out.println("#   3- excluir titulo            #");
        System.out.println("#   4- excluir corpo             #");
        System.out.println("#   5- Listar tarefas (titulos)  #");
        System.out.println("#   6- Listar tarefas (total)    #");
    }

    public void Tarefa(String[] args, Scanner scanner, int respostaMenu) {
        do {
            menu();
            respostaMenu = scanner.nextInt();

            switch (respostaMenu) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    
                    break;
                 
                default:
                    break;
            }
        } while (respostaMenu != 0);
    }

    public void inserirTitulo() {
        
    }
    
    public void excluirTitulo() {
        
    }

    public void inserirCorpo() {
        
    }

    public void excluirCorpo() {
        
    }







}
