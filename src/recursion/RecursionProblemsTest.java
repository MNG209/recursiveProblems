package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * CPSC 39 - Recursive Problems JUnit Testing
 * Name: MNG209
 * Date: November 5, 2026
 *
 * This class tests the five recursive methods in RecursionProblems.
 * Each method has five JUnit tests covering different inputs.
 */

public class RecursionProblemsTest {

    // ========================================
    // Problem 1: count8()
    // ========================================

    @Test
    void testCount8BaseCase() {
        assertEquals(0, RecursionProblems.count8(0));
    }

    @Test
    void testCount8SingleEight() {
        assertEquals(1, RecursionProblems.count8(8));
    }

    @Test
    void testCount8NoEights() {
        assertEquals(0, RecursionProblems.count8(1234));
    }

    @Test
    void testCount8SeparatedEights() {
        assertEquals(2, RecursionProblems.count8(818));
    }

    @Test
    void testCount8ConsecutiveEights() {
        assertEquals(4, RecursionProblems.count8(8818));
    }


    // ========================================
    // Problem 2: countHi()
    // ========================================

    @Test
    void testCountHiEmptyString() {
        assertEquals(0, RecursionProblems.countHi(""));
    }

    @Test
    void testCountHiSingleOccurrence() {
        assertEquals(1, RecursionProblems.countHi("hi"));
    }

    @Test
    void testCountHiNoOccurrences() {
        assertEquals(0, RecursionProblems.countHi("hello"));
    }

    @Test
    void testCountHiTwoOccurrences() {
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
    }

    @Test
    void testCountHiMultipleOccurrences() {
        assertEquals(4, RecursionProblems.countHi("hihihihi"));
    }


    // ========================================
    // Problem 3: countHi2()
    // ========================================

    @Test
    void testCountHi2EmptyString() {
        assertEquals(0, RecursionProblems.countHi2(""));
    }

    @Test
    void testCountHi2SingleOccurrence() {
        assertEquals(1, RecursionProblems.countHi2("hi"));
    }

    @Test
    void testCountHi2ExcludedOccurrence() {
        assertEquals(0, RecursionProblems.countHi2("xhi"));
    }

    @Test
    void testCountHi2MixedOccurrences() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
    }

    @Test
    void testCountHi2MultipleOccurrences() {
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
    }


    // ========================================
    // Problem 4: strCount()
    // ========================================

    @Test
    void testStrCountEmptyString() {
        assertEquals(0, RecursionProblems.strCount("", "cat"));
    }

    @Test
    void testStrCountSingleOccurrence() {
        assertEquals(1, RecursionProblems.strCount("cat", "cat"));
    }

    @Test
    void testStrCountNoOccurrences() {
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
    }

    @Test
    void testStrCountTwoOccurrences() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
    }

    @Test
    void testStrCountNonOverlapping() {
        assertEquals(2, RecursionProblems.strCount("aaaaa", "aa"));
    }


    // ========================================
    // Problem 5: stringClean()
    // ========================================

    @Test
    void testStringCleanEmptyString() {
        assertEquals("", RecursionProblems.stringClean(""));
    }

    @Test
    void testStringCleanSingleCharacter() {
        assertEquals("a", RecursionProblems.stringClean("a"));
    }

    @Test
    void testStringCleanNoDuplicates() {
        assertEquals("abc", RecursionProblems.stringClean("abc"));
    }

    @Test
    void testStringCleanRepeatedCharacters() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
    }

    @Test
    void testStringCleanMixedCharacters() {
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
    }

}