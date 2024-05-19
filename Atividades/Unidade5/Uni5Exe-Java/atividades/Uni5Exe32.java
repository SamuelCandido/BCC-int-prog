import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Em que dia começa o mes? (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int diaSemana = scanner.nextInt();

        while (true) {
            if (diaSemana < 1 || diaSemana > 7) {
                System.out.println("O dia da semana deve estar entre 1 e 7.");   
                System.out.print("Em que dia começa o mes? (1=Domingo, 2=Segunda,...,7=Sábado): ");
                diaSemana = scanner.nextInt();
            }
    
            else{
                System.out.print("Quantos dias tem o mes?: ");
                int numeroDias = scanner.nextInt();
    
                if (numeroDias < 28 || numeroDias > 31) {
                    System.out.println("E o numero de dias do mes deve estar entre 28 e 31.");
                }  

                else{
                    int dia = 1;
                    int posicao = 1;
            
                    System.out.println("Dom Seg Ter Qua Qui Sex Sab");
            
                    while (posicao < diaSemana) {
                        System.out.print("    ");
                        posicao++;
                    }
            
                    while (dia <= numeroDias) {
                        System.out.printf("%3d ", dia);
                        if (posicao % 7 == 0) {
                            System.out.println();
                        }
                        dia++;
                        posicao++;
                    }
            
                    System.out.println();
                    break;
                } 
            }    
        }
        

        scanner.close();
    }
}
