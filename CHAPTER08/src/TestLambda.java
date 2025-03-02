import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestLambda {
    private JFrame Window = new JFrame("Lambda Test.");
    private Container container = Window.getContentPane();
    private JTextField TxtData_Input = new JTextField(10),Data_Output = new JTextField(10);
    
    public TestLambda(){
        insertCom();
        Window.setSize(300,150);
        Window.setLocationRelativeTo(null);
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void insertCom(){
        container.setLayout(new FlowLayout());
        container.add(new JLabel("Enter Number Of Loop : "));
        container.add(TxtData_Input);
        container.add(new JLabel("Result is "));
        container.add(Data_Output);
        Data_Output.setEditable(false);
        
        //Action
        TxtData_Input.addActionListener(event -> {
            int loop = Integer.parseInt(TxtData_Input.getText());
            int result = Summation(loop);
            Data_Output.setText(String.valueOf(result));
            TxtData_Input.setText("");
        });
    }

    private int Summation(int loop){
        int result = 0;
        for (int H = 0;H <= loop;H++){
            result += H;
        }
        return result;
    }

}
