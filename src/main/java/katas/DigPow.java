package katas;

public class DigPow {

    private static final String KATA_NAME = "https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java";

    public static long digPow(int n, int p) {
        String[] split = String.valueOf(n).split("");
        int sum = 0;
        for (String strNum : split) {
            int a = Integer.parseInt(strNum);
            sum = sum + (int) Math.pow(a, p);
            p++;

        }
        int k = sum / n;
        if (k * n == sum) {
            return k;
        }
        return -1;
    }

    public static String getKataName() {
        return KATA_NAME;
    }

}
