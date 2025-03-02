import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MyCal implements ActionListener {
	JFrame window; 
    JLabel numberLabel;
	JTextField numberField;
	JButton [] btn;
	JPanel panel1, panel2;
    Font myFont = new Font("Tahoma", Font.BOLD, 18);

    public MyCal() {
		window = new JFrame("My Calculator");
		Container c = window.getContentPane();
		c.setLayout( new FlowLayout() );

		panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(270,40) );
        panel1.setLayout(new FlowLayout( ) );
        panel1.setBorder(new LineBorder(Color.DARK_GRAY, 1));
		numberField = new JTextField( 15 );
		numberField.setEditable( false );
		numberField.setFont(myFont);
        numberField.setHorizontalAlignment(JTextField.RIGHT);
		panel1.add( numberField );
        
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(250,40));
        panel2.setLayout(new GridLayout(1, 3 ) );
        panel2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        String [] textBtn = {"  1  ","  2  ","  3  " };
        btn = new JButton[textBtn.length];
        for(int n = 0 ; n < btn.length ; n++ ) {
            btn[n] = new JButton(textBtn[n]);
		    btn[n].setFont(myFont);
		    btn[n].addActionListener( this);
            panel2.add( btn[n] );
        }
        c.add(panel1);
        c.add(panel2);
		window.setSize( 300,300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setAlwaysOnTop(true);
	}

	public void actionPerformed( ActionEvent event ) {  
		String str = numberField.getText();
        
		if (event.getSource() == btn[0]) {
			str += "1";
			numberField.setText( numberField.getText() + "1" );
		}
		else if (event.getSource() == btn[1]) {
			str += "2";
			numberField.setText( str );
		}
		else if (event.getSource() == btn[2]) {
			str += "3";
			numberField.setText( str );
		}
	} // end method actionPerformed
  
}