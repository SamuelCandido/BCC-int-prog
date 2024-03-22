package Uni2Exe01;
import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {

        //É ma boa pratica usar o try nesse caso pois ao abrir o chamado da função scanner é 
        // importante fazer ela fechar para que nao fique esperando alguma entrada para sempre
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            System.out.println("#### Digite 2 numeros para fazer sua soma (A+B) ####");
            System.out.println();

            System.out.println("Atribindo os numeros...");
            System.out.print("Digite um numero para A: ");
            int n1 = scanner.nextInt();
            
            System.out.print("Digite um numero para B: ");
            int n2 = scanner.nextInt();

            
            // Calculo 
            int calculo = n1+n2;

            System.out.println();
            System.out.println("Calculando as variaveis...");

            //Nesta maneira voce isola as variaveis inteiras para elas fazerem a operação matematica
            // e depois somar com a STR, caso voce passe sem os parenteses ele irá somar os carateres
            // das variaveis por exemplo 1 + 1 = 11 pois sao dois caracteres "1"
            System.out.println("A soma de A+B = " + (n1 + n2));

            //Já neste caso se voce fizer uma variavel para efetuar o calculo antes de chamar no 
            // print ela ja vai estar com a somo aritimetica normal e entao so vai somar o 
            // caraceter normal
            System.out.println("Mesmo resultado de A+B mas com back diferente = " + calculo);

            // Já neste caso quando é passado a soma antes de passar a string o sistema ira ler primeiro 
            // as variaveis então ira acontecer de forma aritimetica e apos ira somar com a string
            System.out.println(n1 + n2 + " = A soma de A+B no começo <-");

            //Aqui esta o caso de que o programa ira ler tudo como string
            System.out.println("Desmonstração do que acontece se somar diferente dos casos apresentados. A+b = " + n1 + n2 );

            System.out.println(); 
            System.out.println("################# Fim do programa #################");
            System.out.println();
        }
    }
}
