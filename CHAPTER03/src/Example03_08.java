
import java.text.NumberFormat;
import java.util.Scanner;

public class Example03_08 {

    public static void main(String[] args) {
        final int NUM_GAMES = 12;
        int won;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of games won(0 to " + NUM_GAMES + ") : ");
        won = inp.nextInt();
        while (won < 0 || won > NUM_GAMES) {
            System.out.println("Invalid input. Please reeter : ");
            won = inp.nextInt();
        }
        float ration = (float) won / NUM_GAMES;
        NumberFormat fmt = NumberFormat.getPercentInstance();//return back to string.
        System.out.println("");
        System.out.println("Winning percentage : " + fmt.format(ration));
        inp.close();
    }
}
