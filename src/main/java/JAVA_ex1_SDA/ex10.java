package JAVA_ex1_SDA;

public class ex10 {
    public static boolean isModRight(int[] table, int mod){
        for(int num:table){
            int testMod = num % mod;
            int myMod = ex9.myModulo(num, mod);
            if (testMod != myMod){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums = {7, 6, 13, 4, 5};
        int mod = 4;
        System.out.println(isModRight(nums, mod));
    }
}
