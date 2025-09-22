public class Student implements Cloneable{

    private String nume;
    private String prenume;

    Masina m1;

    public Student(String nume, String prenume, Masina m1) {
        this.nume = nume;
        this.prenume = prenume;
        this.m1 = m1;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Masina getM1() {
        return m1;
    }

    public void setM1(Masina m1) {
        this.m1 = m1;
    }

    public String toString() {
        return "Nume:" + nume + " Prenume:" + prenume + " Masina:" + m1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object clone_deep() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();

        cloned.m1 = new Masina(this.m1.getMarca(), this.m1.getColor());
        return cloned;
    }

}
