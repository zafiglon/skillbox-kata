package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class TenMinWalkTest {

    @Test
    public void inArray() {
        assertTrue("Should return true", TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n',
                's'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w',
                'e', 'w', 'e'}));
        assertFalse("Should return false", TenMinWalk.isValid(new char[]{'w'}));
    }

    @Test
    public void testKataName() {
        assertEquals("https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java",
                TenMinWalk.getKataName());
    }

}