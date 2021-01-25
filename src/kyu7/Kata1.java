// Get the Middle Character
// https://www.codewars.com/kata/56747fd5cb988479af000028/java

/*
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd,
return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:
Kata.getMiddle("test") should return "es"
Kata.getMiddle("testing") should return "t"
Kata.getMiddle("middle") should return "dd"
Kata.getMiddle("A") should return "A"
#Input

A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to
 an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to
 worry about your solution timing out.
#Output
The middle character(s) of the word represented as a string.
 */

package kyu7;

public class Kata1 {
    public static String getMiddle(String word) {
        int mid = word.length() / 2;
        return (word.length() % 2 != 0) ? word.substring(mid, mid + 1) : word.substring(mid - 1, mid + 1);
    }
}

class Kata2 {
    public static String getMiddle(String word) {
        if (word.length() % 2 != 0) {
            return String.valueOf(word.charAt(word.length() / 2));
        } else {
            return word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2);
        }
    }
}
