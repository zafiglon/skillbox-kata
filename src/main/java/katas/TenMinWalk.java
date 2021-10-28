package katas;

public class TenMinWalk {

    private static final String KATA_NAME = "https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java";

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0;
        int y = 0;
        for (char c : walk) {
            if (c == 'n') y++;
            if (c == 's') y--;
            if (c == 'e') x++;
            if (c == 'w') x--;
        }
        return x == 0 && y == 0;
    }

    public static String getKataName() {
        return KATA_NAME;
    }

}
