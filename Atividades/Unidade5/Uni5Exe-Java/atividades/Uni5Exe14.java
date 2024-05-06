import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tCompra = 0, tVenda = 0;
        int menor10 = 0, entre10E20 = 0, maior20 = 0;
        double PC, PV, porcentLucro;
        

        for (int i = 1; i <= 2; i++) {

            System.out.println("Informe o nome de compra da mercadoria " + i + ": ");
            String nome = scanner.next();

            System.out.println("Informe o preço de compra da mercadoria " + i + ": ");
            PC = scanner.nextDouble();

            System.out.println("Informe o preço de venda da mercadoria " + i + ": ");
            PV = scanner.nextDouble();

            porcentLucro = (PV - PC) / PC * 100;

            System.out.println("Produto: "+ nome + " O preço de compra: "+ PC + " O preço de venda é: " + PV);

            tCompra += PC;
            tVenda += PV;

            if (porcentLucro < 10) {
             menor10++;
            } 

            else if (porcentLucro <= 20) {
                entre10E20++;
            } 

            else {
                maior20++;
            }
        }

        System.out.println();
        System.out.println("Lucro < 10%: " + menor10);
        System.out.println("Lucro entre 10% e 20%: " + entre10E20);
        System.out.println("Lucro > 20%: " + maior20);

        System.out.println("Total de compra: " + tCompra);
        System.out.println("Total de venda: " + tVenda);
        System.out.println("Lucro total: " +  (tVenda - tCompra));

        scanner.close();
    }
}

