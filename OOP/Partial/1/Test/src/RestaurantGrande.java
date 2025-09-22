public abstract class RestaurantGrande {

    String numePreparate;
    double preparatePrice;

    public RestaurantGrande(String numePreparate, double preparatePrice) {
        this.numePreparate = numePreparate;
        this.preparatePrice = preparatePrice;
    }


    public abstract String getName();

    public double getPrice(){
        return preparatePrice;
    }


}
