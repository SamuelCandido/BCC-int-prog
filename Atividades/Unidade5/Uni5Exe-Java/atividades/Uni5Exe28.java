import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votoT = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int vencedor = 0;
        int codVencedor = 0;

        System.out.print("Mais um voto?: ");
        String decisao = scanner.nextLine();

        while (decisao.equalsIgnoreCase("S")) {
            votoT++;

            System.out.println("Digite o codgio: ");
            int cod = scanner.nextInt();
            scanner.nextLine();

            if (cod == 1) {
                cont1++;
            }

            else if (cod == 2) {
                cont2++;
            }

            else if (cod == 3) {
                cont3++;
            }

            else if (cod == 4) {
                cont4++;
            }

            if (vencedor < cont1 || vencedor < cont2 || vencedor < cont3 || vencedor < cont4) {
                codVencedor = cod;
            }

            System.out.print("Mais um voto?: ");
            decisao = scanner.nextLine();
        }
        
        System.out.println();
        System.out.println("Com "+ cont1 +" votos nem um conjunto conseguiu um porcentual de: " + ((double) cont1/votoT) * 100);
        System.out.println("Com "+ cont1 +" votos CPM22 conseguiu um porcentual de: " + ((double) cont2/votoT) * 100);
        System.out.println("Com "+ cont1 +" votos Skank conseguiu um porcentual de: " + ((double) cont3/votoT) * 100);
        System.out.println("Com "+ cont1 +" votos Jota Quest conseguiu um porcentual de: " + ((double) cont4/votoT) * 100);
        System.out.println();
        System.out.println("O codigo do grupo vencedor é: " + codVencedor);
        


        scanner.close();
    }
}
