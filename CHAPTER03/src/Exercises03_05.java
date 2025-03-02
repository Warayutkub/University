/*
ID : 6706021612038
Name : Warayut Bunrattanang
Room : 1 RC
File Name : Exercises03_05.java
 */

import java.util.Scanner;

public class Exercises03_05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        long value = inp.nextLong();
        int odd = 0, even = 0, zero = 0;
        while (value != 0) {
            switch ((int) (value % 10)) {
                case 0 -> zero++;
                case 2, 4, 6, 8 -> even++;
                default -> odd++;
            }
            value /= 10;
        }
        System.out.println("Odd digit  = " + odd);
        System.out.println("Even digit  = " + even);
        System.out.println("Zero digit  = " + zero);
        inp.close();
    }
}
