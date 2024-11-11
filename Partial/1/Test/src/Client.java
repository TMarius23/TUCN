import java.util.*;

public class Client {

    private String name;
    private String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Client() {
        this.name = "unknown";
        this.address = "unknown";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nrPreparate = in.nextInt();
        //int nrPreparate = 7;
        System.out.println(nrPreparate);

        Client cTest = new Client("Patronul restaurantului", "Mihaiesti de jos");
        Client c1 = new Client("Ionica", "Plopilor 23");
        Client c2 = new Client("Chinteuan", "Malinilor 17");

        Pizza p1 = new Pizza("Canibale");
        Pizza p2 = new Pizza("Hawai");

        BauturiRacoritoare b1 = new BauturiRacoritoare("Coca-Cola");
        BauturiRacoritoare b2 = new BauturiRacoritoare("Limonada");

        Desert d1 = new Desert("Papanasi");
        Desert d2 = new Desert("Clatite");

        DataBase d = new DataBase(nrPreparate, cTest);
        d.addComanda(p1);
        d.setStatus();
        d.addComanda(p2);
        d.setStatus();
        d.addComanda(b1);
        d.setStatus();
        d.addComanda(b2);
        d.setStatus();
        d.addComanda(d1);
        d.setStatus();
        d.addComanda(d2);
        d.setStatus();


        System.out.println("Preparatele detinute de restaurnat");
        d.printListaPreparate();
        System.out.println("Suma totala a preturilor preparatele detinute de restaurnat");
        System.out.println(d.calcularePret());


        DataBase dt1 = new DataBase(nrPreparate, c1);
        DataBase dt2 = new DataBase(nrPreparate, c2);

        dt1.addComanda(p1);
        dt1.addComanda(b2);
        dt1.setStatus();
        dt1.addComanda(d1);
        dt1.setStatus();
        dt1.addComanda(d2);
        dt1.setStatus();

        System.out.println("Livrari nelivrate");
        dt1.printLivrariNelivrate();
        System.out.println(d.calcularePret());




        in.close();

    }

}
