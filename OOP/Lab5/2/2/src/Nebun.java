public class Nebun {

    private int nebun_i;
    private int nebun_j;
    private int culoare;

    public Nebun(int i, int j, int culoare) {
        this.nebun_i = i;
        this.nebun_j = j;
        this.culoare = culoare;
    }

    public void setnebun(int a, int b,int culoare) {
        this.nebun_i = a;
        this.nebun_j = b;
        this.culoare = culoare;
    }

    public void set_nebun_i(int a) {
        this.nebun_i = a;
    }

    public void set_nebun_j(int b) {
        this.nebun_i = b;
    }

    public void set_nebun_i_j(int a, int b) {
        this.nebun_i = a;
        this.nebun_j = b;
    }

    public int get_nebun_i_j(int a) {
        return nebun_i = a;
    }

    public int get_nebun_j(int b) {
        return nebun_j = b;
    }


    public String toString(){
        String c;
        if(culoare == 0)
            c = "n";
        else
            c = "N";

        return c;
    }

    public static void main(String[] args) {

    }
}
