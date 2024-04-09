import java.util.Scanner;

public class Uni4Uri5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startGame = scanner.nextInt();
        int endtGame = scanner.nextInt();

        if (startGame > endtGame ){
            int horas = 24-(startGame - endtGame);
            System.out.println("O JOGO DUROU "+ horas +" HORA(S)");
        }

        else if (startGame == endtGame){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        else{
            int horas = (endtGame - startGame);
            System.out.println("O JOGO DUROU "+ horas +" HORA(S)");
        }

        scanner.close();
    }
}
