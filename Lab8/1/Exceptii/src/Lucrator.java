public class Lucrator {

    private String nume;
    CalendarLucru C1;

    public Lucrator(String name, CalendarLucru C1) {
        this.nume = name;
        this.C1 = C1;
    }

    public void lucreaza(String zi) throws ExceptieZiLucratoare {

        Zi ziuaDeLucru = C1.getZi(zi);
        if (ziuaDeLucru.getLucratoare() == true)
            System.out.println("Lucratorul: " + nume + " lucreaza in ziua de " + ziuaDeLucru.getNume());
        else {
            throw new ExceptieZiLucratoare("Ziua " + zi + " este nelucratoare");
        }
    }

}
