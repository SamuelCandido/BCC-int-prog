import java.util.Scanner;

public class Uni3Uri7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        
        double comissao = vendas * 0.15;

        double total = comissao + salario;
        
        System.out.println(nome);
        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();
    }
}
