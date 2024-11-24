public class Fractie implements Numeric {

    private double fractie;

    public Fractie(double fractie) {
        this.fractie = fractie;
    }

    public double getFractie() {
        return fractie;
    }

    public Numeric add(Numeric num) {
        if (num instanceof Complex) {

            Complex c = (Complex) num;
            Complex rezultat = new Complex(0, 0);

            rezultat.setReal(c.getReal() + fractie);
            rezultat.setImg(c.getImg());

            return rezultat;
        } else {

            Fractie c = (Fractie) num;
            return new Fractie(c.getFractie() + fractie);
        }
    }

    public Numeric sub(Numeric num) {
        if (num instanceof Complex) {

            Complex c = (Complex) num;
            Complex rezultat = new Complex(0, 0);

            rezultat.setReal(c.getReal() - fractie);
            rezultat.setImg(c.getImg());

            return rezultat;
        } else {

            Fractie c = (Fractie) num;
            return new Fractie(c.getFractie() - fractie);
        }
    }

    public Numeric multiply(Numeric num) {
        if (num instanceof Complex) {

            Complex c = (Complex) num;
            Complex rezultat = new Complex(0, 0);

            rezultat.setReal(c.getReal() * fractie);
            rezultat.setImg(c.getImg());

            return rezultat;
        } else {
            Fractie c = (Fractie) num;
            return new Fractie(c.getFractie() * fractie);
        }
    }

    public String toString() {
        return "Fractia este: " + fractie;
    }

}
