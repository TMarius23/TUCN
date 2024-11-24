import java.awt.*;

public class Masina {

    private String marca;
    private Color color;

    public Masina(String marca, Color color) {
        this.marca = marca;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return "Marca:" + marca + ", Color:" + color;
    }

    public Object clone() throws CloneNotSupportedException {
        Masina m = (Masina) super.clone();

        return m;
    }

}
