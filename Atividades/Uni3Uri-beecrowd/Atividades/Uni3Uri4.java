import java.util.Scanner;

public class Uni3Uri4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();

        double B = scanner.nextDouble();

        double p1 = 3.5;
        double p2 = 7.5;

        double somaNota = (A * p1) + (B * p2);
        double somaPeso = p1+p2;

        double MEDIA = somaNota / somaPeso;

        System.out.printf("A=%.5f%n", MEDIA);

        scanner.close();
    }
}
