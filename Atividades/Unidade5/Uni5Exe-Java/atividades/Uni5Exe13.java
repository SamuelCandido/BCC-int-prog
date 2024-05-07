import java.util.Scanner;
public class Uni5Exe13 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o km atual:");
        int kmAtual = scanner.nextInt();

        System.out.println("Quantas qtdPardas fez:");
        int qtdParda = scanner.nextInt();
        int mKM = 0;
        int mL2 = 0;
       
        


        for (int i = 1; i <= qtdParda; i++){

            System.out.println("Quantos litros encheu nessa parada?");
            int litro = scanner.nextInt();
    
            System.out.println("Qual a KM no hodometro?");
            int kmAntiga = scanner.nextInt();
            System.out.println();

            int k = kmAntiga-kmAtual;
            mKM += k;
            mL2 += litro;

            double qntpara = k/litro;
            System.out.println("qnt de km por litro nessa qtdParda = " + qntpara + "km/l");


        }
        System.out.println();
        System.out.println("media de km por litro no total " + mKM/mL2 + " km/l");
        scanner.close();
    }
}