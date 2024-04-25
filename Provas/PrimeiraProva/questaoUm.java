package Provas.PrimeiraProva;

public class questaoUm {
    public static void main(String[] args) {
        String jogo = "ludo";
        String tipo = "tabuleiro";

        if (jogo == "" && tipo == "") {
            System.out.println("Nao é possivel informar os dados");
            System.out.println("Vazio");
        }
        else{
            System.out.println("jogo: " + jogo);
            if (tipo == "") {
                System.out.println("Tipo vazio");                
            }
            else{
                System.out.println("tipo" + tipo);
            }
        }

        System.out.println("FIM");

        
    }
}
