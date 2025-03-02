
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Example05_02 {

    void mainProgram(){
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius : "));
        DecimalFormat format = new DecimalFormat("###,##0.00");
        double area = calArea(radius);
        double circumference = calCircumference(radius);
        String messout = "Radius : "+ format.format(radius) +"\nArea : "+format.format(area)+"\nCircumference : "+ format.format(circumference);
        JOptionPane.showMessageDialog(null, messout);
    }

    static double calArea(double radius){
        return Math.PI * radius * radius;
    }

    double calCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Example05_02 object = new Example05_02();
        object.mainProgram();
    }
}
