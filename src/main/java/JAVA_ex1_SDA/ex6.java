package JAVA_ex1_SDA;

public class ex6 {

    public static void printTable(int[] array) {
        for (int element : array) {
            System.out.print("(" + element + ")");
        }
        System.out.println("\n");
    }
    public static void checkMinus(int[] table){
        printTable(table);
        int c = 0;
        for (int i=0; i<table.length; i++){
            if (table[i] < 0){
                c++;
            }
        }
        int[] negNum = new int[c];
        int cnt = 0;
        for (int i=0; i<table.length; i++){
            if (table[i] < 0){
                negNum[cnt] = table[i];
                cnt++;
            }
        }
        System.out.println("Ilość liczb ujemnych: " + c);
        printTable(negNum);
    }
    public static void main(String[] args){
        int[] setNum = {14,-2,4,-30,17};
        checkMinus(setNum);
    }
}
