//ID : 6706021612038
//Name : Mr. Warayut Bunrattanang
//Room : 1RC
//File Name : Assign05_6706021612038_02.java

import java.text.DecimalFormat;
import java.util.Random;

public class  Assign05_6706021612038_02 {
    
    static void demoSales(){
        Random random = new Random();
        DecimalFormat two = new DecimalFormat("###,##0.00");
        double[] sales = new double[12],percents = new double[12];
        double total = 0.0;

        for (int i = 0; i < sales.length; i++) {
            sales[i] = 10000 + (100000 - 10000) * random.nextDouble();
            total += sales[i];
        }

        System.out.println("+--------------------------------------+");
        System.out.println("| Month |      Sales   | Percentage(%) |");
        System.out.println("+--------------------------------------+");
        for (int H = 0;H < sales.length;H++){
            percents[H] = (sales[H]*100)/total;
            System.out.printf("| %5d | %12s | %9s     |\n", H + 1, two.format(sales[H]), two.format(percents[H]));
        }
        System.out.println("+--------------------------------------+");
    }

    public static void main(String[] args) throws Exception {
        Assign05_6706021612038_02.demoSales();
    }
}
