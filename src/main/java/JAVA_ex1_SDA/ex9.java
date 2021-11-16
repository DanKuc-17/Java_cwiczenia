package JAVA_ex1_SDA;

import java.util.Scanner;

public class ex9 {
    /*public static float myModulo(int number, int mod){
        System.out.println("number: " + number + " mod: " + mod + ":");
        float realNum = (float) number/mod;
        System.out.println("test real: " + realNum);
        return realNum;
    }*/

    public static int myModulo(int number, int mod){
        System.out.println("number: " + number + " mod: " + mod + ":");
        int total = (int) number/mod;
        System.out.println("test total: " + total);
        float realNum = (float) number/mod;
        System.out.println("test real: " + realNum);
        System.out.print("\n");
        return number - (total * mod);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby dla których chcesz sprawdzić resztę z dzielenia");
        int number = scanner.nextInt();
        int mod = scanner.nextInt();
        myModulo(number, mod);
    }
}
