package JAVA_ex1_mz.Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(12);
        nums.add(4);
        System.out.println("Wielkość listy: " + nums.size());
        System.out.println("Pierwszy element listy: " + nums.get(0));
        System.out.println("ostatni element listy: " + nums.get(nums.size()-1));
    }
}
