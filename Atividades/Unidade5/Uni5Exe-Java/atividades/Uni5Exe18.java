import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        int canalA = 0;
        int canalB = 0;
        int canalC = 0;
        int canalD = 0;
        
        double totalP = 0.0;

        double resultadoA;
        double resultadoB;
        double resultadoC;
        double resultadoD;
        
        while (true) {
            
            System.out.println("Digite quantas pessoas estavam assistindo o canal: ");
            int numPCasa = scanner.nextInt();

            System.out.println("Digite o numero do canal (4, 5, 9, 12 ou 0 para sair): ");
            String canal = scanner.next();

            if (canal.equalsIgnoreCase("0")) {
                System.out.println("Sistema encerrado");
                break;
            }

            else if (canal.equalsIgnoreCase("4")) {
                canalA += numPCasa;
                totalP += numPCasa;
            }

            else if (canal.equalsIgnoreCase("5")) {
                canalB += numPCasa;
                totalP += numPCasa;
            }

            else if (canal.equalsIgnoreCase("9")) {
                canalC += numPCasa;
                totalP += numPCasa;
            }

            else if (canal.equalsIgnoreCase("12")) {
                canalD += numPCasa;
                totalP += numPCasa;
            }
        }


        //Pelo menos um dos lados da divisão tem que ser double pois o resultado é double
        // Dividir por inteiros não tem como reultar em algo flutuante, isto significa 
        // Uma divisão truncada
        resultadoA = (canalA / totalP) * 100;
        resultadoB = (canalB / totalP) * 100;
        resultadoC = (canalC / totalP) * 100;
        resultadoD = (canalD / totalP) * 100;

        System.out.println();
        System.out.println(resultadoA + "% das pessoas veem o canal 4");
        System.out.println(resultadoB + "% das pessoas veem o canal 5");
        System.out.println(resultadoC + "% das pessoas veem o canal 9");
        System.out.println(resultadoD + "% das pessoas veem o canal 12");


        scanner.close();
    }
}
