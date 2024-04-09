import java.util.Scanner;

public class Uni3Uri13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        scanner.close();
    }
}
