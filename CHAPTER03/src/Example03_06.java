
import java.util.Scanner;

public class Example03_06 {

    public static void main(String[] args) {
        int score;
        String grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Program Calculator.");
        System.out.print("Enter score : ");
        score = input.nextInt();
        grade = switch (score / 10) {
            case 10, 9, 8 ->
                "A";
            case 7 ->
                "B";
            case 6 ->
                "C";
            case 5 ->
                "D";
            default ->
                "F";
        };
        System.out.println("Student get grade : " + grade);
        input.close();
    }
}
