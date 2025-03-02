import java.util.Random;

public class Example04_07 {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("Use nextInt :");
        for (int n = 1; n <= 5; n++)
            System.out.print(rnd.nextInt() + ", ");
        System.out.println("\nUse nextInt(6)");
        for (int n = 1; n <= 5; n++)
            System.out.print(rnd.nextInt(6) + ", ");
        System.out.println("\nUse nextLong()");
        for (int n = 1; n <= 5; n++)
            System.out.print(rnd.nextLong() + ", ");

        System.out.println("\nUse nextDouble()");
        for (int n = 1; n <= 5; n++)
            System.out.print(rnd.nextDouble() + ", ");
        System.out.println("\nUse nextInt()"); // 30 - 50
        for (int n = 1; n <= 5; n++)
            System.out.print((30 + rnd.nextInt(21)) + ", ");
        System.out.println();
    }
}
