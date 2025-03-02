
/*
ID : 6706021612038
Name : Mr. Warayut Bunrattanang
Room : 1RC
File name : Exercises02_04_6706021612038.java
 */
import java.util.Scanner;

public class Exercises02_04_6706021612038 {
    public static void main(String[] args) {
        int number, number_dis, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Program find the sum of 3-digit.");
        System.out.print("Enter integer number : ");
        number = input.nextInt();
        number_dis = number;

        result = number % 10;
        number /= 10;
        result += number % 10;
        number /= 10;
        result += number % 10;

        System.out.print("Summation of digit : " + (number_dis / 100) + " + " + ((number_dis / 10) % 10));
        System.out.println(" + " + (number_dis % 10) + " = " + result);
        input.close();
    }
}
