import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutt {

    public static void main(String[] args) {
        new InnerBorderLayout("Warayut Border layout");
    }
}
class InnerBorderLayout {
    private JFrame window = new JFrame();
    Container container = window.getContentPane(),container2 = window.getContentPane();
    
    public InnerBorderLayout(String Title){
        window.setTitle(Title);;
        window.setVisible(true);
        window.setSize(500,400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setComponent();
    }

    private void setComponent(){
        container.setLayout(new BorderLayout(0,0));
        container.add(new JLabel("Warayut Layout"),BorderLayout.EAST);
    }
    
}