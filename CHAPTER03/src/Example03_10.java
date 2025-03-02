import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_10 {
    public static void main(String[] args) {
        final double RATE = 0.045;
        double amount, interest ,principal;
        Scanner inp = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("###,##0.00");

        System.out.println(": Program Caculate Deposit : ");
        //get principal
        System.out.print("Enter principal : ");
        principal = inp.nextDouble();
        //Caculate amount on desposit
        amount = principal;
        for (int year = 1; year <= 5;year++){
            //caculate amount per year
            interest = amount * RATE;
            amount+=interest;
        }
        System.out.print("Principal = ");
        System.out.println(twoDigit.format(principal));
        System.out.println("Interest rate = " + twoDigit.format(RATE*100) + "%");
        System.out.println("Year = 5");
        System.out.print("Amount of deposit = ");
        System.out.println(twoDigit.format(amount));
        inp.close();
    }
}
