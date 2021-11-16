package JAVA_ex1_SDA;

import java.util.Scanner;

public class ex4 {

    public static void printTable(int[] array){
        for (int element:array){
            System.out.print("(" + element + ")");
        }
        System.out.println("\n");
    }

    public static void switchTable(int[] table) {
            System.out.println("table before: ");
            printTable(table);
            int tmp = table[0];
            int lastIndex = table.length - 1;
            table[0] = table[lastIndex];
            table[lastIndex] = tmp;
            System.out.println("after: ");
            printTable(table);
    }

        public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int [] array = new int[3];
        System.out.println("podaj 3 liczby do tablicy");
        array[0] = num.nextInt();
        array[1] = num.nextInt();
        array[2] = num.nextInt();
        switchTable(array);
    }
}
