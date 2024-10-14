import java.util.*;

public class Vocala {

    private String cuvant;
    private String voc = "AEIOUaeiou";
    private String specOp = "!@#$%^&*() _?><:{}+-=";

    public Vocala(String cuvant)
    {
        this.cuvant = cuvant;
    }

    public Vocala()
    {
        this.cuvant = "Unknown";
    }

    public void setNumar(String cuvant){
        this.cuvant = cuvant;
    }

    public String getCuvant()
    {
        return this.cuvant;
    }
    public int getNumarVoc()
    {
        String txt = getCuvant();
        int nr = 0;
        for(int i = 0; i < txt.length(); i++)
            for(int j = 0; j < voc.length(); j++)
                if(txt.charAt(i) == voc.charAt(j))
                    nr++;

        return nr;
    }

    public String getVoc()
    {
        return voc;
    }
    public String getspecOp()
    {
        return specOp;
    }

    private int verif_eVoc(char a)
    {
        int ok = 0;
        for(int j = 0; j < voc.length(); j++) {
            if (a == voc.charAt(j)) {
                ok = 1;
            }
        }
        return ok;
    }

    public int getNrCons()
    {
        String txt = getCuvant();

        int nr = 0;
        for(int i = 0; i < txt.length(); i++)
        {
            if(verif_eVoc(txt.charAt(i)) == 0)
            {
                    if((txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z') || (txt.charAt(i) >= 'A' && txt.charAt(i) <= 'Z'))
                    {
                        //System.out.println(txt.charAt(i) + " ");
                        nr++;
                    }

            }
        }
        return nr;
    }

    public int[] indexiiVocC(char c)
    {
        int []poz = new int[getCuvant().length()];
        int k = 0;
        String txt = getCuvant();
        for(int i = 0; i <txt.length(); i++)
            if(txt.charAt(i) == c)
                poz[k++] = i;

        return poz;
    }

    public static void main(String[] args){

        String contineVocala = "Abc def io";

        Vocala vocala = new Vocala(contineVocala);

        System.out.println("Numarul de vocale este: " +  vocala.getNumarVoc());
        System.out.println("Numarul de consoane este: " + vocala.getNrCons());


        Scanner in = new Scanner(System.in);
        System.out.println("Vocala: ");
        char c = in.nextLine().charAt(0);

        int []index = vocala.indexiiVocC(c);

        for(int i = 0; i < index.length; i++)
            System.out.print(index[i] + " ");


    }

}
