public class Regina {

    private int regina_i;
    private int regina_j;
    private int culoare;

    public Regina(int i, int j, int culoare) {
        this.regina_i = i;
        this.regina_j = j;
        this.culoare = culoare;
    }

    public void setregina(int a, int b, int culoare) {
        this.regina_i = a;
        this.regina_j = b;
        this.culoare = culoare;
    }

    public void set_regina_i(int a) {
        this.regina_i = a;
    }

    public void set_regina_j(int b) {
        this.regina_i = b;
    }

    public void set_regina_i_j(int a, int b) {
        this.regina_i = a;
        this.regina_j = b;
    }

    public int get_regina_i_j(int a) {
        return regina_i = a;
    }

    public int get_regina_j(int b) {
        return regina_j = b;
    }


    public String toString(){
        String c;
        if(culoare == 0)
            c = "q";
        else
            c = "Q";

        return c;
    }

    public static void main(String[] args) {

    }
}
