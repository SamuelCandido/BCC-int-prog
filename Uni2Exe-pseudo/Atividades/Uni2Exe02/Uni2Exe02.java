package Uni2Exe02;
import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {

        //É ma boa pratica usar o try nesse caso pois ao abrir o chamado da função scanner é 
        // importante fazer ela fechar para que nao fique esperando alguma entrada para sempre
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            System.out.println("#### Digite 2 numeros para fazer multiplicação (AxB) ####");
            System.out.println();

            System.out.println("Atribindo os numeros...");
            System.out.print("Digite um numero para A: ");
            int n1 = scanner.nextInt();
            
            System.out.print("Digite um numero para B: ");
            int n2 = scanner.nextInt();

            
            // Calculo 
            int calculo = n1*n2;

            System.out.println();
            System.out.println("Calculando as variaveis...");

            /*
             * O sistema sempre lera o print como uma operação matematica
             * e ira fazer com que siga essa regra mesmo que tenha strings
             * e inteiros misturados no ultimo caso por exemplo o Java
             * respeitou que era uma multiplicaçã e por precedencia foi 
             * primeiro na multiplicação.
             */

            System.out.println("A multiplicação de "+ n1 +"x"+ n2  +" = " + (n1 * n2));

            System.out.println("Mesmo resultado de "+ n1 +"x"+ n2 + " mas com back diferente = " + calculo);

            System.out.println(n1 * n2 + " = A multiplicação de de "+ n1 +"x"+ n2 +" no começo <-");

            System.out.println("Desmonstração do que acontece se somar diferente dos casos apresentados. "+ n1 + "x" + n2 + " = " + n1 * n2 );

            System.out.println(); 
            System.out.println("################# Fim do programa #################");
            System.out.println();
        }
    }
}
