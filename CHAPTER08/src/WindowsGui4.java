import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class WindowsGui4 {
    JFrame window = new JFrame("GUI 4 : JList , JComboBox");
    JList<String> list;
    JComboBox<String> comboBox;
    public WindowsGui4( ) {
        Container c = window.getContentPane();
        c.setLayout( new FlowLayout() );
        createGui(c);
        window.setSize( 350,150);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createGui(Container c) {
        final String strList[] = {"List 1","List 2","List 3","List 4"};
        list = new JList<String>(strList);
        list.setFont(new Font("Tahoma", Font.BOLD, 16));
        list.setSelectedIndex(1);

        comboBox = new JComboBox<String>();
        comboBox.addItem("ComboBox 1");
        comboBox.addItem("ComboBox 2");
        comboBox.addItem("ComboBox 3");
        comboBox.addItem("ComboBox 4");
        comboBox.setSelectedIndex(2);

        c.add( list);
        c.add( comboBox);
    }
}
