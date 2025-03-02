import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MyPanel {
    JFrame window;
    JPanel panel1, panel2,SubtwoPanel;
    Container c;
    public MyPanel() {
        window = new JFrame("Test JPanel");
        c = window.getContentPane();
        c.setLayout(new FlowLayout());
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(350,120));
        panel1.setLayout(new FlowLayout());
        panel1.setBorder(new LineBorder(Color.RED, 3));
        panel1.add( new JLabel("This is JPanel 1"));

        SubtwoPanel = new JPanel();
        SubtwoPanel.setLayout(new FlowLayout());
        SubtwoPanel.setBorder(new LineBorder(Color.BLACK,2));
        SubtwoPanel.setPreferredSize(new Dimension(50,50));
        SubtwoPanel.add(new JLabel("Panel3"));

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(350,120));
        panel2.setLayout(new GridLayout(1,2));
        panel2.setBorder(new LineBorder(Color.BLUE, 3));
        panel2.add( new JLabel("This is JPanel 2"));
        panel2.add(SubtwoPanel);
    


        c.add(panel1);
        c.add(panel2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
}
