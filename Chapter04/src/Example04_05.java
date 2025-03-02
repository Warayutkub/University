import java.util.Scanner;

public class Example04_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Enter your string : ");
        str = scanner.nextLine().trim();
        int c1, c2, c3, c4;
        c1 = c2 = c3 = c4 = 0;
        if (!str.isEmpty()) {
            char ch;
            for (int index = 0; index < str.length(); index++) {
                ch = str.charAt(index);
                if (ch >= 'A' && ch <= 'Z')
                    c1++;
                else if (ch >= 'a' && ch <= 'z')
                    c2++;
                else if (ch >= '0' && ch <= '9')
                    c3++;
                else
                    c4++;
            }
            System.out.println("This string \"" + str + "\" have ");
            System.out.println("Upper Letter is " + c1);
            System.out.println("Lower Letter is " + c2);
            System.out.println("Digit is " + c3);
            System.out.println("Symbol is " + c4);
        } else
            System.out.println("No data input.");
        scanner.close();
    }
}
