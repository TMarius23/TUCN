public class Rege {


    private int rege_i;
    private int rege_j;
    private int culoare;

    public Rege(int i, int j, int culoare) {
        this.rege_i = i;
        this.rege_j = j;
        this.culoare = culoare;
    }

    public void setrege(int a, int b, int culoare) {
        this.rege_i = a;
        this.rege_j = b;
        this.culoare = culoare;
    }

    public void set_rege_i(int a) {
        this.rege_i = a;
    }

    public void set_rege_j(int b) {
        this.rege_i = b;
    }

    public void set_rege_i_j(int a, int b) {
        this.rege_i = a;
        this.rege_j = b;
    }

    public int get_rege_i_j(int a) {
        return rege_i = a;
    }

    public int get_rege_j(int b) {
        return rege_j = b;
    }


    public String toString(){
        String c;
        if(culoare == 0)
            c = "r";
        else
            c = "R";

        return c;
    }
    public static void main(String[] args) {

    }
}
