import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a massa inicial do material radioativo em Kg: ");
        double massaInicial = scanner.nextDouble();
        double guardaMI = massaInicial;
        double guardaMF = 0;
        double massaFinal = 0.5;
        int tempo = 0;
        
        while (massaInicial > massaFinal) {
            massaInicial /= 2; 
            guardaMF = massaInicial;
            tempo += 50;
            System.out.println("Massa atual "+ massaInicial +" apos: "+ tempo + "s");
        }
        
        System.out.println();
        System.out.println("Massa inicial: " + guardaMI + " Kg");
        System.out.println("Massa final: " + guardaMF + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");
        
        scanner.close();
    }
}

