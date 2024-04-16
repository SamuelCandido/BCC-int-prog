import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu curso");
        System.out.println("1 _ Ciência da Computação");
        System.out.println("2 _ Licenciatura da Computação");
        System.out.println("3 _ Sistemas de Informação");

        int opcao = scanner.nextInt();

        System.out.println();
        System.out.println("Você vai receber o seguinte titulo: ");

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;

            case 2:
                System.out.println("Licenciado em Computação");
                break;

            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;

            default:
                break;
        }

        scanner.close();
    }
}
