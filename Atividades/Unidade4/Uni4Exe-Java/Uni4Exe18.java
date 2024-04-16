import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println();
        int dPagamento = scanner.nextInt();

        System.out.println();
        double vParcela = scanner.nextDouble();

        double porcentagem1 = 10;
        double porcentagem2 = 02;

        double desconto = (porcentagem1/100) * vParcela;
        double juros = (porcentagem2/100) * vParcela;

        double calculo;

        if (dPagamento > 0 && dPagamento <= 10) {
            calculo = vParcela - desconto;
            System.out.println("Você ganhou desconto de 10% o valor a pagar é R$:" + calculo);
        }
        else if (dPagamento > 0 && dPagamento > 10 && dPagamento <= 15) {
            System.out.println("Você não ganhou desconto o valor a pagar é R$:" + vParcela);
        }

        else if (dPagamento > 0 && dPagamento > 16) {
            calculo = vParcela + (juros * (dPagamento - 10));
            System.out.println("Você ganhou JUROS de 2% ao dia  o valor a pagar é R$:" + calculo);
        }

        else{
            System.out.println("Entrada invalida");
        }
        

        scanner.close();
        System.out.println();
    }
}
