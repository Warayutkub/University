import javax.swing.JOptionPane;

public class Example04_11 {
    public int main () { return 0;}
    public static void main(String[] args) {
        String choiceStr, strMenu;
        boolean done = true;
        //int _main, $main, Main, main;
        strMenu = ">>  Main Menu  <<\n 1. Random Integer Number(1 - 1000)\n";
        strMenu += " 2. Check Prime Number\n 3. Convert Number Decimal to Binary\n";
        strMenu += " 4. Exit\nEnter choice : ";
        do {
            choiceStr = JOptionPane.showInputDialog(strMenu);
            if (choiceStr != null && choiceStr.length() > 0) {
                if (choiceStr.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Select choice 1",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                } else if (choiceStr.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Select choice 2",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                } else if (choiceStr.equals("3")) {
                    JOptionPane.showMessageDialog(null, "Select choice 3",
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                } else if (choiceStr.equals("4")) {
                    done = false;
                } else {
                    JOptionPane.showMessageDialog(null, "No this choice",
                            "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (done);
        JOptionPane.showMessageDialog(null, "Exit Program!",
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}