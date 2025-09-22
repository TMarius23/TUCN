public class Piesa {

    public void setTip(TipPiesa tip) {
        this.tip = tip;
    }

    public enum TipPiesa {
        P, T, N, C, R, Q, S
    }

    private int x, y;
    private TipPiesa tip;
    private int culoare;

    public Piesa(int i, int j, TipPiesa tip, int culoare) {
        this.x = i;
        this.y = j;
        this.tip = tip;
        this.culoare = culoare;
    }

    public TipPiesa getTip() {
        return this.tip;
    }

    public void SetTip(TipPiesa tip) {
        this.tip = tip;
    }

    public int getCuloare() {
        return this.culoare;
    }

    public void setCoordonate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Piesa: " + tip +
                ", culoare:" + (culoare == 0 ? "Alb" : "Negru") +
                ", pozitie:(" + x + "," + y + ")" +
                '}';
    }

    public static void main(String[] args) {

    }
}
