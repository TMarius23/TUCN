public class Persoana implements Comparable{

    private String nume;
    private String prenume;
    private int age;

    public Persoana(String nume, String prenume, int age) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
    }

    public int compareTo(Object o){
        ///sortam dupa nume alfabetic, ascendent

        Persoana pers = (Persoana)o;
        //return nume.compareTo(pers.nume);
        return age - pers.age;
    }

    public String toString(){
        return nume + " " + prenume + " " + age;
    }
}
