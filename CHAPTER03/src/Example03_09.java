
import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_09 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final int PER_LINE = 5;//fixed number for line
        int first, second, sum, count;
        sum = count = 0;
        System.out.print("Enter first number and second number : ");
        first = inp.nextInt();
        second = inp.nextInt();
        for (int num = first; num <= second; num++) {
            sum += num;
            count++;
            if (count % PER_LINE == 0)//check number of value in line
            {
                System.out.println("\t" + num);// \t is make a space for format
            } else {
                System.out.print("\t" + num);
            }
        }
        System.out.println();
        DecimalFormat twoDigit = new DecimalFormat("0.000");//fixd number of decimal place value
        System.out.println("Summation of " + first + " to " + second + " = " + sum);
        float avg = (float) sum / count;
        System.out.println("Average : " + twoDigit.format(avg));

        inp.close();
    }
}
