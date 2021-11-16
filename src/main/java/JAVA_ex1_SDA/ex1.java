package JAVA_ex1_SDA;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args){
        for (int i=1; i<=5; i++){
            int multiple = i * 5;
            System.out.println("5 x " + i + " = " + multiple);
        }
        System.out.println("Podaj liczbe dla której chceśz uzyskać tabiczkę jak wyżej");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        for (int i=1; i<=5; i++){
            int multiple = i * x;
            System.out.println(x + " x "+ i + " = " + multiple);
        }
    }
}
