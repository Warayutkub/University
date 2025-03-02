import javax.swing.JFrame;

public class Test {
    public static void main(String[] args) {
        new MyJframe("test");

    }
}

class MyJframe{
    JFrame window;
    public MyJframe(String title){
        window = new JFrame();
        window.setTitle(title);
        window.setSize(1000,500);
        window.setVisible(true);
        window.setLocation(500,250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}