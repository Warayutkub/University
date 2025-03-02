
import java.util.Scanner;

public class Example03_05 {
    public static void main(String[] args) {
        int num,numold,count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 digit nuber : ");
        num = input.nextInt();
        numold = num;
        //logic
        if (num > 0){
            count++;
            num/=10;
            if (num > 0){
                count++;
                num/=10;
                if(num >0){
                    count++;
                    num/=10;
                    if (num>0){
                        count++;
                        num/=10;
                    }
                }
            }
        }
        if(num ==0 && count==4){
            System.out.println("Number " + numold + " is 4 digit.");
        }else{
            System.out.println("Number " + numold + " is not equal 4 digit.");
        }
        input.close();
    }
}
