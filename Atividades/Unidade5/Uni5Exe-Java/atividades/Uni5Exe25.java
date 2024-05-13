import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String resposta;
        int direita = 0;
        int esquerda = 0;

        while (true) {
            
            System.out.println();
            System.out.print("Para qual lado foi o ponto? (d/e)?: ");
            resposta = scanner.next();

            

            if (resposta.equalsIgnoreCase("d")) {
                direita++;
            }
            else if (resposta.equalsIgnoreCase("e")) {
                esquerda++;
            }


            if (direita >= 21 || esquerda >= 21) {

                if (Math.abs(direita - esquerda) >= 2) {

                    if (direita > esquerda) {
                        System.out.print("Jogador da direita venceu, placar: E:" + esquerda +" X " + "D:" + direita);
                        break;
                    } 

                    else {
                        System.out.print("Jogador da esquerda venceu, placar: E:" + esquerda +" X " + "D:" + direita);
                        break;
                    }
                 }
             } 
        }
        scanner.close();
    }
}
