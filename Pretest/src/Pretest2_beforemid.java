
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pretest2_beforemid {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,##0.00");
        double salary, income, tax = 0.0, income2;
        boolean done = true;

        do {
            salary = Double.parseDouble(JOptionPane.showInputDialog("Enter monthly salary(0 : quit) : "));
            if (salary != 0) {
                income = salary * 12.0;
                income2 = income;
                if (income > 1000000) {
                    tax += (income - 1000000) * 0.25;
                    income = 1000000;
                }
                if (income > 750000) {
                    tax += (income - 750000) * 0.2;
                    income = 750000;
                }
                if (income > 500000) {
                    tax += (income - 500000) * 0.15;
                    income = 500000;
                }
                if (income > 300000) {
                    tax += (income - 300000) * 0.1;
                    income = 300000;
                }
                if (income > 150000) {
                    tax += (income - 150000) * 0.05;
                    income = 150000;
                }

                String messOut = "Annual Income : " + format.format(income2) + "\nTax to be paid : " + format.format(tax);
                JOptionPane.showMessageDialog(null, messOut);

                tax = 0.0;
            } else if (salary == 0) {
                JOptionPane.showMessageDialog(null, "Exit Program.");
                done = false;
            }

        } while (done);
        inp.close();
    }

}
