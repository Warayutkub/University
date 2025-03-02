public class Example05_01 {

    public void displayInstance(){
        System.out.println("Hello from Instance.");
    }
    
    public static void displayStatic(){
        System.out.println("Hello from Static.");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Test call static method.");
        Example05_01.displayStatic();

        System.out.println("Test call instance method.");
        Example05_01 object = new Example05_01();
        object.displayInstance();
        System.out.println(Example05_02.calArea(45));
        Example05_02 test = new Example05_02();
        System.out.println(test.calCircumference(7));
    }
} 
