import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Uni4Uri4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> ordenado = new ArrayList<>();
        List<Integer> nOrdenado = new ArrayList<>();


        int n1 = scanner.nextInt();
        ordenado.add(n1);
        nOrdenado.add(n1);

        int n2 = scanner.nextInt();
        ordenado.add(n2);
        nOrdenado.add(n2);

        int n3 = scanner.nextInt();
        ordenado.add(n3);
        nOrdenado.add(n3);

        System.out.println(nOrdenado);

        ordenado.sort(null);

        for (int contador : ordenado) {
            System.out.println(contador);
        }

        System.out.println();

        for (int contador : nOrdenado) {
            System.out.println(contador);
        }

        scanner.close();

    }
}
