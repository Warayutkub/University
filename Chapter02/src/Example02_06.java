public class Example02_06 {
    long id = 6706021612038l;
    String name = "Warayut";
    String surname = "Bunrattanang";
    int age = 19;

    public Example02_06(){

    }

    public static void main(String[] args) {
        String info;
        Example02_06 person = new Example02_06();
        info = person.name +" "+ person.surname;
        info += ", " + person.age + "year old";
        System.out.println("ID : " + person.id);
        System.out.println("Data preson : " + info);
        System.out.println("================================");
        person.name = "Wara";
        person.surname = "BunBun";
        person.age = 18;
        info = person.name +" "+ person.surname;
        info += ", " + person.age + "year old";
        System.out.println("ID : " + person.id);
        System.out.println("Data preson : " + info);
    }
}
