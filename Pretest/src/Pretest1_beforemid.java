
import java.text.DecimalFormat;
import java.util.Scanner;

public class Pretest1_beforemid {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        DecimalFormat format_digit = new DecimalFormat("0.00");
        String grade1, grade2, grade3, grade4, grade5, grade6;
        double point1, point2, point3, point4, point5, point6;

        System.out.println("Input data.");
        System.out.print("Enter score of subject #1 : ");
        double score1 = inp.nextDouble();
        System.out.print("Enter credit of subject #1 : ");
        int credit1 = inp.nextInt();
        if (score1 >= 80 && score1 <= 100) {
            grade1 = "A";
            point1 = 4 * credit1;
        } else if (score1 >= 70) {
            grade1 = "B";
            point1 = 3 * credit1;
        } else if (score1 >= 60) {
            grade1 = "C";
            point1 = 2 * credit1;
        } else if (score1 >= 50) {
            grade1 = "D";
            point1 = 1 * credit1;
        } else {
            grade1 = "F";
            point1 = 0;
        }
        System.out.print("Enter score of subject #2 : ");
        double score2 = inp.nextDouble();
        System.out.print("Enter credit of subject #2 : ");
        int credit2 = inp.nextInt();
        if (score2 >= 80 && score2 <= 100) {
            grade2 = "A";
            point2 = 4 * credit2;
        } else if (score2 >= 70) {
            grade2 = "B";
            point2 = 3 * credit2;
        } else if (score2 >= 60) {
            grade2 = "C";
            point2 = 2 * credit2;
        } else if (score2 >= 50) {
            grade2 = "D";
            point2 = 1 * credit2;
        } else {
            grade2 = "F";
            point2 = 0;
        }
        System.out.print("Enter score of subject #3 : ");
        double score3 = inp.nextDouble();
        System.out.print("Enter credit of subject #3 : ");
        int credit3 = inp.nextInt();
        if (score3 >= 80 && score3 <= 100) {
            grade3 = "A";
            point3 = 4 * credit3;
        } else if (score3 >= 70) {
            grade3 = "B";
            point3 = 3 * credit3;
        } else if (score3 >= 60) {
            grade3 = "C";
            point3 = 2 * credit3;
        } else if (score3 >= 50) {
            grade3 = "D";
            point3 = 1 * credit3;
        } else {
            grade3 = "F";
            point3 = 0;
        }
        System.out.print("Enter score of subject #4 : ");
        double score4 = inp.nextDouble();
        System.out.print("Enter credit of subject #4 : ");
        int credit4 = inp.nextInt();
        if (score4 >= 80 && score4 <= 100) {
            grade4 = "A";
            point4 = 4 * credit4;
        } else if (score4 >= 70) {
            grade4 = "B";
            point4 = 3 * credit4;
        } else if (score4 >= 60) {
            grade4 = "C";
            point4 = 2 * credit4;
        } else if (score4 >= 50) {
            grade4 = "D";
            point4 = 1 * credit4;
        } else {
            grade4 = "F";
            point4 = 0;
        }
        System.out.print("Enter score of subject #5 : ");
        double score5 = inp.nextDouble();
        System.out.print("Enter credit of subject #5 : ");
        int credit5 = inp.nextInt();
        if (score5 >= 80 && score5 <= 100) {
            grade5 = "A";
            point5 = 4 * credit5;
        } else if (score5 >= 70) {
            grade5 = "B";
            point5 = 3 * credit5;
        } else if (score5 >= 60) {
            grade5 = "C";
            point5 = 2 * credit5;
        } else if (score5 >= 50) {
            grade5 = "D";
            point5 = 1 * credit5;
        } else {
            grade5 = "F";
            point5 = 0;
        }
        System.out.print("Enter score of subject #6 : ");
        double score6 = inp.nextDouble();
        System.out.print("Enter credit of subject #6 : ");
        int credit6 = inp.nextInt();
        if (score6 >= 80 && score6 <= 100) {
            grade6 = "A";
            point6 = 4 * credit6;
        } else if (score6 >= 70) {
            grade6 = "B";
            point6 = 3 * credit6;
        } else if (score6 >= 60) {
            grade6 = "C";
            point6 = 2 * credit6;
        } else if (score6 >= 50) {
            grade6 = "D";
            point6 = 1 * credit6;
        } else {
            grade6 = "F";
            point6 = 0;
        }

        double total_points = point1 + point2 + point3 + point4 + point5 + point6;
        int total_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6;

        System.out.println("\tGrade Data Report\t");
        System.out.println("=======================================");
        System.out.println("| No. |\tScore\t|\tGrade\t|\tCredit\t|\tPoints\t|");
        System.out.println("=======================================");
        System.out.println("| 1   |\t" + score1 + "\t|\t" + grade1 + "\t|\t" + credit1 + "\t|\t" + point1 + "\t|");
        System.out.println("| 2   |\t" + score2 + "\t|\t" + grade2 + "\t|\t" + credit2 + "\t|\t" + point2 + "\t|");
        System.out.println("| 3   |\t" + score3 + "\t|\t" + grade3 + "\t|\t" + credit3 + "\t|\t" + point3 + "\t|");
        System.out.println("| 4   |\t" + score4 + "\t|\t" + grade4 + "\t|\t" + credit4 + "\t|\t" + point4 + "\t|");
        System.out.println("| 5   |\t" + score5 + "\t|\t" + grade5 + "\t|\t" + credit5 + "\t|\t" + point5 + "\t|");
        System.out.println("| 6   |\t" + score6 + "\t|\t" + grade6 + "\t|\t" + credit6 + "\t|\t" + point6 + "\t|");
        System.out.println("=======================================");
        System.out.println("|\tTotal\t\t|" + (double) total_credit + " | " + total_points + " | ");
        System.out.println("=======================================");
        System.out.println("Grade Point Average (GPA) : " + format_digit.format((total_points / total_credit)));
        inp.close();
    }
}
