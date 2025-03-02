import javax.swing.JOptionPane;

public class Example04_08 {
    public static void main(String[] args) {
        String firstStr, secondStr;
        int num1, num2, sum;
        firstStr = JOptionPane.showInputDialog("Enter first integer :");
        secondStr = JOptionPane.showInputDialog("Enter second integer :");
        num1 = Integer.parseInt(firstStr);
        num2 = Integer.parseInt(secondStr);
        sum = num1 + num2;
        String output = "The sum of " + num1 + " + " + num2 + " is " + sum;
        JOptionPane.showMessageDialog(null, output, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
