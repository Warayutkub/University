
import java.util.Scanner;

public class Example03_01 {
    public static void main(String[] args) throws Exception {
        String name;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = scan.nextLine();
        if ("Java".equals(name)){
            System.out.println("Hello, " + name);
        }
        System.out.println("Good bye, " + name);
        scan.close();
    }
}
