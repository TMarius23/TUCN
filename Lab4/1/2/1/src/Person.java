public class Person {

    private int ID_P;
    private String name;
    private String prenume;
    private int age;
    private String address;
    private String phone;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void modify1(Person p) {
        p = new Person("Modified Name");
        System.out.print(p.getName());
    }

    public static void modify2(Person p) {
        p.setName("Modified Name");
        System.out.print(p.getName());
    }

    public static void main(String[] args) {
        Person p = new Person("Initial Person");
        modify1(p);
        System.out.println("Method modify1(Person p):" + p.getName());
        modify2(p);
        System.out.println("Method modify2(Person p):" + p.getName());
    }
}