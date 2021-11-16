package JAVA_ex1_SDA;

import java.util.Scanner;

public class ex7 {

    public static void printTable(int[] array){
        for (int element:array){
            System.out.print("(" + element + ")");
        }
        System.out.println("\n");
    }

    public static void procAryt (int length, int firstElem, int arytDif){
        int[] arytTable = new int[length];
        arytTable[0] = firstElem;
        for (int i = 1; i < arytTable.length; i++){
            arytTable[i] = arytTable[i-1] + arytDif;
        }
        printTable(arytTable);
    }

    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        System.out.println("Podaj długość ciągu arytmetycznego: ");
        int length = data.nextInt();
        System.out.println("Podaj pierwszy element ciągu: ");
        int firstElem = data.nextInt();
        System.out.println("Podaj różnicę ciągu: ");
        int arytDif = data.nextInt();
        procAryt(length,firstElem,arytDif);
    }
}
