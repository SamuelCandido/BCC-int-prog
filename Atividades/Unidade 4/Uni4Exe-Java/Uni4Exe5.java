import java.util.Scanner;


//true e false refaz
public class Uni4Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma cor: ");
        String cor = scanner.nextLine();

        String corUpper = cor.toUpperCase();

        if (corUpper.equals("AZUL")) {
            System.out.println();
            System.out.println("A cor azul é muito bela, olhe para o ceu");
        } 
        
        else if (corUpper.equals("")) {
            System.out.println();
            System.out.println("A oque você não digitou nada, veja: " + cor + "  A não esta vendo? Justamente...");
        }

        else{
            System.out.println();
            System.out.println("A oque você digitou não foi azul, veja: " + cor);
        }


        scanner.close();
    }
}
