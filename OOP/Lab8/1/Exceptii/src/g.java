public class g {

    private String nume;
    private int ani;

    public g(String nume, int ani) {
        this.nume = nume;
        this.ani = ani;
    }

    public String getNume() throws ExceptieTestFG{
        if(nume.equals("ABD"))
            throw new ExceptieTestFG("Exceptie trimisa G");
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }


}
