
import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_14 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat fourDigit = new DecimalFormat("0.0000");
        String StrMenu = "", choice;
        boolean done = true;

        StrMenu += "    Main Menu \n=================\n";
        StrMenu += "1. Area Rectangle\n2.Area Circle\n";
        StrMenu += "3. Exit\nEnter choice : ";

        while (done) {
            System.out.print(StrMenu);
            choice = inp.next();
            switch (choice) {
                case "1" -> {
                    float width, height, area;
                    System.out.print("Enter width : ");
                    width = inp.nextFloat();
                    System.out.print("Enter height : ");
                    height = inp.nextFloat();
                    area = (float) (width * height);
                    System.out.println("Area of Reactangle : " + fourDigit.format(area));
                }
                case "2" -> {
                    float radius, area;
                    System.out.print("Enter radius : ");
                    radius = inp.nextFloat();
                    area = (float) (Math.PI * radius * radius);
                    System.out.println("Area of Circle = " + fourDigit.format(area));
                }
                case "3" -> {
                    done = false;
                }
                default ->
                    System.out.println("This choices is incorrect, try again");
            }
            System.out.println();
        }
        System.out.println("Exit program, bye bye.");
        inp.close();
    }
}
