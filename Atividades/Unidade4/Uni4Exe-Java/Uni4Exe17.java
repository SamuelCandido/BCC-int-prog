import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua renda liquida: ");
        double salario = scanner.nextDouble();  
        
        System.out.println();
        System.out.println("Informe a quantidade de dependentes: ");
        int dependentes = scanner.nextInt();

        double doisPorcento = (salario * (dependentes * 2) ) / 100;

        double imposto;
        
        if (salario < 2000) {
            imposto = 0; 
        } 
        else if (salario >= 2000 && salario < 5000) {
            imposto = (salario * 5) / 100;
            double menosDependentes = imposto - doisPorcento;
            if (menosDependentes > 0 ) {
                System.out.println("Seu salario é: " + (salario - menosDependentes));
            }
                
        } 
        else if (salario >= 5000 && salario < 10000) {
            imposto = (salario * 10) / 100;
        } 
        else {
            imposto = (salario * 15) / 100;
        }

        //imposto = (doisPorcento += dependentes);

        if (imposto <= 0) {
            System.out.println("Você está isento de imposto.");
        } else {
            System.out.println("Seu imposto será: R$" + imposto);
        }

        scanner.close();
    }
}