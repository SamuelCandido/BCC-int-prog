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

        double calculo;

        int hPermanencia = (hSaida - hEntrada);
        int mPermanencia = (mSaida - mEntrada);

        //Força as horas de permanencia ficar positiva apos calculo
        if (hPermanencia < 0) {
                hPermanencia = (hEntrada - hSaida);
        }

        //Força os minutos de permanencia ficar positiva apos calculo
        if (mPermanencia < 0) {
            mPermanencia = (mEntrada - mSaida);
        }

        //Define range de horas e minutos
        if (hEntrada >=0 && hSaida >=0 && hEntrada <=24 && hSaida <=24 && mEntrada >=0 && mSaida >=0 && mEntrada <=59 && mSaida <=59) {

            //Condição que se permanencia < 30m paga 1h igual
            if (hPermanencia == 0 && mPermanencia < 30) {
                System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + 5.00);
            }

            //Arredondamento para baixo
            else if (mPermanencia >= 0 && mPermanencia <= 29 ) {
        
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

            //Arredondamento para cima
            else if (mPermanencia >= 30) {

                if (hPermanencia >= 1 && hPermanencia <= 2) {
                    calculo =  (hPermanencia + 1) * 5;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
                }

                else if (hPermanencia >= 3 && hPermanencia <= 4) {
                    calculo =  (hPermanencia + 1) * 7.50;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
                }

                else if (hPermanencia >= 5) {
                    calculo =  (hPermanencia + 1) * 10;
                    System.out.println("Você ficou estacionado por " + hPermanencia + "h:" + mPermanencia + "m vai pagar R$" + calculo);
                }
            }    

        }

        else{
            System.out.println("As horas e os minutos tem que estar dentro do range h(0-24) e m(0-59)");
        }
    
        scanner.close();
    }
}