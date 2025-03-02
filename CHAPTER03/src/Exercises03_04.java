/*
ID : 6706021612038
Name : Warayut Bunrattanang
Room : 1 RC
File Name : Exercises03_04.java
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercises03_04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat Format_digit = new DecimalFormat("###,##0.00");
        double principle;
        double rate,interest;
        int year,count = 1;

        System.out.println("Program Calculate Money");
        System.out.println("++++++++++++++++++++++++");
        System.out.print("Enter principle : ");
        principle = inp.nextDouble();
        System.out.print("Enter interest rate : ");
        rate = inp.nextDouble();
        rate/=100;
        System.out.print("Enter year : ");
        year = inp.nextInt();

        System.out.println("Year\tPrinciple\tInterest\tTotal");
        System.out.println("====================================================");
        while (count<=year) {
            interest = principle * rate;
            System.out.print("  "+count+"\t");
            System.out.print(Format_digit.format(principle)+"\t"); 
            System.out.print(Format_digit.format(interest) +"\t");
            principle+=interest;
            System.out.println(Format_digit.format(principle));
            count++;
        }
        inp.close();
    }
}
