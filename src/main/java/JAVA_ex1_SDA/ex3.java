package JAVA_ex1_SDA;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Podaj pierwzą liczbę");
        int x = num.nextInt();
        System.out.println("Podaj drugą liczbę");
        int y = num.nextInt();
        int result=0;

        for (int i=x; i<=y; i++){
            result += i;
        }
        System.out.println("suma liczb od X do Y wynosi: " + result);
    }
}
