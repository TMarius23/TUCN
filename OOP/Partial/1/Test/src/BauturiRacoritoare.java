public class BauturiRacoritoare extends RestaurantGrande {


    private double pretBautura = 8.23;

    public BauturiRacoritoare(String numeBautura) {
        super(numeBautura, 8.23);
    }

    public BauturiRacoritoare() {
        super("Apa", 8.23);
    }

    public String getName() {
        return "Bauturi Racoritoare " + numePreparate;
    }

    public double getPrice() {
        return pretBautura;
    }

    public String toString(){
        return "Bautura racoritoare: " + numePreparate;
    }

}
