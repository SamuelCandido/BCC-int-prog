import java.util.Scanner;

public class Uni3Uri6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int nFuncionario = scanner.nextInt();
        double hora = scanner.nextDouble();
        double vHora = scanner.nextDouble();
        
        double calculo = vHora * hora;

        System.out.println("NUMBER = " + nFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", calculo);

        scanner.close();
    }
}
