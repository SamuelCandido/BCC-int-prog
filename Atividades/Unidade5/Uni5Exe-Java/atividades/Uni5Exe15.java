import java.util.Scanner;
public class Uni5Exe15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double media = 0;
        String nome = "";
        String stop = "fim";
        int cont = 1;

        // equalsIgnoreCase compara ignorando case e o ! antes serve pra dizer que é diferente
        // vai dar errado mas é apenas pra saber usar o equals, o certo é usar um if pra dar um break
        // pq assim ele n vai pedir as notas

        System.out.println();
        System.out.println("Digite o nome do " + cont  + " aluno");
        nome = scanner.next();


        while (!nome.equalsIgnoreCase(stop)) {
            cont += 1;
            
            System.out.println();
            System.out.println("Digite o valor da primeira nota");
            n1 = scanner.nextInt();

            System.out.println();
            System.out.println("Digite o valor da segunda nota");
            n2 = scanner.nextInt();

            media = (n1+n2)/2;

            System.out.println();
            System.out.println("O aluno: " + nome + " obteve uma media de: " + media );
            System.out.println();
            System.out.println("#########################");


            System.out.println();
            System.out.println("Digite o nome do " + cont  + " aluno");
            nome = scanner.next();

        }
       
        scanner.close();
    }
}