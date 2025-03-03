import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MycalculatorBETA01 implements ActionListener {
    private JFrame window = new JFrame("Calculator");
    private Container container = window.getContentPane();
    private JPanel displayPanel = new JPanel(), btnPanel = new JPanel();
    private JTextField displayField = new JTextField(10),
            displayField0 = new JTextField(10);
    protected Font font = new Font("Roboto", Font.BOLD, 16);
    private JButton[] btnAll;
    private String operator[] = { "+", "-", "×", "÷" };
    private int count = 0;

    public MycalculatorBETA01() {
        // Window Setting
        CreateGui();
        window.setSize(400, 610);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void CreateGui() {
        container.setLayout(new FlowLayout(0, 3, 10));

        // Display
        displayField0.setEditable(false);
        displayField0.setHorizontalAlignment(JTextField.RIGHT);
        displayField0.setFont(font);
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(font);

        displayPanel.setLayout(new GridLayout(2, 1));
        displayPanel.setPreferredSize(new Dimension(380, 100));
        displayPanel.setBorder(new LineBorder(Color.black));
        displayPanel.add(displayField0);
        displayPanel.add(displayField);

        // Button
        InsertBtn();
        btnPanel.setLayout(new GridLayout(5, 4, 5, 5));
        btnPanel.setPreferredSize(new Dimension(380, 450));

        container.add(displayPanel);
        container.add(btnPanel);
    }

    private void InsertBtn() {
        String[] textBtn = { "C", "", "", "", "7", "8", "9", "÷", "4", "5", "6", "×", "1", "2", "3", "-", "0", ".", "=",
                "+" };
        btnAll = new JButton[textBtn.length];
        for (int H = 0; H < textBtn.length; H++) {
            btnAll[H] = new JButton(textBtn[H]);
            btnAll[H].setFont(font);
            btnAll[H].addActionListener(this);
            btnPanel.add(btnAll[H]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        SetField();
        String storeText = displayField.getText();
        String command = ((JButton) event.getSource()).getText();
        switch (command) {
            case "7", "8", "9", "4", "5", "6", "1", "2", "3" -> setNormalBtn(storeText, command);
            case "0" -> setZeroBtn(storeText);
            case "+", "-", "×", "÷" -> setOperator(storeText, command);
            case "." -> setPointBtn(storeText);
            case "=" -> setEqual(storeText);
            case "C" -> Clear();
        }
    }

    // Calculate zone
    protected void Summation(String data[]) {
        double number1 = Double.parseDouble(data[0]);
        double number2 = Double.parseDouble(data[2]);
        String result = String.valueOf(number1 + number2);
        int indexPoint = result.indexOf(".");
        if (result.substring(indexPoint + 1).equals("0")) {
            displayField.setText(result.substring(0, indexPoint));
        } else
            displayField.setText(result);
    }

    protected void Minus(String data[]) {
        double number1 = Double.parseDouble(data[0]);
        double number2 = Double.parseDouble(data[2]);
        String result = String.valueOf(number1 - number2);
        int indexPoint = result.indexOf(".");
        if (result.substring(indexPoint + 1).equals("0")) {
            displayField.setText(result.substring(0, indexPoint));
        } else
            displayField.setText(result);
    }

    protected void Multiply(String data[]) {
        double number1 = Double.parseDouble(data[0]);
        double number2 = Double.parseDouble(data[2]);
        String result = String.valueOf(number1 * number2);
        int indexPoint = result.indexOf(".");
        if (result.substring(indexPoint + 1).equals("0")) {
            displayField.setText(result.substring(0, indexPoint));
        } else
            displayField.setText(result);
    }

    protected void Divide(String data[]) {
        double number1 = Double.parseDouble(data[0]);
        double number2 = Double.parseDouble(data[2]);
        displayField.setText(String.valueOf((float) number1 / number2));
    }

    // Set special Zone
    protected void setNormalBtn(String storeText, String command) {
        displayField.setText(storeText + command);
    }

    protected void setOperator(String storeText, String command) {
        int indexOperator = FindIndexOperator(storeText);
        if (indexOperator == 0 && !storeText.equals("")) {
            displayField.setText(storeText + command);
        }
    }

    protected void setEqual(String storeText) {
        
        count++;
        String extractString[] = ExtractString(storeText);
        if (extractString[2] == null) {
            displayField0.setText(storeText);
            displayField.setText(CutOperatorEqual(extractString[0]));
        } else
            displayField0.setText(storeText);
        if (extractString[0] != null && extractString[1] != null && extractString[2] != null) {
            switch (extractString[1]) {
                case "+" -> Summation(extractString);
                case "-" -> Minus(extractString);
                case "×" -> Multiply(extractString);
                case "÷" -> Divide(extractString);
            }
        } else if (extractString[1] == null)
            displayField.setText(CutOperatorEqual(extractString[0]));
    }

    private void setZeroBtn(String storeText) {
        String extractString[] = ExtractString(storeText);
        String dataSend = "";
        if (extractString[1] == null && storeText.isEmpty()) {
            if (extractString[0] == null || String.valueOf(extractString[0]).equals("0")
                    || String.valueOf(extractString[0]).equals(""))
                extractString[0] = "0";
        }
        if (!extractString[0].equals("0") && extractString[1] == null)
            dataSend += extractString[0] + "0";
        if (extractString[1] != null && extractString[2] == null)
            dataSend += extractString[0] + extractString[1];
        if (extractString[2] != null)
        dataSend += String.join("", extractString[0], extractString[1], extractString[2], "0");
        displayField.setText(dataSend);
        System.out.println("Test");
    }

    private void setPointBtn(String storeText) {
        String[] extractString = ExtractString(storeText);
        String dataSend = "";
        
        if (extractString[0] != null && !extractString[0].isEmpty()) {
            if (extractString[0].indexOf(".") == (-1) && extractString[1] == null) {
                dataSend+=extractString[0] + (".");
            } else {
                dataSend+=extractString[0];
            }
        }
        
        if (extractString.length > 1 && extractString[1] != null && !extractString[1].isEmpty()) {
            dataSend+=extractString[1];
            if (extractString.length > 2 && extractString[2] != null && !extractString[2].isEmpty()) {
                if (extractString[2].indexOf(".") == -1) {
                    dataSend+=extractString[2]+".";
                } else {
                    dataSend+=extractString[2];
                }
            } else {
                dataSend+=".";
            }
        }
        
        displayField.setText(dataSend.toString());
    }

    // Tools
    protected void Clear() {
        displayField0.setText("");
        displayField.setText("");
    }

    private String[] ExtractString(String storeText) {
        String result[] = new String[3];
        int index = FindIndexOperator(storeText);
        if (index != 0) {
            result[0] = storeText.substring(0, index);
            result[1] = storeText.substring(index, index + 1);
            result[2] = storeText.substring(index + 1);
        } else {
            result[0] = storeText;
        }
        return result;
    }

    private int FindIndexOperator(String storeText) {
        for (String H : operator) {
            int index = storeText.indexOf(H);
            if (index != -1) {
                return index;
            }
        }
        return 0;
    }

    private void SetField() {
        if (count == 1)
            Clear();
        count = 0;
    }

    private String CutOperatorEqual(String Text) {
        int indexOperator = FindIndexOperator(Text);
        if (!(Text + "").equals("") && !(Text + "").equals("null")) {
            if (Text.substring(indexOperator+1).equals("+"))
                return Text.substring(0,indexOperator);
                else if (Text.substring(indexOperator+1).equals("-"))
                return Text.substring(0,indexOperator);
                else if (Text.substring(indexOperator+1).equals("×"))
                return "0";
            else if (Text.substring(indexOperator+1).equals("÷"))
                return "0";
            else
                return "";
        } else
            return Text;
    }
}