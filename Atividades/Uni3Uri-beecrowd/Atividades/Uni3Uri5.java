import java.util.Scanner;

public class Uni3Uri5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int DIFERENCA = (A * B - C * D);

        //Depende o tipo do print q vc vai dar muda o sinal
        // da concatenização println é string + mas se for
        // printf ele vira formato , 
        System.out.println("DIFERENCA = "+ DIFERENCA);

        scanner.close();
    }
}
