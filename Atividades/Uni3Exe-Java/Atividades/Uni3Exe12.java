import java.util.Scanner;

public class Uni3Exe12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.println("Informe quantas horas trabalhou no mês: ");
        int horasMes = scanner.nextInt();
        
        System.out.println("Informe quantos dependentes possui: ");
        int qtdDependentes = scanner.nextInt();
        
        int valorHora = 10;
        int valorDependente = 60;
        
        double salarioBruto = horasMes * valorHora + valorDependente * qtdDependentes;
        double salarioLiquido = salarioBruto - (salarioBruto * 13.5) / 100;
        
        System.out.printf("Salário bruto de %s: R$ %.2f%n", nome, salarioBruto);
        System.out.printf("Salário líquido de %s: R$ %.2f%n", nome, salarioLiquido);
        
        scanner.close();
    }
}
