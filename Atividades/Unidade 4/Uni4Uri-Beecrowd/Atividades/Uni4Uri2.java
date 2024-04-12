import java.util.Scanner;

public class Uni4Uri2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();

        if ( A >= 0 && A <= 25.0000){
            System.out.println("Intervalo [0,25]");
        }

        else if (A >= 25.0000 && A <= 50.0000){
            System.out.println("Intervalo (25,50]");
        }

        else if (A >= 75.0000 && A <= 100.0000){
            System.out.println(	"Intervalo (75,100]");
        }

        else{
            System.out.println("Fora de intervalo");
        }

        scanner.close();

        
    }
}
