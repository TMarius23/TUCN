import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Persoana p1 = new Persoana("Gric", "Nici", 23);
        Persoana p2 = new Persoana("Gric1", "Nici2", 88);
        Persoana p3 = new Persoana("Ana", "Kithc", 29);

        System.out.println(p1.compareTo(p2));

        Persoana[] persoane = {p1, p2, p3};
        System.out.println(Arrays.toString(persoane));
        Arrays.sort(persoane);
        System.out.println(Arrays.toString(persoane));


        ////Tema 3.5

    }
}