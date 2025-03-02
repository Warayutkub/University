import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MinMaxNumber implements ActionListener {
	JFrame window = new JFrame("Min Max Program");
    JLabel label1,label2,label3,labelN3;
	JTextField number1, number2,numberN3, result,result2;
	JButton btn;
	Container c = window.getContentPane();
    JPanel panel1, panel2;
    Font font = new Font("Tahoma", Font.BOLD, 16);
	// Constructor
	public MinMaxNumber() {
		c.setLayout( new FlowLayout(FlowLayout.CENTER, 10, 10));
        create_panel1();
		btn = new JButton(" Find Min And Max");
        btn.setFont( font);
        btn.addActionListener( this);
		c.add( btn );
		create_panel2();
		window.setSize( 400, 320);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	
    public void create_panel1() {
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(360,120));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        panel1.setBorder(new LineBorder(Color.RED, 1));
        label1 = new JLabel("Enter number 1 : ");
        label1.setFont(font);
        panel1.add( label1 );
		number1 = new JTextField( 10 );
        number1.setFont( font);
        panel1.add( number1 );

        label2 = new JLabel("Enter number 2 : ");
        label2.setFont(font); 
        panel1.add( label2);
		number2 = new JTextField( 10 );
        number2.setFont( font);
        panel1.add( number2 );
        
        labelN3 = new JLabel("Enter number 3 : ");
        labelN3.setFont(font); 
        panel1.add( labelN3);
		numberN3 = new JTextField( 10 );
        numberN3.setFont( font);
        panel1.add( numberN3 );
        
        c.add(panel1);
    }
    public void create_panel2() {
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(360,100));
        panel2.setLayout(new FlowLayout( FlowLayout.CENTER, 10, 10));
        panel2.setBorder(new LineBorder(Color.blue, 1));
        label3 = new JLabel("Minimum Result : ");
        label3.setFont( font);
        panel2.add( label3 );
		result = new JTextField( 10 );
        result.setFont( font);
		result.setEditable(false);
		panel2.add( result);

        result2 = new JTextField(10);
        result2.setEditable(false);
        panel2.add(new JLabel("Maximum Result : "));
        panel2.add(result2);
		c.add(panel2);
    }
	public void actionPerformed( ActionEvent event ) {  
		int num1, num2,num3, min,max;
		num1 = Integer.parseInt( number1.getText() );
		num2 = Integer.parseInt( number2.getText() );
		num3 = Integer.parseInt( numberN3.getText() );

        min = findMin( num1, num2,num3);
        max = findMax( num1, num2,num3);
		result.setText(Integer.toString(min));
        result2.setText(Integer.toString(max));
		// clear value in numberField
		number1.setText("");
		number2.setText("");
        numberN3.setText("");
	} 	
	
	public int findMin(int n1, int n2,int n3) {
		return( Math.min(n1,(Math.min(n2, n3))));
	}

    int findMax(int n1, int n2, int n3){ return (Math.max(n1, Math.max(n2, n3)));}
} 