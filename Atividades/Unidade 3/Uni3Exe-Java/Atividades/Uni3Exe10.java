import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
        System.out.print("Digite o comprimento do primeiro cateto: ");
        int cateto1 = scanner.nextInt();
        
        System.out.print("Digite o comprimento do segundo cateto: ");
        int cateto2 = scanner.nextInt();
        
        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        
        System.out.println("O comprimento da hipotenusa é: " + hipotenusa);
        
        scanner.close();
    }
}
