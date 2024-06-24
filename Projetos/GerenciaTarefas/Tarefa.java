package Projetos.GerenciaTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    static String titulo;
    static String corpo;
    static boolean concluida;

    Tarefa(String titulo, String corpo) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.concluida = false;
    }

    public static class GerenciaTarefa {
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
                        inserirTitulo(titulo, scanner);
                        Tarefa tarefa = new Tarefa(titulo, corpo);
                        tarefas.add(tarefa);
                        System.out.println("Título inserido com sucesso!");
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
                        System.out.println();
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (respostaMenu != 0);
        }
    }

    public static void menu(){
        System.out.println("######## Escolha uma opçao #######");
        System.out.println("#   0- sair do programa          #");
        System.out.println("#   1- criar titulo              #");
        System.out.println("#   2- escrever no corpo         #");
        System.out.println("#   3- excluir titulo            #");
        System.out.println("#   4- excluir corpo             #");
        System.out.println("#   5- Listar tarefas (titulos)  #");
        System.out.println("#   6- Listar tarefas (total)    #");
        System.out.println("##################################");
        System.out.println();
    }

    public static void inserirTitulo(String titulo, Scanner scanner) {
        System.out.print("Digite o titulo da tarefa: ");
        titulo = scanner.nextLine();
        
    }
    
    public static void excluirTitulo() {
        
    }

    public static void inserirCorpo() {
        
    }

    public static void excluirCorpo() {
        
    }

    public static void listarTitulo() {
        
    }

    public static void listarTudo() {
        
    }






}
