import java.util.Scanner;

public class Uni3Exe8 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor em dolar que quer cambiar: ");
            double dolar = scanner.nextDouble();

            double calculo = dolar * 5;

            System.out.println("O valor digitado cambiado para reais é R$" + calculo    );
        }
    }
}
