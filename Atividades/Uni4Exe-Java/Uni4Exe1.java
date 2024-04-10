import java.util.Scanner;

public class Uni4Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas horas foram trabalhadas: ");
        double hMes = scanner.nextDouble();

        System.out.println("Digite o valor hora do empregado: ");
        double vHora =scanner.nextDouble();

        if (hMes > 160){
            double hExtra = hMes - 160;
            double hNormal = hMes - hExtra;
            double calculo = hExtra  * (vHora + ( vHora/2 ));

            double pagamento = (hNormal * vHora) + calculo;

            System.out.println("Você irá receber: R$" + pagamento);

        }
        else {
            System.out.println("deu errado");
        }

        scanner.close();
    }
}
