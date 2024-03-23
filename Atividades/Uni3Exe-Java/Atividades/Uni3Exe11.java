import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor em graus celcius x°0 (somente o numero: ): ");
            double c = scanner.nextDouble();


            /*
             * A formula no github esta errada
             * https://www.digikey.com.br/pt/resources/conversion-calculators/conversion-calculator-temperature
             */
            double f = c * 9/5 + 32;

            System.out.println("A temperatura em farin é: " + f );
        }
    }
}
