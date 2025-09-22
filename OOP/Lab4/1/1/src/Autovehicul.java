import java.awt.*;
///importata pt a seta culoarea
/// folosindune de clasa Color

public class Autovehicul {

    private String model;
    private Color color;
    private int vitezaCurenta;
    private int vitezaMaxima;
    private int treaptaVitezaCurenta;
    private int km_masina;
    private static final int NR_TREPTE = 6;


    private Sofer sofer;
    private Rezervor rezervor;

    public Autovehicul(String model, Color color, int vitezaCurenta, int vitezaMaxima, int treaptaVitezaCurenta, Sofer sofer, Rezervor rezervor) {
        this.model = model;
        this.color = color;
        this.vitezaCurenta = vitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
        this.sofer = sofer;
        this.rezervor = rezervor;
    }

    public Autovehicul(){
        this.model = "Audi";
        this.color = Color.orange;
        this.vitezaCurenta = 120;
        this.vitezaMaxima = 320;
        this.treaptaVitezaCurenta = 5;
        this.sofer = new Sofer();
        this.rezervor = new Rezervor();
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String model){
        this.model = model;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public int getVitezaCurenta(){
        return vitezaCurenta;
    }

    public void setVitezaCurenta(int vitezaCurenta){
        this.vitezaCurenta = vitezaCurenta;
    }

    public int getVitezaMaxima(){
        return vitezaMaxima;
    }

    public void setTreaptaVitezaCurenta(int k){
        if(k > 6)
        {
            this.treaptaVitezaCurenta = NR_TREPTE;
        }
        else{
            if(k < 0)
            {
                this.treaptaVitezaCurenta = 0;
            }else{
                this.treaptaVitezaCurenta = k;
            }
        }
    }

    public void oprire(){

        if(vitezaCurenta > 250){
            treaptaVitezaCurenta = 6;
        }
        if(vitezaCurenta > 150 && vitezaCurenta <= 250){
            treaptaVitezaCurenta = 5;
        }
        if(vitezaCurenta > 100 && vitezaCurenta <= 150){
            treaptaVitezaCurenta = 4;
        }
        if(vitezaCurenta > 40 && vitezaCurenta <= 100){
            treaptaVitezaCurenta = 3;
        }
        if(vitezaCurenta > 20 && vitezaCurenta <= 40){
            treaptaVitezaCurenta = 2;
        }
        if(vitezaCurenta > 0 && vitezaCurenta <= 20) {
            treaptaVitezaCurenta = 1;
        }
        if(vitezaCurenta == 0){
            treaptaVitezaCurenta = 0;
        }
    }

    public int getTreaptaVitezaCurenta(){
        return treaptaVitezaCurenta;
    }

    public String toString(){

        return "Autovehiculu cu marca " + getModel() + " culoarea " + getColor() + " are viteza maxima " + getVitezaMaxima() + " dar ea cirucla cu " +
                getVitezaCurenta() + " fiind in treapta " + getTreaptaVitezaCurenta() + ", masina avand in total " + NR_TREPTE +
                " trepte de viteza\n" + " soferul fiind: " + sofer + rezervor;

    }

    public void accelerare(Autovehicul a, int val)
    {
        if(a.getVitezaCurenta() + val < a.getVitezaMaxima()){
            a.setVitezaCurenta(a.getVitezaCurenta() + val);
        }else{
            a.setVitezaCurenta(a.getVitezaMaxima());
        }
    }
   public void decelerare(Autovehicul a, int val)
    {
        if(a.getVitezaCurenta() - val > 0){
            a.setVitezaCurenta(a.getVitezaCurenta() - val);
        }else{
            a.setVitezaCurenta(0);
        }
    }

    public void setKmParcursi(int k){
        km_masina = km_masina + k;
    }

    public int getKmParcursi(){
        return km_masina;

    }

    public static void main(String[] args){


    }
}
