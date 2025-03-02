import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WaraGrid {
    public static void main(String[] args) {
        new CreateGui("Grid layot");
    }
}

class CreateGui{
    private JFrame window = new JFrame();
    Container container = window.getContentPane();

    public CreateGui(String Title){
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(500,400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        insertComponent();
    }

    private void insertComponent(){
        container.setLayout(new GridLayout(5,2,0,0));
        for (int i = 1;i <= 10;i++){
            String text = "Grid " + i;
            container.add(new JLabel(text));
        }
    }
}