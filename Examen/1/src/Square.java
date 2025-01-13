import java.awt.*;

public class Square extends FormaGeometrica {

    private float side;

    public Square(float side, Color color) {
        culoare = color;
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public void setColor(Color color) {
        culoare = color;
    }

    public Color getColor() {
        return culoare;
    }

    @Override
    public double ariaForma() {
        return side * side;
    }

    @Override
    public double perimetru() {
        return 4 * side;
    }

    public String toString() {
        return "Latura " + side + " culoare " + culoare + " Aria " + ariaForma() + " Perimetru " + perimetru();
    }

}
