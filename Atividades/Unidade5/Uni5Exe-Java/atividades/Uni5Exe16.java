import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int contF = 0;
        int contM = 0;
        int contO = 0;
        double alturaF = 0;
        double alturaM = 0;
        double alturaO = 0;
        double mediaF = 0;
        double mediaM = 0;
        double mediaO = 0;

        System.out.println("########################");
        System.out.println("### Opções de genero ###");
        System.out.println("###   F - Feminino   ###");
        System.out.println("###   M - Masculino  ###");
        System.out.println("###   O - Outro      ###");
        System.out.println("###   0 - Sair       ###");
        System.out.println("########################");

        while (true) {
            cont += 1;
            System.out.println();
            System.out.println("Digite o genero da "+ cont +" pessoa: ");
            String genero = scanner.next().toUpperCase();

            System.out.println();
            System.out.println("Digite a altura da "+ cont +" pessoa: ");
            double altura = scanner.nextDouble();
            if (genero == "0") {
                break;
            }
            
            else if (altura == 0) {
                break;
            }

            else if (genero.equalsIgnoreCase("F")) {
                contF += 1;
                alturaF += altura;    
                mediaF = alturaF/contF;
            }
                
            else if (genero.equalsIgnoreCase("M")) {
                contM += 1;
                alturaM += altura;
                mediaM = alturaM/contM;
            } 

            else if (genero.equalsIgnoreCase("O")) {
                contO += 1;
                alturaO += altura; 
                mediaO = alturaO/contO;
            }

            else{
                System.out.println("Entrada invalida");
            }


        }

        System.out.println();
        System.out.println("###  Você colocou '0' saindo do sistema   ### ");
        System.out.println("A altura media das Mulheres é: " + mediaF);
        System.out.println("A altura media dos Homens é: " + mediaM);
        System.out.println("A altura media dos Outros é: " + mediaO);
        
        scanner.close();
    }
}
