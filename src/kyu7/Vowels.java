// Vowel Count
// https://www.codewars.com/kata/54ff3102c1bad923760001f3

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 */

package kyu7;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}

class Vowels2 {
    public static int getCount(String str) {
        return str.replaceAll("[^aeiou]","").length();
    }
}
