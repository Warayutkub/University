import java.util.Scanner;

public class Example05_02_t {
    public void mainProgram() {
        Scanner inp = new Scanner(System.in);
        boolean done = true;
        int radius;

        myPrintln("Program calculate area.");
        do {
            myPrint("Enter radius(1: Exit) : ");
            radius = inp.nextInt();
            if (radius != -1) {
                double area = calArea(radius);
                double circumference = calCircumference(radius);
                myPrintln("Radius : " + radius);
                myPrintln("Area : " + area);
                myPrintln("Circumference : " + circumference);
            }
            else if(radius == -1){
                myPrintln("Exit Program.");
                done = false;
            }
        } while (done);
        inp.close();
    }

    static Double calArea(int radius) {
        return  Math.PI * radius * radius;
    }

    Double calCircumference(int radius){
        return 2 * Math.PI * radius;
    }

    void myPrint(String data) {
        System.out.print(data);
    }

    void myPrintln(String data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        Example05_02 Start = new Example05_02();
        Start.mainProgram();
        
    }
}
