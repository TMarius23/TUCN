public class Main {
    public static void main(String[] args) {

        FacebookAccount f1 = new FacebookAccount("Grigore", 22, "Cluj");
        FacebookAccount f2 = new FacebookAccount("Nelu", 42, "Cluj");
        FacebookAccount f3 = new FacebookAccount("Giga", 27, "Bucuresti");
        FacebookAccount f4 = new FacebookAccount("Maria", 33, "Bucuresti");
        FacebookAccount f5 = new FacebookAccount("Adriana", 57, "Alba");

        f1.add(f2);
        f1.add(f3);
        f1.add(f4);
        f1.add(f5);

        f2.add(f1);
        f3.add(f2);
        f4.add(f3);
        f5.add(f2);
        f5.add(f3);
        f5.add(f4);
        f5.add(f5);

        f1.printSameLoc("Cluj");
        System.out.println();

        f1.printPrieteni();

    }
}