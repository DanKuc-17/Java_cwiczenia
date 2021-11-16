package JAVA_ex1_mz.Kolekcje;

import java.util.HashMap;
import java.util.Map;

public class eMap {

    public static void eMap(){
        Map<Integer,String> names = new HashMap<>();
        names.put(1, "Natalia");
        names.put(2, "Adam");
        names.put(3, "Damian");
        System.out.println("Rozmiar mapy imion: " + names.size());
        names.put(1, "Paweł");
        for (Map.Entry<Integer,String> content : names.entrySet()) {
            Integer key = content.getKey();
            String value = content.getValue();

            System.out.println(key + " " + value);
        }
    }

    public static void main(String[] args){
        eMap();
    }
}
