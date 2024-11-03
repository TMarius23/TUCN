import java.lang.module.*;

public class Complex {

    private double real;
    private double img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public Complex() {
        this.real = 0;
        this.img = 0;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double modul() {
        return Math.sqrt(img * img + real * real);
    }

    public void adunare(Complex a) {
        this.real += a.real;
        this.img += a.img;
    }

    public void scadere(Complex a) {
        this.real -= a.real;
        this.img -= a.img;
    }

    public Complex inmultire(Complex a, Complex b) {

        Complex c = new Complex();
        c.real = a.real * b.real - a.img * b.img;
        c.img = a.real * b.img + b.real * a.img;

        return c;
    }

    public void inmultire(Complex a) {

        this.real = a.real * this.real - a.img * this.img;
        this.img = a.real * this.img + this.real * a.img;
    }

    public Complex inmultire_r(Complex a) {

        Complex c = new Complex();
        c.real = a.real * this.real - a.img * this.img;
        c.img = a.real * this.img + this.real * a.img;

        return c;
    }

    public void inmultire_scalar(int k) {

        this.real = k * this.real;
        this.img = k * this.img;
    }

    public String toString() {
        String s = "0";
        if (img > 0)
            s = real + " + " + img + "j";
        if (img < 0) {
            s = real + " - " + (-1)*img + "j";
        }
        if (img == 0 && real == 0)
            return "0";

        if (img == 0)
            s = real + " + " + img + "j";
        if (real == 0)
            s = real + " + " + img + "j";

        return s;
    }


    public static void main(String[] args) {

    }
}
