import java.util.Scanner;

public class Uni4Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu sexo com as seguinte opções:");
        System.out.println("M: Masculino");
        System.out.println("F: para Feminino");
        System.out.println("I: para Indiferente");
        System.out.println();
        String sexo = scanner.nextLine();

        String sUpper = sexo.toUpperCase();

        if (sUpper.equals("M")){
            System.out.println();
            System.out.println("Você é Homem");
        }

        else if (sUpper.equals("F")){
            System.out.println();
            System.out.println("Você é Mulher");
        }

        else if (sUpper.equals("I")){
            System.out.println();
            System.out.println("Não informado");
        }
        
        else{
            System.out.println("Você digitou uma ou mais letras que não podem ser usadas");
        }

        scanner.close();

    }
}
