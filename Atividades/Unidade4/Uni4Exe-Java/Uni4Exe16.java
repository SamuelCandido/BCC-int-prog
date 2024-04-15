import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da primeira mulher: ");
        int m1 = scanner.nextInt();

        System.out.println();
        System.out.println("Digite a idade da segunda mulher: ");
        int m2 = scanner.nextInt();

        System.out.println();
        System.out.println("Digite a idade do primeiro homem: ");
        int h1 = scanner.nextInt();

        System.out.println();
        System.out.println("Digite a idade do segundo homem: ");
        int h2 = scanner.nextInt();

        if (m1 < m2 && h1 < h2) {
            int casal1 = h2 + m1;
            System.out.println("Soma " + casal1);

            int casal2 = h1 * m2;
            System.out.println("Produto" + casal2);
        }

        else if (m1 > m2 && h1 > h2) {
            int casal1 = h1 + m2;
            System.out.println("Soma " + casal1);
            
            int casal2 = h2 * m1;
            System.out.println("Produto " + casal2);
        }

        else if (h1 > h2 && m1 < m2   ){
            int casal1 = h1 + m1;
            System.out.println("Soma " + casal1);

            int casal2 = h2 * m2;
            System.out.println("Produto " + casal2);
        }
        else if (h1 < h2 && m1 > 2   ){
            int casal1 = h2 + m2;
            System.out.println("Soma " + casal1);

            int casal2 = h1 * m1;
            System.out.println("Produto " + casal2);
        }
        
        else{
            System.out.println("Idades iguais");
        }

        scanner.close();
    }
}
