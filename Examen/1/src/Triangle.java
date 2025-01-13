import java.awt.*;

public class Triangle extends FormaGeometrica {


    private float height;
    private float base;
    private float side;

    /// lungimea laturi


    Triangle(float height, float base, float side, Color color) {
        culoare = color;
        this.height = height;
        this.base = base;
        this.side = side;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float getHeight() {
        return height;
    }

    public float getBase() {
        return base;
    }

    public float getSide() {
        return side;
    }

    public void setColor(Color color) {
        culoare = color;
    }

    public Color getColor() {
        return culoare;
    }

    @Override
    public double ariaForma() {
        return base * height;
    }

    @Override
    public double perimetru() {
        return 2 * side + base;
    }

    public String toString() {
        return "Inaltimea: " + height + " Baza " + base + " Side " + side + " Culoare " +
                culoare + " Aria " + ariaForma() + " Perimetru " + perimetru();
    }
}
