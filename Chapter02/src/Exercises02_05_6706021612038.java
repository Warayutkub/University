
/*
ID : 6706021612038
Name : Mr. Warayut Bunrattanang
Room : 1RC
File name : Exercises02_05_6706021612038.java
 */
import java.util.Scanner;

public class Exercises02_05_6706021612038 {
    public static void main(String[] args) {
        float number;
        Scanner input = new Scanner((System.in));
        System.out.println("Program display the decimal place.");
        System.out.print("Enter floating number : ");
        number = input.nextFloat();
        System.out.println("Decimal number #1 : " + (int) (number * 10));
        System.out.println("Decimal number #2 : " + ((int) (number * 100)) % 10);
        System.out.println("Decimal number #3 : " + ((int) (number * 1000)) % 10);
        input.close();
    }
}
