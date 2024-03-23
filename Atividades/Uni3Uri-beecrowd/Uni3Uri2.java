import java.util.Scanner;
import java.lang.Math;

public class Uni3Uri2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        float pi = 3.14159f;

        float raio = scanner.nextFloat();
        
        double area = pi *  Math.pow(raio, raio);

        System.out.println("A=" + area);
    }
}
