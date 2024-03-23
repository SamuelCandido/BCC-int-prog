import java.util.Scanner;

public class Uni3Exe3 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor da gasolina: ");
            double vGasolina = scanner.nextDouble();

            System.out.print("Digite o valor que quer abastecer: ");
            double pagamento = scanner.nextDouble();

            double calculo = pagamento / vGasolina;

            System.out.println("Com este valor deu para abastecer:" + calculo +" litros");
        }
    }
}
