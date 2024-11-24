public class Main {

    public static void useSudor(Sudor sudor) {
        System.out.println(sudor.getElectrozi());
        System.out.println(sudor.getProiect());
    }

    public static void useElectrician(Electrician electrician) {
        System.out.println(electrician.getFire());
        System.out.println(electrician.getPauza());
    }

    public static void useInginer(Inginer inginer) {
        inginer.getDiploma();
        inginer.getLocMunca();
    }

    public static void useCombinatie(Combinatie combinatie) {
        combinatie.print();
    }

    public static void main(String[] args) {

        Combinatie c1 = new Implementare_toate(103, 22, "Pod", "Electrozi Supertit E6013 2.5x350 mm , 5 kg", "Sudor", "Santier");

        useSudor(c1);
        useElectrician(c1);
        useInginer(c1);
        useCombinatie(c1);

    }
}