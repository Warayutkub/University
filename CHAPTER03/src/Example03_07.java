
import java.util.Scanner;

public class Example03_07 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1, num2;
        double result = 0;
        boolean done = true;
        String Message;
        System.out.print("Enter equation : ");
        num1 = inp.nextInt();
        Message = inp.next();
        num2 = inp.nextInt();
        char operator = Message.charAt(0); //ไปดูเรื่องของการรับอินพุตมีอะไรบ้างเพิ่มเติม
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                Message = "result = num1 + num2 = ";
            }
            case '-' -> {
                result = num1 - num2;
                Message = "result = num1 - num2 = ";
            }
            case '*' -> {
                result = num1 * num2;
                Message = "result = num1 * num2 = ";
            }
            case '/' -> {
                result = (double) num1 / num2;
                Message = "result = num1 / num2 = ";
            }
            case '%' -> {
                result = (double) num1 % num2;
                Message = "result = num1 % num2 = ";
            }
            default ->
                done = false;
        }
        if (done) {
            System.out.println(Message + result); 
        }else {
            System.out.println("Invalid operator");
        }
        inp.close();
    }
}
