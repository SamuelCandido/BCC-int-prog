import java.util.Scanner;

public class Uni4Exe11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();


        if (i1 == i2 && i1 == i3){
            System.out.println();
            System.out.println("São trigemeos todos tem a mesma idade, veja: " + (i1) +" "+ (i2) +" "+ (i3));
        }

        else if (i1 == i2){
            System.out.println();
            System.out.println("Apenas o primeiro e o segundo irmão são gemeos, veja: " + (i1) +" "+ (i2) +" "+ (i3));
        }

        else if (i2 == i3){
            System.out.println();
            System.out.println("Apenas o segundo e o terceiro irmão são gemeos, veja: "+ (i2) +" "+ (i3) +" "+ (i1));
        }

        else if (i3 == i1){
            System.out.println();
            System.out.println("Apenas o segundo e o terceiro irmão são gemeos, veja: "+ (i3) +" "+ (i1) +" "+ (i2));
        }
        else{
            System.out.println();
            System.out.println("Os três tem idades diferentes veja são apenas irmãos: "+ (i1) +" "+ (i2) +" "+ (i3));
        }


    scanner.close();
        


    }
}
