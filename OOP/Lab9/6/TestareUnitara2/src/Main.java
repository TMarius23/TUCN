import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<AnBisect> an = new ArrayList<AnBisect>();
        AnBisect a1 = new AnBisect(22);
        an.add(a1);

        AnBisect a2 = new AnBisect(200);
        an.add(a2);

        AnBisect a3 = new AnBisect(444);
        an.add(a3);

        AnBisect a4 = new AnBisect(1234);
        an.add(a4);


        for (AnBisect it : an) {
            System.out.println(it.getAn());
        }

        Iterator<AnBisect> it = an.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getAn());
        }

        ListIterator<AnBisect> it1 = an.listIterator();
        while (it1.hasNext()) {
            System.out.println(it1.next().getAn());
        }

        while (it1.hasPrevious()) {
            System.out.println(it1.previous().getAn());
        }
    }
}