package katas;

public class ReverseWords {

    private static final String KATA_NAME = "https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java";

    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        String[] split = original.split(" ");
        String result = "";
        for (int i = 0; i < split.length; i++) {
            String part = split[i];
            if (part.length() > 0) {
                for (int j = part.length() - 1; j >= 0; j--) {
                    result += part.charAt(j);
                }
                if (i != split.length - 1) {
                    result += " ";
                }
            } else {
                result += " ";
            }
        }
        return result;
    }

    public static String getKataName() {
        return KATA_NAME;
    }

}
