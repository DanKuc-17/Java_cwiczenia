package JAVA_ex1_SDA;

public class ex8 {

    public static void printTable(int[] array) {
        for (int element : array) {
            System.out.print("(" + element + ")");
        }
        System.out.println("\n");
    }

    public static boolean isArithmetic(int[] tab){
        if (tab.length < 2) return false;
        boolean isSeries = true;
        int correctDiff = (tab[tab.length - 1] - tab[0]) / (tab.length - 1);
        for (int i = 1; i < tab.length; i++) {
            int r = tab[i] - tab[i-1];
            if (r != correctDiff) {
                isSeries = false;
                break;
            }
        }
        return isSeries;
    }
        public static void main (String[] args){
            int[] arytTable = {2, 4, 6, 8, 10, 9, 14};
            printTable(arytTable);
            System.out.println(isArithmetic(arytTable));
        }
    }
