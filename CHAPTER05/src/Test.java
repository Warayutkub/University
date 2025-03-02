public class Test {
    Double price = 0.0;
    
    public static void main(String[] args) {
        Store str = new Store("Grade A");
        String data = str.call();
        System.out.println(data);

    }

    public void clear(){
        price = 0.0;
    }
}

class Store {
    String grade;

    Store(String grade) {
        this.grade = grade;
    }

    String call(){
        String f= grade;
        return this.grade;
    }
}