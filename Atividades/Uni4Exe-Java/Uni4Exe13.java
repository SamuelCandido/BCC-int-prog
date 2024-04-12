import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();
        int carta3 = scanner.nextInt();

        int qtdCartaBoa = 0;

        if ( carta1 == 1 || carta1 == 2 || carta1 == 3){
            qtdCartaBoa += 1;
        }
        
        if (carta2 == 1 || carta2 == 2 || carta2 == 3 ){
            qtdCartaBoa = qtdCartaBoa + 1;
        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3){
            qtdCartaBoa ++;
        }
            
        if (qtdCartaBoa == 1) {
            System.out.println("TRUCO");
        }

        else{
            if (qtdCartaBoa == 2) {
            System.out.println("SEIS");
            }

            else {
                if (qtdCartaBoa == 3) {
                System.out.println("NOVE");
                }      
            }       
        }
        scanner.close();
    }
}
