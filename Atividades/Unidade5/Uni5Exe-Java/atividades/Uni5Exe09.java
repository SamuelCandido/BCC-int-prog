
import java.util.Scanner;
import java.util.ArrayList;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos você quer digitar");
        int qtd = scanner.nextInt();

        int idade = 0;
        int cont = 0;

        ArrayList<String> listaDeNome = new ArrayList<>();

        for (int i = 1; i <= qtd; i++) {
            System.out.println();

            System.out.println("Escreva o nome do aluno " + i + ": ");
            String nome = scanner.next();

            System.out.println("Escreva a idade do aluno " + i + ": ");
            idade = scanner.nextInt();

            if (idade == 18) {
                listaDeNome.add(nome);
            }

            else if (idade > 20) {
                cont += 1;
            }

            else{
                System.out.println("Entrada invalida");
            }

        }

        System.out.println();
        System.out.println("Lista dos nomes dos alunos que tem 18: ");
        for(String str : listaDeNome ){
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Quantidade de alunos de idade acima de 20: " + cont);
        

        scanner.close();
    }
}
