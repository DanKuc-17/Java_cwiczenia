package JAVA_ex1_mz.Kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {

    public static void List(){
        List<String> names = new ArrayList<>();
        names.add("Dawid");
        names.add("Natalia");
        names.add("Piotr");
        System.out.println("Wielkość listy przed: " + names.size());
        names.add("Natalia");
        System.out.println("Wielkość listy po: " + names.size());
    }

    public static void Set(){
        Set<String> names = new HashSet<>();
        names.add("Artur");
        names.add("Jagoda");
        names.add("Adam");
        System.out.println("Wielkość zbioru przed: " + names.size());
        names.add("Artur");
        System.out.println("Wielkość zbioru po: " + names.size());
    }

    public static void main(String[] args){
        System.out.println("Lista: ");
        List();
        System.out.print("\n");
        System.out.println("Zbiór: ");
        Set();
    }
}
