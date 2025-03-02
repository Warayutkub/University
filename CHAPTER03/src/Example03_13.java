
import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_13 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        int count = 1;
        double total = 0.0, value = 0.00;

        System.out.println(">> Exit input enter -1 <<");
        while (value > -1.0) {
            System.out.print("Enter floating-point number #");
            System.out.print(count + " : ");
            value = inp.nextDouble();
            if (value != -1.0) {
                total += value;
                count++;
            }
        }
        double avg = total/count;
        System.out.println("Total value : " + twoDigit.format(total));
        System.out.println("Average value : " + twoDigit.format(avg));
        inp.close();
    }
}
