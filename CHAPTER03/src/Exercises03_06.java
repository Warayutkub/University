/*
ID : 6706021612038
Name : Warayut Bunrattanang
Room : 1 RC
File Name : Exercises03_06.java
 */

import java.util.Scanner;

public class Exercises03_06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input number line : ");
        int line = inp.nextInt();
        System.out.print("Input character : ");
        String variable = inp.next();
        System.out.print("Input type : ");
        int type = inp.nextInt();
        System.out.println();

        switch (type) {
            case 1 -> {
                for (int i = 1; i <= line; i++) {
                    for (int f = 1; f <= i;f++){
                        System.out.print(variable);
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                for (int i = 1; line >= i; line--) {
                    for (int f = 1; f <= line;f++){
                        System.out.print(variable);
                    }
                    System.out.println();
                }
            }
            default -> System.out.println("Invalid type.");
        }
        inp.close();
    }
}
