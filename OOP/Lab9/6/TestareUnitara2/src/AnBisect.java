public class AnBisect {

    private int an;

    public AnBisect(int an) {
        this.an = an;
    }

    public boolean esteAnBisect(int an) {
        if (an % 4 == 0 && an % 100 != 0 || an % 400 == 0)
            return true;
        return false;
    }

    public int getAn() {
        return an;
    }

}
