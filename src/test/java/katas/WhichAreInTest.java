package katas;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class WhichAreInTest {

    @Test
    public void inArray() {
        String[] a = new String[]{"arp", "live", "strong"};
        String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = new String[]{"arp", "live", "strong"};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void inArray2() {
        String[] a = new String[]{"bar", "ale", "can"};
        String[] b = new String[]{"lively", "barely", "cannot", "sharp", "armstrong"};
        String[] r = new String[]{"bar", "can"};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void inArray3() {
        String[] a = new String[]{"y", "a", "o"};
        String[] b = new String[]{"yoa"};
        String[] r = new String[]{"a", "o", "y"};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void getKataName() {
        assertEquals("https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java",
                WhichAreIn.getKataName());
    }
}