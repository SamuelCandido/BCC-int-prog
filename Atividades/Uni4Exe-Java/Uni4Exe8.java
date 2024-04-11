import java.util.Scanner;

public class Uni4Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma letra");
        String letra = scanner.nextLine();

        String lUpper = letra.toUpperCase();

        if (lUpper.equals("A") || lUpper.equals("E") || lUpper.equals("I") ||
            lUpper.equals("O") || lUpper.equals("U")){

                System.out.println();
                System.out.println("Você digitou a vogal: " + letra);
            }

        else{
            System.out.println();
            System.out.println("Você digitou tudo menos uma letra ou uma vogal: " + letra);
        }

        scanner.close();

    }
}
