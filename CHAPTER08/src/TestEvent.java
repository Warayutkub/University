import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestEvent {
    public static void main(String[] args) {
        new InnerTestEvent("Test Event");
    }
}

class InnerTestEvent {
    private JFrame window = new JFrame();
    private Container container = window.getContentPane();
    
    public InnerTestEvent(String Title){
        window.setTitle(Title);
        window.setSize(250,100);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InsertEvent();
        
        window.setVisible(true);
    }

    private void InsertEvent() {
        container.setLayout(new FlowLayout());
        container.add(new JLabel("Enter number : "));
        JTextField dataInput = new JTextField(10);
        JTextField dataResult = new JTextField(15);
        dataResult.setEditable(false);
        container.add(dataInput);
        container.add(new JLabel("Result is : "));
        container.add(dataResult);
    
        dataInput.addActionListener(event -> {
            long result = 0L;
            long data = Long.parseLong(dataInput.getText());
            for (int i = 0; i <= data; i++) {
            result += i;
            }
            dataResult.setText(Long.toString(result));
            dataInput.setText("");
        });
    }
}
