// MakeUpperCase
// https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7

/*
Write a function which converts the input string to uppercase.
 */

package kyu8;

public class Upper {
    public static String MakeUpperCase(String str){
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if ((int)chars[i] >= 97 && (int)chars[i] <= 127) {
                sb.append((char)((int)chars[i] - 32));
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
