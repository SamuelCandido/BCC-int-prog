import java.util.Scanner;

public class Uni4Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("O valor: " + n1 + " é maior");
        }
        else if(n1 < n2){
            System.out.println("O valor: " + n2 + " é maior");
        }
        else{
            System.out.println("Os valores: " + n1 + " e " + n2 + " são iguais");
        }

        scanner.close();

    }
}
