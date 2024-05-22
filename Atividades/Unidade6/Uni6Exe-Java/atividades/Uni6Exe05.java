import java.util.Scanner;

public class Uni6Exe05{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String ele[] = new String[5];
        String ela[] = new String[5];
        int cont = 1;
        int amor = 0;

        System.out.println("1 - Gosta de música sertaneja?\r\n" + //
                        "2 - Gosta de futebol?\r\n" + //
                        "3 - Gosta de seriados?\r\n" + //
                        "4 - Gosta de redes sociais?\r\n" + //
                        "5 - Gosta da Oktoberfest?");
        System.out.println();
        System.out.println("Diga as respostas dele");
        for (int i = 0; i < ele.length; i++ ){
            System.out.print("ELE: Resposta da pergunta " + cont +": ");
            ele[i] = scanner.nextLine();

            System.out.print("ELA: Resposta da pergunta " + cont +": ");
            ela[i] = scanner.nextLine();
            
            if (ela[i].equalsIgnoreCase(ele[i])) {
                amor += 3;
            }
            else if (ela[i].equalsIgnoreCase("IND") && ele[i].equalsIgnoreCase("SIM") || ela[i].equalsIgnoreCase("IND") && ele[i].equalsIgnoreCase("NAO") ||
                    ele[i].equalsIgnoreCase("IND") && ela[i].equalsIgnoreCase("SIM") || ele[i].equalsIgnoreCase("IND") && ela[i].equalsIgnoreCase("NAO")) {
                amor += 1;
            }
            else if (ele[i].equalsIgnoreCase("SIM") && ela[i].equalsIgnoreCase("NAO") || ele[i].equalsIgnoreCase("NAO") && ela[i].equalsIgnoreCase("SIM")) {
                amor += -2;   
            }
            
            System.out.println();
            System.out.println(amor);
            cont++;
        }
        
        System.out.println();
        if (amor == 15) {
            System.out.println("Casem!");
        }

        else if (amor >= 10 && amor <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        }

        else if (amor >= 5 && amor <= 9) {
            System.out.println("Talvez não dê certo :(");
        }

        else if (amor >= 0 && amor <= 4) {
            System.out.println("Vale um encontro");
        }

        else if (amor >= -9 && amor <= -1) {
            System.out.println("Melhor não perder tempo");
        }

        else if (amor == -10 ) {
            System.out.println("Vocês se odeiam!");
        }
        System.out.println(amor);
        scanner.close();
    }
}