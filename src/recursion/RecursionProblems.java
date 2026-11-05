package recursion;

/*
 * CPSC 39 - Recursive Problems
 * Name: Mark Gonzales
 * Date: November 5, 2026
 *
 * This class solves five recursion problems without using loops.
 * Each method uses a base case and recursive calls.
 */

public class RecursionProblems {

    // Problem 1: Count occurrences of 8.
    // An 8 immediately preceded by another 8 counts double.
    public static int count8(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        if (n % 10 == 8) {

            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            }

            return 1 + count8(n / 10);
        }

        return count8(n / 10);
    }


    // Problem 2: Count lowercase "hi" in a string.
    public static int countHi(String str) {

        // Base case
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }

        return countHi(str.substring(1));
    }


    // Problem 3: Count "hi" unless immediately preceded by 'x'.
    public static int countHi2(String str) {

        // Base case
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        }

        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));
    }


    // Problem 4: Count non-overlapping occurrences of a substring.
    public static int strCount(String str, String sub) {

        // Base case
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        return strCount(str.substring(1), sub);
    }


    // Problem 5: Remove consecutive duplicate characters.
    public static String stringClean(String str) {

        // Base case
        if (str.length() < 2) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }

        return str.charAt(0) + stringClean(str.substring(1));
    }
}