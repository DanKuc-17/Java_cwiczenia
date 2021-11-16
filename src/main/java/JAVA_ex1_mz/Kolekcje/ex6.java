package JAVA_ex1_mz.Kolekcje;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ex6 {

    PriorityQueue<Integer> randNums = new PriorityQueue<>();

    public ex6 (){
        numDraws();
        queueList();
    }

    public void numDraws(){
        System.out.println("Podaj ile liczb chcesz wylosować");
        Scanner howMany = new Scanner(System.in);
        int x = howMany.nextInt();
        for (int i=0; i < x; i++){
            randNums.add((int)(Math.random() * (100 -1) + 1));
        }
    }
    public void queueList (){
        System.out.println("Liczby wystepujące kolejno w kolejce:" + randNums);
    }

public static void main(String[] args) {
    new ex6();
    }
}
