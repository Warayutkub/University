//ID : 6706021612038
//Name : Mr. Warayut Bunrattanang
//Room : 1RC
//File Name : Assign05_6706021612038_01.java

import javax.swing.JOptionPane;

public class Assign05_6706021612038_01 {

    void mainMenu() {
        long number = 0;
        String choice = "";
        String text = "::      Main menu      ::\n==============================\n" +
                "A. Get Integer Number\nB. Summation of Digit\nC. Print Reverse Number\nD. Count Number\nE. Exit\nEnter choice :";
        do {
            choice = JOptionPane.showInputDialog(text).toLowerCase();
            switch (choice) {
                case "a": number = getNumber(); break;
                case "b": sumDigit(number); break;
                case "c": printReverse(number); break;
                case "d": countDigit(number); break;
                case "e": 
                    JOptionPane.showMessageDialog(null, "Now, Exit Program...");
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog(null, "No this choice, please input again."); break;
            }
        } while (true);
    }

    long getNumber() {
        return Long.parseLong(JOptionPane.showInputDialog("Enter number : "));
    }

    void sumDigit(long number) {
        int result = 0;
        String copString = number + "";

        for (int H = 0; H < String.valueOf(number).length(); H++) {
            result += Integer.parseInt(copString.substring(0, 1));
            copString = copString.substring(1);
        }

        String text = "Your enter number : " + number + "\nSummation of digit : " + result;
        JOptionPane.showMessageDialog(null, text);
    }

    void printReverse(long number) {
        String result = "";
        int count = (number + "").length();
        for (int H = count; H > 0; H--) {
            result += String.valueOf(number).charAt(H - 1);
        }
        String text = "Your enter number : " + number + "\nReverse number : " + result;
        JOptionPane.showMessageDialog(null, text);
    }

    void countDigit(long number) {
        String text = "Your enter number : " + number + "\nThis number has " + String.valueOf(number).length()
                + " digits";
        JOptionPane.showMessageDialog(null, text);
    }


    public static void main(String[] args) throws Exception {
        Assign05_6706021612038_01 obj = new Assign05_6706021612038_01();
        obj.mainMenu();
    }
}
