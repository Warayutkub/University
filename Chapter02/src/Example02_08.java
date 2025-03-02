public class Example02_08 {
    
    public static void main(String[] args) {
        boolean result;
        int number = 5;
        //String color = new String("red"); ใช้อันนี้หรืออันข้างล่างก็ได้เป็นคลาสเหมือนกัน
        String color = "red";

        System.out.println("When number = " + number + ", color = " + color);
        result = (number < 10) && (color.equals("red"));
        System.out.print("result = (number < 10) && (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) || (color.equals("red"));
        System.out.print("result = (number < 10) || (color == \"red\") = ");
        System.out.println(result);
        result = !(number < 10);
        System.out.println("result = !(number < 10)) = " + result);
        result = !(color.equals("red"));
        System.out.println("result = !(color == \"red\") = " + result);
        
    }
}
