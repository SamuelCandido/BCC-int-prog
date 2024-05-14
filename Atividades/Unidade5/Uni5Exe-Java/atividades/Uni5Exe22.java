import java.util.Scanner;
public class Uni5Exe22 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        double salario = 2000;
        double porcentagem = 0.015;
        int ano = 1996;

        while ( ano <= 2024) {
            salario = salario + (salario*porcentagem);

            porcentagem = porcentagem*2;  
            ano++;

        }
        System.out.println();
        System.out.println("Salario final:" + porcentagem + " atualmente em 2024"); 
        scanner.close();
    }
}