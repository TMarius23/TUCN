import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TestFormeGeometrice extends JPanel {

    private ArrayList<FormaGeometrica> lista;

    public TestFormeGeometrice() {
        lista = new ArrayList<>();
    }

    public void sortByArea(ArrayList<FormaGeometrica> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).ariaForma() < lista.get(j).ariaForma()) {
                    FormaGeometrica temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
    }

    public boolean verificareTriunghiIncapeInPatrat(Triangle t1, Square s1) throws InclusionNotPossibleException {

        if (t1.getBase() <= s1.getSide() && t1.getHeight() <= s1.getSide()) {
            return true;
        } else {
            throw new InclusionNotPossibleException("Eroare: Forma nu incape una in alta");
        }
    }

    public static void main(String[] args) {

        TestFormeGeometrice test = new TestFormeGeometrice();

        FormaGeometrica t1 = new Triangle(4, 5, 4, Color.CYAN);
        FormaGeometrica t2 = new Triangle(5, 3, 4, Color.BLUE);
        FormaGeometrica t3 = new Triangle(2, 2, 2, Color.RED);

        FormaGeometrica c1 = new Circle(10, Color.DARK_GRAY);
        FormaGeometrica c2 = new Circle(3, Color.GREEN);
        FormaGeometrica c3 = new Circle(5,Color.PINK);

        FormaGeometrica s1 = new Square(10, Color.BLUE);
        FormaGeometrica s2 = new Square(3, Color.BLACK);
        FormaGeometrica s3 = new Square(7, Color.GREEN);
        FormaGeometrica s4 = new Square(5, Color.CYAN);


        test.lista.add(t1);
        test.lista.add(t2);
        test.lista.add(t3);

        test.lista.add(c1);
        test.lista.add(c2);
        test.lista.add(c3);

        test.lista.add(s1);
        test.lista.add(s2);
        test.lista.add(s3);
        test.lista.add(s4);


        System.out.println();
        System.out.println("Afisam elementele: ");
        for(FormaGeometrica f : test.lista) {
            System.out.println(f.getClass() + " " + f);
        }

        System.out.println();
        System.out.println("Afisam elementele crescator in functie de arie: ");
        test.sortByArea(test.lista);

        for (FormaGeometrica f : test.lista) {
            System.out.print(f.getClass().getSimpleName() + " " + f.ariaForma() + "\n");
        }

        System.out.println();
        System.out.println("Verificam daca triunghiul t1 incape in patratul s1: ");
        try {
            System.out.println(test.verificareTriunghiIncapeInPatrat((Triangle) t2, (Square) s1));
        } catch (InclusionNotPossibleException msg) {
            System.out.println(msg.getMessage());
        }

        System.out.println();
        System.out.println("Verificam daca triunghiul t1 incape in patratul s2: ");
        try {
            System.out.println(test.verificareTriunghiIncapeInPatrat((Triangle) t2, (Square) s2));
        } catch (InclusionNotPossibleException msg) {
            System.out.println(msg.getMessage());
        }



        ///GUI

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setTitle("Pagina principala");
        frame.setLocation(500, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JLabel label1 = new JLabel("Introduceti inaltimea");
        JTextField tf1 = new JTextField();

        JLabel label2 = new JLabel("Introduceti baza");
        JTextField tf2 = new JTextField();

        JPanel panel1_a = new JPanel(new GridLayout(2, 1));
        panel1_a.add(label1);
        panel1_a.add(tf1);

        JPanel panel1_b = new JPanel(new GridLayout(2, 1));
        panel1_b.add(label2);
        panel1_b.add(tf2);


        panel.add(panel1_a);
        panel.add(panel1_b);


        JButton b1 = new JButton("Afisare rezultat");
        panel.add(b1);


        JTextField tf_rezultat = new JTextField();
        panel.add(tf_rezultat);


        Button1Listener bt1 = new Button1Listener(tf1, tf2, tf_rezultat);
        b1.addActionListener(bt1);

        frame.add(panel);
        frame.setVisible(true);


    }

}
