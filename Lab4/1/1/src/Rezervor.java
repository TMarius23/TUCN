public class Rezervor {


    public int capacitateMaxima;
    public int nivelCurent;

    public Rezervor(){
        this.capacitateMaxima = 75;
        this.nivelCurent = 40;
    }

    public Rezervor(int capacitateMaxima, int nivelCurent){
        this.capacitateMaxima = capacitateMaxima;
        this.nivelCurent = nivelCurent;
    }

    public void setCapacitateMaxima(int capacitateMaxima){
        this.capacitateMaxima = capacitateMaxima;
    }

    public int getCapacitateMaxima(){
        return this.capacitateMaxima;
    }

    public void setNivelCurent(int nivelCurent) {
        this.nivelCurent = nivelCurent;
    }

    public int getNivelCurent(){
        return this.nivelCurent;
    }

    public void umplere(int k)
    {
        if(nivelCurent + k > capacitateMaxima)
            nivelCurent = capacitateMaxima;
        else{
            nivelCurent = nivelCurent + k;
        }
    }

    public void umplere(byte k)
    {
        if(nivelCurent + k > capacitateMaxima)
            nivelCurent = capacitateMaxima;
        else{
            nivelCurent = nivelCurent + k;
        }
    }

    public void golire(int k)
    {
        if(nivelCurent - k < 0)
            nivelCurent = 0;
        else{
            nivelCurent = nivelCurent - k;
        }
    }

    public String toString(){
        return "Rezervorul are o capacitate maxima de " + capacitateMaxima + " iar nivelul curent de conbustibil este de " + nivelCurent + ".\n";
    }

    public static void main(String[] args){

    }

}
