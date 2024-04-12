import java.util.Scanner;

public class Uni3Exe2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            //Caso queira fazer a porcentagem informada pelo usuario
            //System.out.print("Digite a % do desconto: ");
            //double porcentagem = scanner.nextDouble();

            double porcentagem = 12;

            double desconto = (porcentagem / 100) * valor;
            double calculo = valor - desconto;

            System.out.println("O valor do desconto é de R$" + desconto);
            System.out.println("O valor do produto é de R$" + calculo);

        }
    }
}
