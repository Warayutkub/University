import javax.swing.JOptionPane;

public class Example04_09 {
    public static void main(String[] args) {
        String inputStr;
        inputStr = JOptionPane.showInputDialog("Enter string :");
        if (inputStr != null) {
            if (!inputStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "User enter " + inputStr,
                        "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Object is empty string",
                        "Message", JOptionPane.WARNING_MESSAGE);
            }
        } else { // is null
            JOptionPane.showMessageDialog(null, "No creste object string",
                    "Message", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}