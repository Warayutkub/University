
import java.util.Scanner;

public class Example03_02 {
    public static void main(String[] args) {
        final double PAYRATE = 12.25;
        double hour,wage;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter hour worked : ");
        hour = scan.nextDouble();
        if ((hour < 0 || hour > 40.0))
            System.out.println("Input err");
        else{
            wage = hour * PAYRATE;
            System.out.println("Wage pay : " + wage);
        }
        scan.close();
    }
}
