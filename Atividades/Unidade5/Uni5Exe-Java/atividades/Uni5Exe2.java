public class Uni5Exe2 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int num = i+1;

            try {
                int resposta = num % 2;

                if (resposta == 0) {
                    System.out.println();
                    System.out.println("O numero "+ num + " é par");
                    System.out.println();
                }
                else{
                    System.out.println();
                    System.out.println("O numero "+ num + " é impar");
                    System.out.println();
                }
                
            } 
            
            catch (NumberFormatException e) {

                System.out.println();
                System.out.println("ENTRADA INVALIDA");
                System.out.println();
            }
        }
    }
}