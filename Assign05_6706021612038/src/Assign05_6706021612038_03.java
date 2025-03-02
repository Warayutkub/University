//ID : 6706021612038
//Name : Mr. Warayut Bunrattanang
//Room : 1RC
//File Name : Assign05_6706021612038_03.java

import java.util.Random;
import java.util.Scanner;

public class Assign05_6706021612038_03 {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    void gradeReport() {
        int number;
        do {
            System.out.print("Enter the number of students to simulate (0 to exit, max 20) : ");
            number = input.nextInt();
            int[] midterms =new  int[number], Finals = new int[number], homeWorks = new int[number],total_scores = new int[number];
            String[] grades = new String[number];
            if (number != 0){
                if (number > 20){
                    number = 20;
                }
                for (int i = 0; i < number; i++) {
                    midterms[i] = random.nextInt(40);
                    Finals[i] = random.nextInt(40);
                    homeWorks[i] = random.nextInt(20);
                    total_scores[i] = midterms[i] + Finals[i] + homeWorks[i]; 
                    grades[i] = getGrade(total_scores[i]);
                }
                buildOutPut(midterms, Finals, homeWorks, total_scores, number,grades);
            }else{
                System.exit(0);
            }

        } while (true);
    }

    String getGrade(int score) {
        String grades[][] = { { "A", "80" }, { "B+", "75" }, { "B", "70" }, { "C+", "65" }, { "C", "60" },
                { "D+", "55" }, { "D", "50" }, { "F", "0" } };
        for (int i = 0; i < grades.length; i++) {
            if (score >= (Integer.parseInt(grades[i][1]))) {
                return grades[i][0];
            }
        }
        return null;
    }

    void buildOutPut(int[] midterm,int[] Final, int[] homeWork,int[] total_score,int number,String[] grade){
        int formatTable_base = 10;
        String line = "+" + "-".repeat(formatTable_base-1) + "+" + "-".repeat(formatTable_base+3) + "+" + "-".repeat(formatTable_base+1)+
        "+" + "-".repeat(formatTable_base+4) + "+" + "-".repeat(formatTable_base+1) + "+" + "-".repeat(formatTable_base-2) +"+";
        String head = "| Student | Midterm(40) | Final(40) | Homework(20) | Total(100) | Garde |";
        System.out.println(line);
        System.out.println(head);
        System.out.println(line);
        for (int H = 0;H < number;H++){
            System.out.printf("| %7d | %11d | %9d | %12d | %9d | %6s |\n",H+1,midterm[H],Final[H],homeWork[H],total_score[H],grade[H]);
        }
        
        System.out.println(line);
        System.out.println();
    };

    public static void main(String[] args) {
        new Assign05_6706021612038_03().gradeReport();
    }
}
