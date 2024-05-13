import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;
        int totalP = 0;

        System.out.print("Diga o valor por peça: ");
        double valorP = scanner.nextDouble();

        System.out.print("Novo funcionario (1 = sim | 2 = não)? ");
        int decisao = scanner.nextInt();


        while (decisao == 1) {
            System.out.print("Digite o dia do mes de abril: ");
            int dia = scanner.nextInt();

            if (dia > 0 && dia < 31) {
                
                System.out.print("Digite a quantidade de peças de MANHA: ");
                int manha = scanner.nextInt();

                System.out.print("Digite a quantidade de peças de TARDE: ");
                int tarde = scanner.nextInt();

                totalP = manha + tarde;
                soma = totalP * valorP;

                System.out.println("O valor ganho no dia por produzir " + totalP + " peças foi: " + soma);

            }

            else{
                System.out.println("Dia invalido");
            }
            
            System.out.print("Novo funcionario (1 = sim | 2 = não)? ");
            decisao = scanner.nextInt();

        }
        scanner.close();
    }
}
