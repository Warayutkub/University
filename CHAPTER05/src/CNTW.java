import java.text.DecimalFormat;
import java.util.Scanner;

public class CNTW {
    public void start(){
        int number;
        DecimalFormat dc = new DecimalFormat("###,###");
        String str = "",word = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = sc.nextInt();
        str = cntw(number);
        word = cstrtw(number);
        System.out.println("Your number is " + dc.format(number));
        System.out.println("Turn in to word : " + word + str);
    }

    public static String cntw(int number){
        String word = " ";
        if(number / 10 == 0){
            word = " ";
        } else if (number / 1000 == 0) {
            word = "Ten";
        } else if (number / 10000 == 0) {
            word = "Hundred";
        } else if (number / 100000 == 0) {
            word = "Thousand";
        } else if (number / 1000000 == 0) {
            word = "Hundred Thousand";
        } else if (number / 10000000 == 0) {
            word = "Million";
        } return word;
    }

    public static String cstrtw(int number){
        String word = " ";
        if(number / 1000 == 0){
            if (number / 1000 == 1) {
                word = "One";
            } else if (number / 1000 == 2) {
                word = "Two";
            } else if (number / 1000 == 3){
                word = "Three";
            } else if (number / 1000 == 4){
                word = "Four";
            } else if (number / 1000 == 5){
                word = "Five";
            } else if (number / 1000 == 6){
                word = "Six";
            } else if (number / 1000 == 7){
                word = "Seven";
            } else if (number / 1000 == 8){
                word = "Eight";
            } else if (number / 1000 == 9){
                word = "Nine";
            } else if (number / 1000 == 10){
                word = "Ten";
            } 
        }
        return word;
    }

    public static void main(String[] args) {
        CNTW obj = new CNTW();
        obj.start();
    }
}
