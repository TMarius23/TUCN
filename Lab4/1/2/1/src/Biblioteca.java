public class Biblioteca {

    private int ID_B;
    private String Nume_B;
    private String Adresa;
    private int nr_cititori;

    private Carte carte;

    public Biblioteca(int ID_B, String Nume_B, String Adresa, Carte carte, int nr_cititori) {
        this.ID_B = ID_B;
        this.Nume_B = Nume_B;
        this.Adresa = Adresa;
        this.carte = carte;
        this.nr_cititori = nr_cititori;
    }

    public Biblioteca() {
        this.ID_B = 0;
        this.Nume_B = "UNKNOWN";
        this.Adresa = "UNKNOWN";
        this.carte = null;
        this.nr_cititori = 0;
    }

    public void setID_B(int ID_B) {
        this.ID_B = ID_B;
    }

    public int getID_B() {
        return ID_B;
    }

    public void setNume_B(String Nume_B) {
        this.Nume_B = Nume_B;
    }

    public String getNume_B() {
        return Nume_B;
    }

    public void setAdresa(String Adresa) {
        this.Adresa = Adresa;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setNr_cititori(int nr_cititori) {
        this.nr_cititori = nr_cititori;
    }

    public int getNr_cititori() {
        return nr_cititori;
    }

    public void adauga_cititori(int k) {
        nr_cititori = nr_cititori + k;
    }

    public String toString() {
        return " Biblioteca " + Nume_B + " are ca ID: " + ID_B + " si se afla la adresa: " + Adresa + " si are " + nr_cititori + " si " + carte.toString();
    }

    public static void main(String[] args) {

    }
}
