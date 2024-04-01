import java.util.Scanner;
public class Uni3Exe12{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = scanner.next();

        System.out.print("Informe quantas horas trabalhou no mês: ");
        double horasMes = scanner.nextDouble();

        System.out.print("Informe quantos dependentes possui: ");
        int qtdDependentes = scanner.nextInt();

        int salFamil = qtdDependentes * 60;
        double salBruto = horasMes * 10;

        double inss = salBruto * 0.085;
        double impostoRenda = salBruto * 0.05;
        double salLiquido = salBruto - inss - impostoRenda;

        double totalLiquido = salLiquido + salFamil;
        double totalBruto = salBruto + salFamil;

        System.out.printf("Salário bruto de %s: R$ %.2f%n", nome, totalBruto);
        System.out.printf("Salário líquido de %s: R$ %.2f%n", nome, totalLiquido);
        scanner.close();
    }
}
