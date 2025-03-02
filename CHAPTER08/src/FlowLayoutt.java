import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class FlowLayoutt {
    public static void main(String[] args) {
        new InnerFlowLayout("Warayut Window");

    }
}

class InnerFlowLayout {
    JFrame window = new JFrame();
    Container container = window.getContentPane();

    public InnerFlowLayout(String Title){
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(500, 400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        insertComponent();
    }

    private void insertComponent(){
        JRadioButton radioButton1,radioButton2;
        ButtonGroup radioGroup;

        container.setLayout(new FlowLayout());
        container.add(new JLabel("Enter String 1 create by JLabel1."));
        container.add(new JLabel("Enter String 2 create by JLabel2."));
        container.add(new JLabel("Enter String 3 create by JLabel3."));
        // container.add(new JTextField(10));

        radioButton1 = new JRadioButton("male");
        radioButton2 = new JRadioButton("female");
        container.add(radioButton1);
        container.add(radioButton2);

        radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
    }   
    
}
