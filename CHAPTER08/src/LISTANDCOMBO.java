import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

public class LISTANDCOMBO {
    public static void main(String[] args) {
        new InnerLISTANDCOMBO("Test drop down");
    }   
}
class InnerLISTANDCOMBO {
    private JFrame window = new JFrame();
    private Container container = window.getContentPane();
    public InnerLISTANDCOMBO(String Title){
        window.setTitle(Title);
        window.setVisible(true);
        window.setSize(500,400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLayout(new FlowLayout(10,10,10));
        insertComponent();
    }
    
    private void insertComponent(){
        String[] data = {"choice 1","choice 2","choice 3","choice 4","choice 5"};
        JList<String> list = new JList<String>(data);
        JComboBox<String> comboBox = new JComboBox<String>(data);
        comboBox.addItem("Warayut");
        comboBox.addItem("Wachiraya");
        comboBox.addItem("Bunrattanang");
        container.add(comboBox);
        container.add(list);
        comboBox.setSelectedIndex(0);
        list.setSelectedIndex(0);
        list.setFont(new Font("ROBOTO", Font.BOLD, 16));
        
    }
    
}
