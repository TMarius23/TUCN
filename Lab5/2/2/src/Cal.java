public class Cal {

    private int cal_i;
    private int cal_j;
    private int culoare;


    public Cal(int i, int j, int culoare) {
        this.cal_i = i;
        this.cal_j = j;
        this.culoare = culoare;
    }

    public void setcal(int a, int b, int culoare) {
        this.cal_i = a;
        this.cal_j = b;
        this.culoare = culoare;
    }

    public void set_cal_i(int a) {
        this.cal_i = a;
    }

    public void set_cal_j(int b) {
        this.cal_i = b;
    }

    public void set_cal_i_j(int a, int b) {
        this.cal_i = a;
        this.cal_j = b;
    }

    public int get_cal_i_j(int a) {
        return cal_i = a;
    }

    public int get_cal_j(int b) {
        return cal_j = b;
    }


    public String toString(){
        String c;
        if(culoare == 0)
            c = "c";
        else
            c = "C";

        return c;
    }

    public static void main(String[] args) {

    }
}
