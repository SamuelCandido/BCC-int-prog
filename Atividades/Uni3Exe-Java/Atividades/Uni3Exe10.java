import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o comprimento do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Digite o comprimento do segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        
        double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        
        System.out.println("O comprimento da hipotenusa é: " + hipotenusa);
        
        scanner.close();
    }
    
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        // Usando o teorema de Pitágoras para calcular a hipotenusa
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return hipotenusa;
    }
}
