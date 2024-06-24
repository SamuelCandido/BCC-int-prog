package Projetos.GerenciaTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    String titulo;
    String corpo;
    boolean concluida;

    Tarefa(String titulo, String corpo) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.concluida = false;
    }

    public class GerenciaTarefa {
        private List<Tarefa> tarefas;
        private Scanner scanner;
    
        public GerenciaTarefa() {
            this.tarefas = new ArrayList<>();
            this.scanner = new Scanner(System.in);
        }
    
        public static void main(String[] args) {
            GerenciaTarefa gerenciaTarefa = new GerenciaTarefa();
            gerenciaTarefa.run();
        }
    
        public void run() {
            int respostaMenu;
            do {
                menu();
                respostaMenu = scanner.nextInt();
                scanner.nextLine(); 
    
                switch (respostaMenu) {
                    case 1:
                        inserirTitulo();
                        break;

                    case 2:
                        inserirCorpo();
                        break;

                    case 3:
                        excluirTitulo();
                        break;

                    case 4:
                        excluirCorpo();
                        break;

                    case 5:
                        listarTitulo();
                        break;

                    case 6:
                        listarTudo();
                        break;

                    case 0:
                        System.out.println("Saindo do programa...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (respostaMenu != 0);
        }
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

    public void inserirTitulo() {
        
    }
    
    public void excluirTitulo() {
        
    }

    public void inserirCorpo() {
        
    }

    public void excluirCorpo() {
        
    }

    public void listarTitulo() {
        
    }

    public void listarTudo() {
        
    }






}
