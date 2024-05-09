import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String continuar = "SIM";

        double salario;
        double totalVendas;
        double precoUnitario;

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = scanner.next();

            System.out.print("Digite o número de vendas: ");
            int numeroProdutos = scanner.nextInt();

            totalVendas = 0;

            for (int i = 1; i <= numeroProdutos; i++) {
                System.out.print("Digite o preço unitário do produto " + i + ": ");
                precoUnitario = scanner.nextDouble();

                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidadeVendida = scanner.nextInt();

                totalVendas += precoUnitario * quantidadeVendida;
            }

            salario = totalVendas * 0.3;

            System.out.println("Nome do vendedor: " + nome);
            System.out.println("Total de vendas (em R$): " + totalVendas);
            System.out.println("Salário do vendedor: " + salario);

            System.out.println("Deseja digitar os dados de mais um vendedor (SIM/NAO)? ");
            continuar = scanner.next();
        }


        System.out.println("Saindo do sistema...");
        scanner.close();
    }
}

