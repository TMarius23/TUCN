public class Complex implements Numeric {

    private double real;
    private double img;


    public Complex(double real, double img){
        this.real = real;
        this.img = img;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImg(double img){
        this.img = img;
    }

    public double getReal(){
       return real;
    }

   public double getImg(){
        return img;
   }

    public Numeric add(Numeric num){
        if(num instanceof Complex){
            Complex c = (Complex)num;
            Complex rezultat = new Complex(0,0);

            rezultat.real = this.real + c.real;
            rezultat.img = this.img + c.img;

            return rezultat;
        }else{

            Fractie c = (Fractie)num;
            Complex rezultat = new Complex(0,0);

            rezultat.real = this.real + c.getFractie();
            rezultat.img = this.img;

            return rezultat;
        }
    }

    public Numeric sub(Numeric num){
        if(num instanceof Complex){
            Complex c = (Complex)num;
            Complex rezultat = new Complex(0,0);

            rezultat.real = this.real - c.real;
            rezultat.img = this.img - c.img;

            return rezultat;
        }else{

            Fractie c = (Fractie)num;
            Complex rezultat = new Complex(0,0);

            rezultat.real = this.real - c.getFractie();
            rezultat.img = this.img;

            return rezultat;
        }
    }
    public Numeric multiply(Numeric num){
        if(num instanceof Complex){
            Complex c = (Complex)num;
            Complex rezultat = new Complex(0,0);

            rezultat.real = this.real * c.real - this.img * c.img;
            rezultat.img = this.real * c.img + this.img * c.real;

            return rezultat;
        }else{

            Fractie c = (Fractie)num;
            Complex rezultat = new Complex(0,0);

            rezultat.real = this.real * c.getFractie();
            rezultat.img = this.img * c.getFractie();

            return rezultat;
        }
    }

    public String toString() {
        String num = "Complex este: " + this.real;

        if(this.img > 0){
            num += " + ";
            num += this.img ;
        }else{
            num += " " + this.img ;
        }

        return num;
    }

}
