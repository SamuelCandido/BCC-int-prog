import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 2000;
        double A = (1.5/salario) * 100;
        double porcentagem = A;
        
        int ano = 1995;
    
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();


        while(ano < anoAtual){
            ano += 1;
            porcentagem = (A/100) * salario;
            salario += porcentagem;
            A *= 2;

            System.out.println();
            System.out.printf("Você recebeu %.2f%% de aumento em seu salário no ano %d, totalizando %.2f%n", porcentagem, ano, salario);

        }

        System.out.println();
        System.out.printf("O seu maior salário é de %.2f no ano de %d%n", salario, anoAtual);



        scanner.close();
    }
}
