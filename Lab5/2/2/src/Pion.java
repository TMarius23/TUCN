public class Pion {

    private int pion_i;
    private int pion_j;
    private int culoare;

    ///0 alb
    ///1 negru

    public Pion(int i, int j, int culoare) {
        this.pion_i = i;
        this.pion_j = j;
        this.culoare = culoare;
    }

    public void setPion(int a, int b, int culoare) {
        this.pion_i = a;
        this.pion_j = b;
        this.culoare = culoare;
    }

    public void set_pion_i(int a) {
        this.pion_i = a;
    }

    public void set_pion_j(int b) {
        this.pion_j = b;
    }

    public void set_pion_i_j(int a, int b) {
        this.pion_i = a;
        this.pion_j = b;
    }

    public int get_pion_i_j(int a) {
        return pion_i = a;
    }

    public int get_pion_j(int b) {
        return pion_j = b;
    }

    public String toString(){
        String c;
        if(culoare == 0)
            c = "p";
        else
            c = "P";

        return c;
    }

    public static void main(String[] args) {


    }
}
