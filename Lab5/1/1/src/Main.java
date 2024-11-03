import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Complex c1 = new Complex(1,  -5);
        System.out.println(c1);
        System.out.println(c1.modul());

        Complex c2 = new Complex(1, 5);

        c1.adunare(c2);
        System.out.println(c1);
        System.out.println(c2);

        c1.inmultire(c2);
        System.out.println(c1);

        c1.inmultire_scalar(7);
        System.out.println(c1);


        Complex[] array = new Complex[2];
        array[0] = c1;
        array[1] = c2;

        ///Complex[] array = new Complex[2] {c1, c2};
        ///Complex[] array = {c1, c2};
        System.out.println("\n");

        ///ne afiseaza adresele de memorie doar daca nu suprascriem toStringul
        ///Daca e suprascris afiseaza implicit valorile de la adresa respectiva de memorie

//        for(Complex v : array){
//            System.out.println(v);
//        }

        Arrays.stream(array).forEach(System.out::println);

        ///nu facem Matrice[][] matr1
        ///pt ca nu vrem sa avem o matrice de matrici

        Matrice matr1 = new Matrice(3,3);
        Matrice matr2 = new Matrice(3,3);

        matr1.af_matr();
        System.out.println("\n");

        matr2.af_matr();
        System.out.println("\n");


        matr1.adunare_matr(matr2);
        matr1.af_matr();
        System.out.println("\n");

        matr1.scadere_matr(matr2);
        matr1.af_matr();
        System.out.println("\n");

        matr1.inmultire_matr(matr2);
        matr1.af_matr();
        System.out.println("\n");

        matr2.inmultire_matr_scalar(7);
        matr2.af_matr();
        System.out.println("\n");



    }
}