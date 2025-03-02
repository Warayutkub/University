import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class WindowsFlowLayout {
    JFrame window = new JFrame("Test GUI #1");
    public WindowsFlowLayout() {
        JTextField textField1, textField2;
        JLabel label1, label2, label3, label4;
        JButton btn1, btn2;
        JRadioButton radioButton1, radioButton2, radioButton3, radioButton4 ;
        ButtonGroup radioGroup;
        
        Container c = window.getContentPane();
        c.setLayout(new FlowLayout());
        label1 = new JLabel("Enter String 1 create by JLabel");
        label2 = new JLabel("Enter String 2 create by JLabel");
        label3 = new JLabel("RadioButton not use ButtonGroup");
        label4 = new JLabel("RadioButton use ButtonGroup ");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        radioButton1 = new JRadioButton("Male", true);
        radioButton2 = new JRadioButton("Female");
        radioButton3 = new JRadioButton("Sport", true);
        radioButton4 = new JRadioButton("Movies");
        radioGroup = new ButtonGroup(); //Help select one choice.
        
        c.add( label1); //เรื่มตรงนี้
        c.add( textField1); //ต่อด้วยตรงนี้
        c.add(label2);
        c.add( textField2);
        c.add(label3);
        c.add(radioButton1);
        c.add(radioButton2);
        c.add(label4);
        c.add(radioButton3);
        c.add(radioButton4);
        radioGroup.add(radioButton3);
        radioGroup.add(radioButton4);
        btn1 = new JButton(" OK ");
        btn2 = new JButton(" Cancle ");
        btn1.setSize(400, 50);
        c.add( btn1 );
        c.add( btn2);
        window.setSize(350, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
