import javax.swing.JOptionPane;

public class Example04_10 {
    public static void main(String[] args) {
        String inputStr, messInput, messOutput;
        boolean done, first;
        int num, min, max;
        num = min = max = -1;
        done = first = true;
        messOutput = "Number input : ";
        for (int n = 1; n < 6; n++) {
            messInput = "Enter integer number #" + n + " :";
            inputStr = JOptionPane.showInputDialog(messInput);
            if (inputStr != null && !inputStr.isEmpty()) {
                if (inputStr.equals("-1"))
                    done = false;
                else {
                    messOutput += " " + inputStr;
                    num = Integer.parseInt(inputStr);
                    if (first) {
                        min = max = num;
                        first = false;
                    } else {
                        min = Math.min(min, num);
                        max = Math.max(max, num);
                    }
                }
            }
        }
        if (min != -1) {
            messOutput += "\nMinimum value = " + min + "\n";
            messOutput += "Maximum value = " + max + "\n";
        }
        JOptionPane.showMessageDialog(null, messOutput,
                "Message", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}