import java.util.Scanner;

public class Uni4Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n1");
        int n1 = scanner.nextInt();

        System.out.println("n2");
        int n2 = scanner.nextInt();

        int calculo = n2 % n1;

        if (calculo == 0 ){
            System.out.println("Parabens seus numeros são multiplos");
        }

        else if (calculo > 0 ){
            System.out.println("Ops seus numeros não são multiplos");
        }

        else{
            System.out.println("Algo deu errado...");
        }


        scanner.close();
    }
}
