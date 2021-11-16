package JAVA_ex1_mz.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    List<Double> floatNums = new ArrayList<>();

    public ex3(){
        FloatList();
        Results();
    }

    public void FloatList() {
        System.out.println("Podaj 10 liczb z przecinkiem:");
        Scanner nums = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            floatNums.add(nums.nextDouble());
        }
    }

    public void Results() {
        double sum = floatNums.get(0) + floatNums.get(floatNums.size() - 1);
        System.out.println("Suma pierwszego i ostatniego elementu listy: " + sum);
        double product = floatNums.get(0) * floatNums.get(floatNums.size()-1);
        System.out.println("Iloczyn pierwszego i ostatniego elementu listy: " + product);
        double quotient = floatNums.get(1) / floatNums.get(floatNums.size()-2);
        System.out.println("Iloraz drugiego i przedostatniego elementu listy: " + quotient);
    }

    public static void main(String[] args){
        new ex3();
    }

}
