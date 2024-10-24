import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autovehicul a = new Autovehicul();
        Sofer nicu = new Sofer();
        Rezervor rezervor = new Rezervor();

        System.out.println(a.toString());

        Autovehicul mercedes = new Autovehicul("Mercedes", Color.BLACK, 200, 285, 6, nicu, rezervor);
        System.out.println(mercedes);
        System.out.println(mercedes.getModel());


        for (int i = 1; i <= 50; i++) {
            mercedes.accelerare(mercedes, i);
            System.out.println(mercedes.getVitezaCurenta());
        }

        for (int i = 1; i <= 50; i++) {
            mercedes.decelerare(mercedes, i);
            System.out.println(mercedes.getVitezaCurenta());
        }

        System.out.println();

        mercedes.setVitezaCurenta(180);
        mercedes.oprire();
        System.out.println("Treapta curenta: " + mercedes.getTreaptaVitezaCurenta());


        for (int i = 1; i <= 20; i++) {
            mercedes.decelerare(mercedes, 8);
            System.out.print(mercedes.getVitezaCurenta() + "km/h");
            mercedes.oprire();
            System.out.println(" treapta curenta: " + mercedes.getTreaptaVitezaCurenta());
        }

        System.out.println();
        System.out.println(nicu);
        System.out.println("-----------------\n\n");

        Sofer ion = new Sofer("ION", 108, "27-09-1908");
        System.out.println(ion);
        System.out.println("-----------------\n\n");


        System.out.println(rezervor);
        System.out.println("-----------------\n\n");

        System.out.println("Nivel curent: " + rezervor.getNivelCurent());
        System.out.println("Capacitate maxima " + rezervor.getCapacitateMaxima());

        rezervor.umplere((byte) 5);
        System.out.println("Nivel curent: " + rezervor.getNivelCurent());

        rezervor.umplere(20);
        System.out.println("Nivel curent: " + rezervor.getNivelCurent());

        ///metoda toString este suprascrisa pt ca ea se afla deja in obiectul String
        ///supraincarcare se refera la o functie in care o data in antet este pus un tip de date iar
        ///in alta functie cu acelasi nume in antet este pus alt tip de data


    }

    ///Tema 4.4 fara extragere la loto. 2 clase + metoda main

}