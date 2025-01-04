import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> PetHotel = new HashMap<String, Integer>();

        PetHotel.put("Bob", 1);
        PetHotel.put("Rex", 2);
        PetHotel.put("Nix", 5);

        int varsta =  PetHotel.get("Bob");
        System.out.println(varsta);

        varsta = PetHotel.get("Rex");
        System.out.println(varsta);

        varsta = PetHotel.get("Nix");
        System.out.println(varsta);

        for(Map.Entry<String, Integer> caine : PetHotel.entrySet()){
            System.out.println(caine.getKey() + " " + caine.getValue());
        }


        PetHotel.clear();
        for(Map.Entry<String, Integer> caine : PetHotel.entrySet()){
            System.out.println(caine.getKey() + " " + caine.getValue());
        }


    }
}