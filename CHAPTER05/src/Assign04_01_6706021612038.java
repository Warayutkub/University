//Name : Warayut Bunrattanang.
//ID : 6706021602038
//Sec : 1-RC
//File name : Assign04_01_6706021612038.java

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Assign04_01_6706021612038 {

    public void mainProgram() {
        String grade, score;
        double point, totalCredit = 0.0, totalPoint = 0.0, credit = 3, scoreCheck, level = 0.0;
        JTextArea out = new JTextArea();
        DecimalFormat format = new DecimalFormat("###,##0.00");

        String messOut = "\t\t\t Grade Data Report. \t\t\n" +
                "\t===============================================================\t\n" +
                "\tNo.\tScore\tGrade\tLevel\tCredit\tPoint\t\n" +
                "\t===============================================================\t\n";

        score = JOptionPane.showInputDialog("Enter Score : \n(Example : Score1 Score2 Score3 ...)").trim();
        System.out.println(score);

        if (!score.isEmpty() && !score.isBlank()) {
            for (int i = 1; i <= 6; i++) {
                int index = score.indexOf(" ");  // tr te ta
                if (index >= 0) {
                    scoreCheck = Double.parseDouble(score.substring(0, index));
                } else {
                    scoreCheck = Double.parseDouble(score);
                }
                grade = checkGrade(scoreCheck);
                point = checkPoint(grade, credit);
                level = checkLevel(grade);
                totalCredit += credit;
                totalPoint += point;
                messOut += "\t" + i + "\t" + scoreCheck + "\t" + grade + "\t" + level + "\t" +
                        credit + "\t" + point + "\t\n";
                score = score.substring(index + 1);

            }
            messOut += "\t===============================================================\t\n" +
                    "\tTotal Point : " + totalPoint + "\n\tTotal credit : " + totalCredit + "\t\n" +
                    "\tGrade Point Average(GPA) : " + format.format((totalPoint / totalCredit));
            out.setText(messOut);
            JOptionPane.showMessageDialog(null, out,"Transcription.",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, " Empty String.", "Alert!", JOptionPane.WARNING_MESSAGE);
        }
        System.exit(0);
    }

    public static String checkGrade(double score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 75) {
            return "B+";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 65) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 55) {
            return "D+";
        } else if (score >= 50) {
            return "D";
        } else if (score >= 0) {
            return "F";
        } else
            return null;
    }

    public static double checkPoint(String grade, double credit) {
        return switch (grade) {
            case "A" -> (4 * credit);
            case "B+" -> (3.5 * credit);
            case "B" -> (3 * credit);
            case "C+" -> (2.5 * credit);
            case "C" -> (2 * credit);
            case "D+" -> (1.5 * credit);
            case "D" -> (1 * credit);
            case "F" -> (0 * credit);
            default -> 0.0;
        };
    }

    public static double checkLevel(String grade) {
        return switch (grade) {
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D+" -> 1.5;
            case "D" -> 1.0;
            case "F" -> 0.0;
            default -> 0.0;
        };
    }

    public static void main(String[] args) {
        Assign04_01_6706021612038 letGo = new Assign04_01_6706021612038();
        letGo.mainProgram();
    }
}