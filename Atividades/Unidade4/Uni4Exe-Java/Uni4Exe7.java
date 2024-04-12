import java.util.Scanner;

public class Uni4Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da carta:");
        double carta = scanner.nextDouble();

        double vSelo = 0.45;

        if (carta <= 50 ){
            System.out.println();
            System.out.println("O valor total do selo fica de R$" + vSelo);
        }
        
        else if (carta <= 0){
            System.out.println();
            System.out.println("Esta tentando enviar nada?");
        }

        else{
            double pExcedido = carta - 50;
            double adicional = (pExcedido/20) + 1;
            double calculo = vSelo + (vSelo * adicional);

            System.out.println();
            System.out.println("O valor do selo é de R$" + vSelo + " com um adicional de R$" + 
            (vSelo * adicional) + " no total fica R$" + calculo);
        }

        scanner.close();

    }
}
