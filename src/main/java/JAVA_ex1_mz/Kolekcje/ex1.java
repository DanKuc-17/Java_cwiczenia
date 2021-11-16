package JAVA_ex1_mz.Kolekcje;

public class ex1 {
    public static void printTable(int[] array){
        for (int element:array){
            System.out.print("(" + element + ")");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int[] tenNums = new int[10];
        for (int i = 0; i < tenNums.length; i++) {
            tenNums[i] = i + 1;
        }
        System.out.println("Długosć tablicy: " + tenNums.length);
        printTable(tenNums);
        for (int i = 0; i < tenNums.length; i++) {
            tenNums[i] = (i + 1) * 2;
        }
        printTable(tenNums);
    }
}
