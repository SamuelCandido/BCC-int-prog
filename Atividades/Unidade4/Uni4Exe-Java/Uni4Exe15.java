import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A quantos meses este funcionario está na empresa: ");
        int mContratado = scanner.nextInt();


        if (mContratado >= 13 && mContratado <= 48) {
            System.out.println();
            System.out.println("O funcionario receberá 7% de reajuste");
            

        }

        else if (mContratado >= 0 && mContratado <= 12) {
            System.out.println();
            System.out.println("O funcionario receberá 5% de reajuste");
        }
        else{
            System.out.println();
            System.out.println("Quantidade informada incorreta");
        }


        scanner.close();
    }
    
}
