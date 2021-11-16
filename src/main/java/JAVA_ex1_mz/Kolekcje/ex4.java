package JAVA_ex1_mz.Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
    List<String> names = new ArrayList<>();

    public ex4() {
        ListOfNames();
        System.out.print("\n");
        FromLastToFirst();
    }

    public void ListOfNames() {
        names.add("Piotr");
        names.add("Natalia");
        names.add("Marek");
        names.add("Julita");
        names.add("Bartłomiej");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void FromLastToFirst() {
        for (int i = 1; i <= names.size(); i++) {
            System.out.println(names.get(names.size() - i));
        }
    }

    public static void main(String[] args) {
        new ex4();
    }

}
