import java.util.Scanner;
public class Uni5Exe11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Dias operantes: ");
        int dia = scanner.nextInt();
        int hora = dia * 16;

        int qtdQuebrado = 1;
        int soma = 1;
        for (int cont = 2; cont <= hora; cont++){
            soma = soma * 3;
            qtdQuebrado += soma;
 
        }
        System.out.println("A quantidade de biscoitos quebrados em "+ dia + " foram: " + qtdQuebrado);

        scanner.close();
    }
}