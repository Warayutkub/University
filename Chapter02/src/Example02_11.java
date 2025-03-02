import java.util.Scanner;

public class Example02_11 {
    
    public static void main(String[] args) {
        String name1,name2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name 1 : ");
        name1 = scan.nextLine();
        System.out.println("Enter your name 2 : ");
        name2 = scan.next(); //How different from nextline? : Bucause this method end line with space,enter,tab or this method'll store one conversation.
        System.out.println("You entered name1 : \"" + name1 + "\"");
        System.out.println("You entered name1 : \"" + name2 + "\"");
        scan.close();
    }
}
