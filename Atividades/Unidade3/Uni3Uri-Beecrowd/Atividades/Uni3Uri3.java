import java.util.Scanner;

public class Uni3Uri3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
       
        int PROD = n1 * n2;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
