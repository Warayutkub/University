public class Example02_10 {
    final double PI = 3.1416;
    String message;
    double result;

    public Example02_10(double radius){
        message = "circle : ";
        result = 2 * PI * radius * radius;
    }

    public Example02_10(double width,double height){
        message = "Reactangle : ";
        result = width * height;
    }

    public static void main(String[] args) {
        Example02_10 Cir = new Example02_10(7.0);
        Example02_10 React = new Example02_10(5.0,4.0);

        String message = "Area of";
        System.out.println(message + " " + Cir.message + " " + Cir.result);
        System.out.println(message + " " + React.message + " " + React.result);

    }
}
