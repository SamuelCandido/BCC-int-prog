public class Uni5Exe21 {
    public static void main(String[] args) {
        
        double chico = 1.50;
        double ze = 1.10;

        int ano = 0;

        while (chico > ze) {
            chico += 0.02;
            ze += 0.03;
            ano += 1;
        }

        System.out.println("Foi necessario "+ ano +" anos para que Zé fosse maior que Chico. Ze com: "+ ze +"m e Chico com: "+ chico +"m");



    }
}
