import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        double PC = 0;
        double PV = 0;
        String nome = "";


        for (int i = 1; i <= 2; i++) {

            System.out.println("Digite o nome do produto");
            nome = scanner.nextLine();
            
            System.out.println("Digite o preço de compra da mercadoria " + i + ":");
            PC = scanner.nextDouble();

            System.out.println("Digite o preço de venda da mercadoria " + i + ":");
            PV = scanner.nextDouble();



        }


        scanner.close();
    }
}
