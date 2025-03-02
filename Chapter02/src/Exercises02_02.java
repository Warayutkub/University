
import java.util.Scanner;

public class Exercises02_02 {
    public static void main(String[] args) {
        float temp,faren;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature(Farenhight) :");
        faren = scan.nextFloat();
        temp = ((faren-32)*5.0f)/9.0f;
        System.out.println("Celsius is " + temp);
        scan.close();
    }
}
