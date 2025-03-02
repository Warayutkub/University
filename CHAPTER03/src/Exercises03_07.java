/*
ID : 6706021612038
Name : Warayut Bunrattanang
Room : 1 RC
File Name : Exercises03_07.java
 */


import java.util.Scanner;

public class Exercises03_07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int value = inp.nextInt();
        boolean result = true;

        if (value == 1) {
            result = false;
        } else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("Number " + value + " is prime number");
        }else{
            System.out.println("Number " + value + " is not prime number");
        }
        inp.close();
    }

}
