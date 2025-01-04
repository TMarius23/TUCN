import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> masini = new HashMap<>();

        masini.put(5, "Ferrari");
        masini.put(6, "BMW");
        masini.put(7, "Honda");
        masini.put(8, "Audi");
        masini.put(9, "Lamborghini");
        masini.put(10, "Vanuatu");
        System.out.println(masini);

        if (masini.containsKey(5))
            System.out.println(masini.get(5));

        if (masini.get(5).equals(masini.get(5)))
            System.out.println(masini.get(5));

        int i = 0, j = 0;
        while (i < masini.size()) {
            if (masini.get(j + i) == null)
                j++;
            else{
                System.out.println(masini.get(i + j));
                i++;
            }
        }


    }
}