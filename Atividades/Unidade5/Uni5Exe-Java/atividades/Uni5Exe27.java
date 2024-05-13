import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double aux = 0.0;
        double soma = 0.0;
        double total = 0;
        int producao = 0;
        int manha = 0;
        int tarde = 0;
        int maiorProducao = 0;
        int guradaDia = 0;

        System.out.print("Novo funcionario (1 = sim | 2 = não)? ");
        int decisao = scanner.nextInt();


        while (decisao == 1) {
            System.out.print("Digite o dia do mes de abril: ");
            int dia = scanner.nextInt();


            if (dia > 0 && dia < 31) {
                
                System.out.print("Digite a quantidade de peças de MANHA: ");
                manha = scanner.nextInt();

                System.out.print("Digite a quantidade de peças de TARDE: ");
                tarde = scanner.nextInt();

                producao = manha + tarde;

                if (dia > 0 && dia <= 15) {
                    if (manha > 30 && tarde > 30) {
                        aux = 0.80;
                        total = producao * aux;
                    }
                    else{
                        aux = 0.50;
                        total = producao * 0.50;
                    }
                }

                else{
                    total = manha * 0.40;
                    total += tarde * 0.30;
                }

                System.out.println("O valor ganho no dia: " + total);
            }

            else{
                System.out.println("Dia invalido");
            }
            if (maiorProducao <= producao) {
                maiorProducao = producao;
                guradaDia = dia;
            }

            
            System.out.print("NOVO funcionario (1 = sim | 2 = não)? ");
            decisao = scanner.nextInt();
        }
        
        System.out.print("O melhor dia foi o "+ guradaDia);
                if (manha > tarde) {
                    System.out.println("O periodo que mais produziu é o da manha: " + manha);
                }
                else{
                    System.out.println(", e o periodo que mais produziu é o da tarde: " + tarde);
                }

        scanner.close();
    }
}
