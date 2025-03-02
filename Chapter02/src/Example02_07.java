public class Example02_07 {
    public static void main(String[] args) {
        int a = 10,b = 6;
        double y,y1,y2;
        
        System.out.println("When a = " + a + ", b = "+ b + '\n');
        y1 = (a - b) * (a + b);//สมการที่ 1
        y2 = a - b * a + b;//สมการที่ 1
        y = (a*a) - (b*b);
        System.out.println("y = (a-b) * (a + b) = " + y + " " + y1 + " " + y2);
        y1 = 3 * ((a - b) * (a + b)) - 6;//สมการที่ 2
        y2 = 3 * a - b * a + b - 6;//สมการที่ 2
        y = 3 * ((a*a) - (b*b)) - 6;
        System.out.println("y = 3* ((a-b) * (a + b)) - 6 = " + y + " " + y1 + " " + y2);
        y1 = 1 - (2 * a)/(3 * b);//สมการที่ 3
        y2 = 1 - 2 * a/3 * b;//สมการที่ 3
        y = 1 - (3/2)*(a / b);
        String Tr = String.valueOf(1 - (3/2)*(a / b));
        System.out.println("y = 1 - (2 * a)/(3 * b) = " + y + " " + y1 + " " + y2 + " " + Tr);
    }
}
