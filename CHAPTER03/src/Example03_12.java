
import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_12 {

    public static void main(String[] args) {
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of data : ");
        int count, Maxnum = inp.nextInt();
        double value, total = 0;
        for (count = 1; count <= Maxnum; count++) {
            System.out.print("Enter floating- point number #");
            System.out.print(count + " : ");
            value = inp.nextDouble();
            total += value;
        }
        double avg = total / Maxnum;
        System.out.println("Total value : " + twoDigit.format(total));
        System.out.println("Average value : " + twoDigit.format(avg));
        inp.close();
    }
}
