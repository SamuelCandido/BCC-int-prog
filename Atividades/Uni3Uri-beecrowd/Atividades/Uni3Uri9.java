import java.util.Scanner;

public class Uni3Uri9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] valor = scanner.nextLine().split(" ");

        double pi = 3.14159;

        double tRetangulo = (Double.parseDouble(valor[0]) * Double.parseDouble(valor[2])) / 2;

        double circulo = pi * Math.pow (Double.parseDouble(valor[2]), 2 );

        double trapezio = ((Double.parseDouble(valor[0]) + Double.parseDouble(valor[1])) * Double.parseDouble(valor[2])) / 2;

        double quadrado = Double.parseDouble(valor[1]) * Double.parseDouble(valor[1]);

        double retangulo = Double.parseDouble(valor[0]) * Double.parseDouble(valor[1]);



        System.out.printf("TRIANGULO: %.3f%n", tRetangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        scanner.close();
    }
}
