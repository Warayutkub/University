/*
ID : 6706021612038
Name : Warayut Bunrattanang
Room : 1 RC
File Name : Exercises03_03.java
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercises03_03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat formatDecimal = new DecimalFormat("0.00");
        String Text_rate= "";
        double rate = 0.0;

        System.out.print("Enter sale amount : ");
        int sold = inp.nextInt();
        if (sold <= 10000) {
            Text_rate = "0%";
            rate = 0.0;
        } else if (sold <= 20000) {
            Text_rate = "1.5%";
            rate = 1.50 / 100;
        } else if (sold <= 40000) {
            Text_rate = "2.75%";
            rate = 2.75 / 100;
        } else if (sold <= 60000) {
            Text_rate = "5%";
            rate = 5.00 / 100;
        } else if (sold <= 80000) {
            Text_rate = "7%";
            rate = 7.00 / 100; 
        } else if (sold <= 100000) {
            Text_rate = "9%";
            rate = 9.00 / 100; 
        } else {
            Text_rate = "10%";
            rate = 10.00 / 100;
        }

        double commission = sold * rate;
        System.out.println("You got rate = " + Text_rate);
        System.out.print("You sale = " + sold);
        System.out.println(", Commission = " + formatDecimal.format(commission));
         inp.close();
    }   
}
