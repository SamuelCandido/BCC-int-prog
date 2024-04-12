import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lado 1");
        double lado1 = scanner.nextDouble();

        System.out.println("Lado 2");
        double lado2 = scanner.nextDouble();

        System.out.println("Lado3");
        double lado3 = scanner.nextDouble();


        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println();
                System.out.println("É equilatero");
            }
            else{
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                    System.out.println();
                    System.out.println("É isósceles");
                }
                else{
                    System.out.println();
                    System.out.println("É escaleno");
                }
            }
        }
        else{
            System.out.println();
            System.out.println("As medidas não formam um triangulo");
        }

        scanner.close();
    }
}
