public class Uni5Exe10 {
    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 25;
        int milhar;
        int total;
        int elevado;
        int cont = 1;

        

        for (int i = 1; cont <= 30; i++) {
            
            //milhar = num1 * 100;
            //total = milhar + num2;
            elevado = (num1 + num2) * (num1 + num2);
            //num1 = num2;
           //num2 = i;


            if (elevado == 3025 && elevado != 0 ) {
                cont += 1;
                System.out.println(cont + ") " + elevado);
            }

        }
    }
}

