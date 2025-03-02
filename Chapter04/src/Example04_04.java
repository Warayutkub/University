import java.util.Scanner;

public class Example04_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter name : ");
        name = scanner.nextLine();
        if (!name.isEmpty()) {
            for (int index = 0; index < name.length(); index++) {
                System.out.print("Character : " + name.charAt(index));
                System.out.print(" is ascii value : ");
                System.out.println((byte) name.charAt(index));
            }
        } else
            System.out.println("No data input.");
        scanner.close();
    }
}
