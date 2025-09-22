import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FacebookAccount implements Comparable<FacebookAccount> {

    private String nume;
    private int varsta;
    private String locatie;

    ArrayList<FacebookAccount> prieteni = new ArrayList<FacebookAccount>();

    public FacebookAccount(String nume, int varsta, String locatie) {
        this.nume = nume;
        this.varsta = varsta;
        this.locatie = locatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public ArrayList<FacebookAccount> getPrieteni() {
        return prieteni;
    }

    public void setPrieteni(ArrayList<FacebookAccount> prieteni) {
        this.prieteni = prieteni;
    }

    public void add(FacebookAccount p1) {
        prieteni.add(p1);
    }

    @Override
    public boolean equals(Object p1) {
        FacebookAccount p2 = (FacebookAccount) p1;
        return (this.getNume().equals(p2.nume) && this.getLocatie().equals(p2.locatie) && this.getVarsta() == p2.getVarsta());
    }

    public void remove(FacebookAccount p1) {
//        prieteni.remove(p1);
        for (int i = 0; i < prieteni.size(); i++) {
            if (prieteni.get(i).equals(p1)) {
                prieteni.remove(i);
            }
        }
    }

    public void printSameLoc(String locatie) {
        for (int i = 0; i < prieteni.size(); i++) {
            if (prieteni.get(i).getLocatie().equals(locatie))
                System.out.println(prieteni.get(i).getLocatie() + ": " + prieteni.get(i).getNume());
        }
    }

    public int compareTo(FacebookAccount p1) {
        return this.getNume().compareTo(p1.getNume());
    }

    public void printPrieteni() {

        Comparator<FacebookAccount> descrescator = new Comparator<FacebookAccount>() {
            @Override
            public int compare(FacebookAccount o1, FacebookAccount o2) {
                return o2.getNume().compareTo(o1.getNume());
            }
        };

        Comparator<FacebookAccount> crescator = new Comparator<FacebookAccount>() {
            @Override
            public int compare(FacebookAccount o1, FacebookAccount o2) {
                return o1.getNume().compareTo(o2.getNume());
            }
        };

//        Collections.sort(prieteni, descrescator);
        Collections.sort(prieteni, crescator);

        for (int i = 0; i < prieteni.size(); i++) {
            System.out.println(prieteni.get(i).getLocatie() + ": " + prieteni.get(i).getNume());
        }
    }

}
