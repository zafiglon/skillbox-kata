package katas;

import java.util.stream.Stream;

public class WhichAreIn {

    private static final String KATA_NAME = "https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java";

    public static String[] inArray(String[] array1, String[] array2) {
        return Stream.of(array1)
                .sorted()
                .filter(s1 -> {
                    for (final String s2 : array2) {
                        if (s2.contains(s1)) {
                            return true;
                        }
                    }
                    return false;
                })
                .toArray(String[]::new);
    }

    public static String getKataName() {
        return KATA_NAME;
    }

}
