package JAVA_ex1_SDA;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbę więszką od 1");
        int a = liczba.nextInt();
        boolean Prime= false;

        for(int i =2; i<a; i++){
            int result = a%i;
            if (result == 0){
                Prime = true;
                break;
            }
        }
        if (Prime){
            System.out.println("To nie jest liczba pierwsza");
        } else {
            System.out.println("To jest liczba pierwsza");
        }
    }
}
