public class Desert extends RestaurantGrande {

    private double pretDesert = 21.78;


    public Desert(String numeDesert) {
        super(numeDesert, 21.78);
    }

    public Desert() {
        super("Clatite", 21.78);
    }

    public String getName() {
        return "Desert " + numePreparate;
    }

    public double getPrice() {
        return pretDesert;
    }

    public String toString(){
        return "Desert: " + numePreparate;
    }


}
