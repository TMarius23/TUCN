import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Carte carte = new Carte(1, 12, "DUNE", 600, "Frank Herbert");
        Biblioteca biblioteca = new Biblioteca(1, "Goga", "Str. Florilor nr 75", carte, 589);

        System.out.println(biblioteca.toString() + "\n\n");


        carte.modifica_id_bib(1);
        System.out.println(carte);

        carte.modifica_id_cu_k(70);
        System.out.println(carte.getID_C());

        carte.modifica_id_cu_k(-35);
        System.out.println(carte.getID_C());

        biblioteca.adauga_cititori(23);
        System.out.println(biblioteca.getNr_cititori());


    }
}