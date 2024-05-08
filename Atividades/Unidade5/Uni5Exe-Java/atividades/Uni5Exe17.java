import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = 0.0;
        double menorA = 0.0;
        double maiorA = 0.0;
        int maiorI = 0;
        int menorI = 0;
        int contador = 0;
        

        while (true) {
            contador += 1;

            System.out.println("Digite o numero de inscrição do participante: ");
            int numI = scanner.nextInt();

            if (numI == 0) {
                break;
            }

            System.out.println("Digite a altura do participante: ");
            double altura = scanner.nextDouble();


            if (maiorA <= altura || maiorA == 0) {
                maiorA = altura;
                maiorI = numI;
                media += altura;
            }

            else if (menorA >= altura || menorA == 0) {
                menorA = altura;
                menorI = numI;
                media += altura;
            }
            
        }

        System.out.println();
        System.out.println("O numero de inscrição do maior atleta é: " + maiorI + " tendo " + maiorA + "m de altura");
        System.out.println("O numero de inscrição do menor atleta é: " + menorI + " tendo " + menorA + "m de altura");
        System.out.println("A media de altura dos participantes é: " + (media/contador));

        scanner.close();
    }
}
