import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a distância percorrida em km: ");
        int kmPercorrido = scanner.nextInt();
        
        System.out.print("Informe o tempo gasto em horas: ");
        int tempoGasto = scanner.nextInt();
        
        int velocidadeMedia = kmPercorrido / tempoGasto;
        int consumo = 12;
        double combustivelGasto = kmPercorrido / consumo;
        
        System.out.printf("Combustível gasto na viagem: %.1f L%n", combustivelGasto);
        System.out.printf("Velocidade média: %d km/h%n", velocidadeMedia);
        
        scanner.close();
    }
}
