import java.util.Scanner;

public class Uni4Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean saida = scanner.nextBoolean();
        

        if (saida == true){
            System.out.println("Sim é azul");
        }
        
        else{
            System.out.println("Não oque você digitou não é azul");
        }

        scanner.close();
    }
}
