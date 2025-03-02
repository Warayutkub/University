/*
ID : 6706021612038
Name : Warayut Bunrattanang
Room : 1 RC
File Name : Exercises03_01.java
 */

import java.util.Scanner;

public class Exercises03_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String mess;

        // Logic
        while (true) {
            System.out.print("Enter integer number (4 digits): ");
            int number = inp.nextInt();
            if ((number%10)%2 == 0) {
                mess = "Number " + number + " is Even";
            }else {
                mess = "Number " + number + " is Odd";
            }
            if (0 <= (number / 1000) && (number / 1000) <= 9) {
                for (int count = 1; count <= 4; count++) {
                    if ((number%10)%2 == 0) {
                        System.out.println((number%10) + " is Even");
                        number/=10;
                    } else {
                        System.out.println((number%10) + " is Odd");
                        number/=10;
                    }
                }
                System.out.println(mess);
                break;
            }
            else {
                System.out.println("Error, Please enter 4 digits number");
            }
        }
        inp.close();
    }
}
