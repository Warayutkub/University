
import java.util.Scanner;

public class Exercises02_01 {
    public static void main(String[] args) {
        float temp,faren;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature(Celsius) :");
        temp = scan.nextFloat();
        faren = (9.0f/5.0f)*temp + 32;
        System.out.println("farenhight is " + faren);
        scan.close();
    }
}
