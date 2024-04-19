import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora que você entrou: ");
        int hEntrada = scanner.nextInt();
        int mEntrada = scanner.nextInt();

        System.out.println("Digite a hora que você saiu: ");
        int hSaida = scanner.nextInt();
        int mSaida = scanner.nextInt();

        int recebe1 = hEntrada * 60;
        int recebe2 = hSaida * 60;
        int totalHora; //Recebe resultado de permanencia e aux para calculo hora extra
        int hPermanencia;
        int mPermanencia;
        double calculo;

        //Garante que valor inicio não seja negativo e verifica tempo de permanencia
        if (recebe1 > recebe2) {
            totalHora = (recebe1 + mEntrada) - (recebe2 + mSaida); 
        }
        else{
            totalHora = (recebe2 + mSaida) - (recebe1 + mEntrada);
        }

        //Separa as horas dos minutos
        hPermanencia = totalHora / 60;
        mPermanencia = totalHora % 60;

        //Verifica se os minutos para cobrar hora completa
        if (mPermanencia <= 29 && hPermanencia != 0) {
            if (hPermanencia >= 1 && hPermanencia <= 2) {
                calculo =  hPermanencia * 5;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
            }

            else if (hPermanencia >= 3 && hPermanencia <= 4) {
                calculo =  hPermanencia * 7.50;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
            }

            else if (hPermanencia >= 5) {
                calculo =  hPermanencia * 10;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
            }

        }

        //Verifica se os minutos para cobrar hora completa
        else if (mPermanencia >= 30 && hPermanencia != 0) {
            totalHora = hPermanencia + 1;

            if (totalHora >= 1 && totalHora <= 2) {
                calculo =  totalHora * 5;
                System.out.println("tot" + totalHora);
                System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
            }

            else if (totalHora >= 3 && totalHora <= 4) {
                calculo =  totalHora * 7.50;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
            }

            else if (totalHora >= 5) {
                calculo =  totalHora * 10;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
            }

        }

        else if (hPermanencia <= 0) {
            hPermanencia = 00;//Garante que as horas não sejam negativas
            System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + 5.00);
        }

        else{
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}