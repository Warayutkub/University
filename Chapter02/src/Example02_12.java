
import java.util.Scanner;

public class Example02_12 {
    public static void main(String[] args) {
        int hour;
        double wage,wage_rate;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter hour : ");
        hour = Scan.nextInt();
        System.out.println("Enter wage rate : ");
        wage_rate = Scan.nextDouble();
        wage = (hour <= 40)? (hour * wage_rate) : (wage_rate*((40) + ((hour - 40) * 1.5)));
        System.out.println(wage);
        Scan.close();
    }
}
