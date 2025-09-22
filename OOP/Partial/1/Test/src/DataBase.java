public class DataBase {

    private static int nrComanda = 0;
    private String[] status;
    private RestaurantGrande[] restaurant;
    Client c;
    int ctSpate = -1;
    int ctSpateS = -1;
    static int d = 0;


    public DataBase(int nrComenzi, Client c) {
        restaurant = new RestaurantGrande[nrComenzi];
        nrComanda = 0;
        status = new String[nrComenzi + 1];
        this.c = c;
        d = d + 1;
    }

    public void addComanda(RestaurantGrande r) {
        this.restaurant[nrComanda] = r;
        this.status[nrComanda++] = "In asteptare";
        if(nrComanda >= 2) {
            ctSpate++;
        }
        if(nrComanda >= 3) {
            ctSpateS++;
        }
    }

    public void setStatus() {
        if (d % 2 == 0 && ctSpate >= 0)
            this.status[d] = "In livrare";
        if (d % 2 == 1 && ctSpateS >= 0)
            this.status[d] = "Livrat";
    }

    public String getStatus(int i) {
        return status[i];
    }

    public void printListaPreparate() {
        for (int i = 0; i < nrComanda; i++) {
            System.out.println(restaurant[i] + " ");
        }
        System.out.println();
    }

    public void printLivrariNelivrate() {
        for (int i = 0; i < nrComanda; i++) {
            if (status[i].equals("In asteptare") || status[i].equals("In livrare")) {
                System.out.println(restaurant[i].toString() + " " + restaurant[i].getPrice());
            }
        }
        System.out.println();
    }

    public double calcularePret(){
        double sum = 0;
        for(int i = 0; i < nrComanda; i++) {
            sum = sum + restaurant[i].getPrice();
        }
        return sum;
    }

}
