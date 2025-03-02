import java.text.DecimalFormat;
import java.util.Scanner;

public class Programming02_01 {
    public static void main(String[] args) {
        Programming02_01 obj = new Programming02_01();
        obj.start();
    }

    public  void start() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,##0.00");

        int salary = 0;
        double Income = 0.0, Tax = 0.0;


        do {
            System.out.print("Enter monthly  salary (0-exit) : ");
            salary = scanner.nextInt();
            Income = salary * 12;
            if (salary != 0) {
                System.out.println("Annual Income : " + format.format(Income));
                if (Income > 1000000) {
                    Tax += (Income - 1000000) * 0.25;
                    Income = 1000000;
                }
                if (Income >= 750001) {
                    Tax += (Income - 750000) * 0.20;
                    Income = 750000;
                }
                if (Income >= 500001) {
                    Tax += (Income - 500000) * 0.15;
                    Income = 500000;
                }
                if (Income >= 300001) {
                    Tax += (Income - 300000) * 0.10;
                    Income = 300000;
                }
                if (Income >= 150001) {
                    Tax += (Income - 150000) * 0.05;
                    Income = 150000;
                }
                if (Income <= 150000) {
                    Tax += 0;
                }
            }
            else if (salary == 0){
                System.out.println("Exit Program.");
                break;
            }
            System.out.println("Tax to be paid : " + format.format(Tax));
            Tax = 0.0 ;
        } while (true);
    }
}
