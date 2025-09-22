public class Implementare_toate implements Combinatie {

    private int Fire;
    private int Pauza;
    private String proiect;
    private String tipElectrozi;
    private String Diploma;
    private String LocDeMunca;

    public Implementare_toate() {
        this.Fire = 0;
        this.Pauza = 0;
        this.proiect = "";
        this.tipElectrozi = "";
        this.Diploma = "";
        this.LocDeMunca = "";
    }

    public Implementare_toate(int Fire, int Pauza, String proiect, String tipElectrozi, String Diploma, String LocDeMunca) {
        this.Fire = Fire;
        this.Pauza = Pauza;
        this.proiect = proiect;
        this.tipElectrozi = tipElectrozi;
        this.Diploma = Diploma;
        this.LocDeMunca = LocDeMunca;
    }

    public void print(){
        System.out.println("Fire: " + this.Fire);
    }
    public double getFire(){
        return this.Fire;
    }
    public double getPauza(){
        return this.Pauza;
    }
    public String getProiect(){
        return proiect;
    }
    public String getElectrozi(){
        return tipElectrozi;
    }
    public void getDiploma(){
        System.out.println("Diploma: " + this.Diploma);
    }
    public void getLocMunca(){
        System.out.println("Loc Munca: " + this.LocDeMunca);
    }
}
