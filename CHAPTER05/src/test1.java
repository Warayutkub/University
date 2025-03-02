import java.text.DecimalFormat;
import java.util.Scanner;

public class test1 {
    public  void start() {
        Scanner scanner = new Scanner(System.in);
        double month, year;
        DecimalFormat digits = new DecimalFormat("#,###.00");
        boolean done = true;
        System.out.println(">>>> Program Calculate Tax <<<<\n" + "===================================");

        while (done) {
            System.out.print("Enter monthly salary (0-exit) : ");
            month = scanner.nextInt();
                year = month * 12;
                double tax_paid = Cal_taxes(year);
                String output;
                if (month == 0){
                    System.out.println("Exit program");
                    done = false;
                }
                else {
                    output = "Annual Income : " + digits.format(year) + "\nTaxes to be paid : " + digits.format(tax_paid);
                    System.out.println(output);
                    System.err.println();
                }
        }
        scanner.close();
    }

    public static double Cal_taxes(double year) {
        double minus, left = 0;
        if (year >= 1000001) {
            minus = 1000000;
            left = 7500 + 20000 + 37500 + 50000 + (year - minus) * 0.25;
        } else if (year >= 750001 && year <= 1000000) {
            minus = 750000;
            left = 7500 + 20000 + 37500 + (year - minus) * 0.20;
        } else if (year >= 500001 && year <= 750000) {
            minus = 500000;
            left = 7500 + 20000 + ((year - minus) * 0.15);
        } else if (year >= 300001 && year <= 500000) {
            minus = 300000;
            left = 7500 + ((year - minus) * 0.1);
        } else if (year >= 150001 && year <= 300000) {
            minus = 150000;
            left =   ((year - minus) * 0.05);
        } else if (year <= 150000) {
            minus = 0;
            left = 0;
        }
        left = Math.round(left * 100.0) / 100.0;
        return left;
    }

    public static void main(String[] args) {
    test1 obj = new test1();
        obj.start();
    }           
}


    

