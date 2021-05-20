// Remove exclamation marks
// https://www.codewars.com/kata/57a0885cbb9944e24c00008e

/*
Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 */

package kyu8;

public class Solution2 {
    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
