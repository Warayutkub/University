//Name : Warayut Bunrattanang.
//ID : 6706021602038
//Sec : 1-RC
//File name : Assign04_02_6706021612038.java

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assign04_02_6706021612038 {

    public void LetGo() {
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,##0.00");
        double salary = 0.0, Income;
        boolean done = true;

        System.out.println(">>>>\tProgram Calculate Tax\t<<<<");
        System.out.println("=======================================");
        do {
            System.out.print("Enter monthly salary (0 : exit) : ");
            salary = input.nextDouble();
            if (salary != 0.0) {
                Income = salary * 12.0;
                System.out.println("Annual Income : " + format.format(Income));
                System.out.println("Tax to be paid : " + format.format(CalTax(Income)));
                System.out.println();
            } else {
                System.out.println("Exit Program.");
                done = false;
            }
        } while (done);
        input.close();
    }

    public static double CalTax(double Income) {
        double Tax = 0.0;
        if (Income > 1000000) {
            Tax += (Income - 1000000) * 0.25;
            Income = 1000000;
        }
        if (Income > 750000) {
            Tax += (Income - 750000) * 0.2;
            Income = 750000;
        }
        if (Income > 500000) {
            Tax += (Income - 500000) * 0.15;
            Income = 500000;
        }
        if (Income > 300000) {
            Tax += (Income - 300000) * 0.1;
            Income = 300000;
        }
        if (Income > 150000) {
            Tax += (Income - 150000) * 0.05;
            Income = 150000;
        }
        if (Income >= 0) {
            Tax += 0.0;

        }
        return Tax;
    }

    public static void main(String[] args) {
        Assign04_02_6706021612038 main = new Assign04_02_6706021612038();
        main.LetGo();
    }
}
