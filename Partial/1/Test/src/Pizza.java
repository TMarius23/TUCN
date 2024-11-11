public class Pizza extends RestaurantGrande {

    private double pretPizza = 32.5;

    public Pizza(String numePizza) {
        super(numePizza, 32.5);
    }

    public Pizza() {
        super("Margherita", 32.5);
    }

    public String getName() {
        return "Pizza " + numePreparate;
    }

    public double getPrice() {
        return pretPizza;
    }

    public String toString(){
        return "Pizza: " + numePreparate;
    }

}
