package JAVA_ex1_mz.Kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ex5 {

    List<String> namesList = new ArrayList<>();

    public ex5(){
        Naming();
        System.out.print("\n");
        ShowList();
    }

    public void Naming(){
        Scanner takeName = new Scanner(System.in);
        System.out.println("Podaj 5 imion: ");
        for (int i=0; i<5; i++){
            namesList.add(takeName.next());
        }
    }
    public void ShowList(){
        Iterator<String> namesListIterator = namesList.iterator();
        while (namesListIterator.hasNext()){
            System.out.println(namesListIterator.next());
        }
    }
    public static void main(String[] args){
        new ex5();
    }
}
