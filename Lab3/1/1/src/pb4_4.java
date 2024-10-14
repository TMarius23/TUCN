public class pb4_4 {

    private String name;

    public pb4_4(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        System.out.println("Exersare" + " " + "concatenarii");

        pb4_4 voc1 = new pb4_4("Podgoria");

        if (voc1.equals("Podgoria"))
            System.out.println("True");
        else
            System.out.println("False");

        pb4_4 voc2 = new pb4_4("Podgoria");

        if (voc1 == voc2)
            System.out.println("True");
        else
            System.out.println("False");

        if (voc1.equals(voc2))
            System.out.println("True");
        else
            System.out.println("False");

        if (voc1.getName().equals("Podgoria"))
            System.out.println("True1");
        else
            System.out.println("False1");

        if (voc1.getName().equals(voc2.getName()))
            System.out.println("True2");
        else
            System.out.println("False2");


    }
}
