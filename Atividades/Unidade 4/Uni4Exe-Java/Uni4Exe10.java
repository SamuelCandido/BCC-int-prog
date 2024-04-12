import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> ordenado = new ArrayList<>();

        System.out.println("Digite a idade de Marquinhos:");
        int m = scanner.nextInt();
        ordenado.add(m);
        
        System.out.println();
        System.out.println("Digite a idade de Zezinho:");
        int z = scanner.nextInt();
        ordenado.add(z);

        System.out.println();
        System.out.println("Digite a idade de Luluzinha:");
        int l = scanner.nextInt();
        ordenado.add(l);


        ordenado.sort(null);

        int idade = ordenado.get(0);

        System.out.println();
        System.out.println("A idade ordenada do menor para o maior é: " + ordenado);
        System.out.println("A idade do caçula é: " + idade);

        scanner.close();

    }
}
