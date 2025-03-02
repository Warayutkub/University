package BIG;

import java.util.Scanner;

public class Programming01 {
    public static void main(String[] args) {
        Programming01 score = new Programming01();
        score.student();
        scanner.close();
    }

    public void start() {

    }

    public void student() {
        System.out.println("+----------------------------------+");
        System.out.println("|   Program Calculate Grade        |");
        String score = "", credit = "";
        String List_grade = "", List_point = "", list_score = "", list_credit = "";
        double level, total_credit = 0.0, total_point = 0.0;
        double level, point, total_credit = 0.0, total_point = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Data : ");

        for (int n = 1; n <= 6; n++) {
            System.out.print("Enter score of subject #" + n + " : ");
            score = scanner.next() + " ";
            list_score += score;

            System.out.print("Enter credit of subject #" + n + " : ");
            credit = scanner.next() + " ";
            list_credit += credit + " ";

            List_grade += Grade(score) + " ";
            level = level(Grade(score));
            List_point += Point(level, credit) + " ";

            total_point += Point(level, credit);
            total_credit += Double.parseDouble(credit);

        }

        System.out.println("\t\t Grade Data Report \t\t");
        System.out.println("=================================");
        System.out.println("|No.| Score |Grade|Credit| Point|");
        for (int n = 1; n <= 6; n++) {
            int A = list_credit.indexOf(" ");
            int B = List_grade.indexOf(" ");
            int C = List_point.indexOf(" ");
            int D = list_score.indexOf(" ");

            String dis_credit = list_credit.substring(0, A);
            String dis_grade = List_grade.substring(0, B);
            String dis_point = List_point.substring(0, C);
            String dis_score = list_score.substring(0, D);

            list_credit = list_credit.substring(A + 2);
            List_grade = List_grade.substring(B + 1);
            List_point = List_point.substring(C + 1);
            list_score = list_score.substring(D + 1);

            System.out.println(String.format("| %d | %s  | %s   |    %s | %s    |", n, dis_score, dis_grade, dis_credit,
                    dis_point));
        }

    }

    public static String Grade(String score) {
        double B;

        B = Double.parseDouble(score);

        if (B >= 80) {
            return "A";
        } else if (B >= 70) {
            return "B";
        } else if (B >= 60) {
            return "C";
        } else if (B >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static Double level(String Grade) {
        if (Grade == "A") {
            return 4.0;
        } else if (Grade == "B") {
            return 3.0;
        } else if (Grade == "C") {
            return 2.0;
        } else if (Grade == "D") {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static Double Point(Double level, String credit) {
        double B;

        B = Double.parseDouble(credit);

        return level * B;

    }

}
