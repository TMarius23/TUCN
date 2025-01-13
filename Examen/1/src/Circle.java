import java.awt.*;

public class Circle extends FormaGeometrica {


    private float radius;

    public Circle(float radius, Color color) {
        culoare = color;
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setColor(Color color) {
        culoare = color;
    }

    public Color getColor() {
        return culoare;
    }

    @Override
    public double ariaForma() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetru() {
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Raza " + radius + " Culoare " + culoare + " Aria " + ariaForma() + " Perimetru " + perimetru();
    }

}
