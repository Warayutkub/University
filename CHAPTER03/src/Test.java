/*
ID : 6706021612038
Name : Warayut Bunrattanang
Room : 1 RC
File Name : Exercises03_02.java
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double value;
         int sum = 0, countd = 0;
 
         // Logic
         while (true) {
             System.out.print("Enter floating-point number: ");
             value = input.nextDouble();
 
             if (value - 0.1111 >= 0 && 0.9999 - value >= 0) {
                 while (value % 1 != 0) {
                     value *= 10;
                     countd++;
                 }
                 for (int i = countd, count = 1; i >= 1; i--, count++) {
                     int divisor = 1;
                     for (int j = 1; j < i; j++) {
                         divisor *= 10;
                     }
                     int check = (int) (value / divisor);
                     System.out.println("Integer number " + count + " = " + check);
                     if (check % 2 == 0) {
                         System.out.print("Sum = " + sum);
                         sum += check;
                         System.out.println(" + " + check + " = " + sum);
                     } else {
                         System.out.print("Sum = " + sum);
                         sum -= check;
                         System.out.println(" - " + check + " = " + sum);
                     }
                     value = value - (check*divisor);
                 } 
                 break;
             } else {
                 System.out.println("Number not changed.");
             }
         }
 
         input.close();
     }
}
