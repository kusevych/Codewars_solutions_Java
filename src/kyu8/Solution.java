// String repeat
// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

/*
Write a function called repeatStr which repeats the given string string exactly n times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
package kyu8;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
