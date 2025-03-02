import javax.swing.JOptionPane;

public class Example05_05 {

    public static void start() {
        DataClass data = new DataClass();
        String output = "";

		data.num1 = Integer.parseInt(JOptionPane.showInputDialog( "Enter number 1 : " ));
		data.num2 = Integer.parseInt(JOptionPane.showInputDialog( "Enter number 2 :" ));
        output = "Before call method\n";
        output += "from data.num1 = " + data.num1 + ", data.num2 = " + data.num2 + "\n";
        JOptionPane.showMessageDialog( null, output);
        changeValue( data );
        output = "After call method\n";
        output += "from data.num1 = " + data.num1 + ", data.num2 = " + data.num2 + "\n";
        JOptionPane.showMessageDialog( null, output); 
        System.exit(0);
    }
    
    public static void changeValue( DataClass ob) {
        int temp = ob.num1;
        ob.num1 = ob.num2;
        ob.num2 = temp;
    }

    public static void main(String[] args) {
		Example05_05.start();
    }
}

class DataClass {
    public static final char[] Age = null;
    public static final char[] name = null;
    int num1, num2;
}