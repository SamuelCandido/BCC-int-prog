import java.util.Scanner;

public class Uni3Exe7 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println();
            System.out.println("O programa irá exibir o resultado em ml");
            System.out.println("OBS: Caso não queira levar nem um digite 0");
            System.out.println();

            System.out.print("Digite quantas latas de 350ml você quer: ");
            int lata = scanner.nextInt();

            System.out.print("Digite quantas garrafas de 600ml você quer: ");
            int garrafa = scanner.nextInt();

            System.out.print("Digite quantas garrafas de 2000ml você quer: ");
            int litro = scanner.nextInt();


            int lataMl = 350;

            int garrafaMl = 600;

            int litroMl = 2000;

            int calculo = (lata * lataMl) + (garrafa * garrafaMl) + (litro * litroMl);

            System.out.println("Você esta levando " + calculo + (" ml de refrigenrante"));
        }
    }
}
