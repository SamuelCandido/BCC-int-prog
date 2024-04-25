package Provas.PrimeiraProva;

import java.util.Scanner;

public class questaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.nextLine();
        String letraUpper = letra.toUpperCase();

        if (letraUpper == "A") {
            System.out.println("alfa");
        }

        else if (letraUpper == "B") {
            System.out.println("Beta");
        }
        
        else if (letraUpper == "G"){
            System.out.println("Gama");
        }

        else{
            System.out.println("Entrada invalida");
        }
       scanner.close();
    }
}
