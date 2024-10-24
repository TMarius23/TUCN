public class Carte {

    private int ID_B;
    private int ID_C;
    private String Name;
    private String Autor;
    private int Nr_pag;

    public Carte(int ID_B, int ID_C,  String name, int nr_pag, String autor) {
        this.ID_B = ID_B;
        Name = name;
        this.ID_C = ID_C;
        Nr_pag = nr_pag;
        Autor = autor;
    }

    public Carte() {
        this.ID_B = 0;
        Name = "Unknown";
        this.ID_C = 0;
        Nr_pag = 0;
        Autor = "Unknown";
    }

    public int getID_B() {
        return ID_B;
    }

    public void setID_B(int ID_B) {
        this.ID_B = ID_B;
    }

    public int getID_C() {
        return ID_C;
    }

    public void setID_C(int ID_C) {
        this.ID_C = ID_C;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNr_pag() {
        return Nr_pag;
    }

    public void setNr_pag(int Nr_pag) {
        this.Nr_pag = Nr_pag;
    }

    public void modifica_id_cu_k(int k) {
        this.ID_C = this.ID_C + k;
    }

    public void modifica_id_bib(int k) {
        this.ID_B = this.ID_B + k;
    }

    public String toString() {
        return "cartea de la biblioteca cu id: " + ID_B + " are id-ul: " + ID_C + " si are numele " + Name + " scrisa de " + Autor +
                " si are " + Nr_pag + " pagini";
    }

    public static void main(String[] args) {

    }

}
