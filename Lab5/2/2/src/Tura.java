public class Tura {

    private int tura_i;
    private int tura_j;
    private int culoare;


    public Tura(int i, int j, int culoare) {
        this.tura_i = i;
        this.tura_j = j;
        this.culoare = culoare;
    }

    public void settura(int a, int b, int culoare) {
        this.tura_i = a;
        this.tura_j = b;
        this.culoare = culoare;
    }

    public void set_tura_i(int a) {
        this.tura_i = a;
    }

    public void set_tura_j(int b) {
        this.tura_i = b;
    }

    public void set_tura_i_j(int a, int b) {
        this.tura_i = a;
        this.tura_j = b;
    }

    public int get_tura_i_j(int a) {
        return tura_i = a;
    }

    public int get_tura_j(int b) {
        return tura_j = b;
    }


    public String toString(){
        String c;
        if(culoare == 0)
            c = "t";
        else
            c = "T";

        return c;
    }

    public static void main(String[] args) {

    }
}
