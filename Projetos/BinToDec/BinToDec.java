package Projetos.BinToDec;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor binario para decimal");

        System.out.print("Digite um numero binario: ");
        String binario = scanner.next();


        // Valida
        if (!binario.matches("[01]+")) {
            System.out.println("Voce digitou algo nao binario");
        }

        double resultado = 0;

        for (int i = 0; i < binario.length(); i++) {
            int fragmentaStr = Character.getNumericValue(binario.charAt(binario.length() - 1 - i)); // Fragmenta
            double decimal = fragmentaStr * Math.pow(2, i); // Calcula
            resultado += decimal;
        }

        System.out.printf("%.0f\n", resultado);

        scanner.close();
    }
}
