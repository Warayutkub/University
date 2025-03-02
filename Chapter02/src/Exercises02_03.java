
import java.util.Scanner;

public class Exercises02_03 {
    public static void main(String[] args) {
        float principle,rate,principle_cal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter principle : ");
        principle = scan.nextFloat();
        principle_cal = principle;
        System.out.println("Enter interest : ");
        rate = scan.nextFloat();
        for (int i = 1;i <= 4;i++){
            principle_cal = principle_cal + (principle_cal * (rate/100));
        }
        System.out.println("deposit : " + principle_cal);
        System.out.println("principle : " + principle);
        System.out.println("interest rate : " + rate + "%");
        System.out.println("interest : " + (principle*(rate/100)));
        scan.close();
    }
}
