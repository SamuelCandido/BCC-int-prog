import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desconto = 0.0;
        double calculo = 0.0;
        double total = 0.0;
        
        while (true) {
        
            System.out.print("Digite o valor da compra: ");
            double vCompra = scanner.nextDouble();

            if (vCompra == 0) {
                System.out.println("Fechando caixa");
                break;
            }


            if (vCompra <= 500) {
                desconto = vCompra * 0.15;
                calculo = vCompra - desconto;
                total += calculo;
                System.out.println("Apos o desconto de 15% você irá pagar: " + calculo);
            }


            else{
                desconto = vCompra * 0.20;
                calculo = vCompra - desconto;
                total += calculo;
                System.out.println("Apos o desconto de 20% você irá pagar: " + calculo);
            }
            
        }

        System.out.println("A loja ira receber no final do dia: "+ total +" reais");

        scanner.close();
    }
}
