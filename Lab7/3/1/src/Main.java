import java.awt.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Masina m1 = new Masina("BMW", Color.BLACK);
        Student s1 = new Student("Andrei", "Vasile", m1);

        System.out.println(s1);

        Student s2 = (Student) s1.clone();

        m1.setColor(Color.cyan);
        System.out.println(s1);
        System.out.println(s2);

        m1.setColor(Color.BLACK);

        Student s3 = (Student) s1.clone_deep();

        m1.setColor(Color.GREEN);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}