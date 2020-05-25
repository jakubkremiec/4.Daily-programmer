import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main mainClass = new Main();

    @Test
    public void check_if_two_Strings_are_necklace(){

        assertTrue(mainClass.checkIfTwoStringsAreNecklace("nicole", "icolen"));
        assertTrue(mainClass.checkIfTwoStringsAreNecklace("nicole", "lenico"));
        assertFalse(mainClass.checkIfTwoStringsAreNecklace("nicole", "coneli"));
        assertTrue(mainClass.checkIfTwoStringsAreNecklace("aabaaaaabaab", "aabaabaabaaa"));
        assertFalse(mainClass.checkIfTwoStringsAreNecklace("abc", "cba"));
        assertFalse(mainClass.checkIfTwoStringsAreNecklace("xxyyy", "xxxyy"));
        assertFalse(mainClass.checkIfTwoStringsAreNecklace("xyxxz", "xxyxz"));
        assertTrue(mainClass.checkIfTwoStringsAreNecklace("x", "x"));
        assertFalse(mainClass.checkIfTwoStringsAreNecklace("x", "xx"));
        assertFalse(mainClass.checkIfTwoStringsAreNecklace("x", ""));
        assertTrue(mainClass.checkIfTwoStringsAreNecklace("", ""));
    }

    @Test
    public void check_how_many_repeats_of_necklace(){


        assertEquals(1, mainClass.countingIfTwoStringsAreNecklace("abc"));
        assertEquals(3, mainClass.countingIfTwoStringsAreNecklace("abcabcabc"));
        assertEquals(1, mainClass.countingIfTwoStringsAreNecklace("abcabcabcx"));
        assertEquals(6, mainClass.countingIfTwoStringsAreNecklace("aaaaaa"));
        assertEquals(1, mainClass.countingIfTwoStringsAreNecklace("a"));
        assertEquals(1, mainClass.countingIfTwoStringsAreNecklace(""));
        assertEquals(5, mainClass.countingIfTwoStringsAreNecklace("ababababab"));

    }

}