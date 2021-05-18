// Triple Trouble
// https://www.codewars.com/kata/5704aea738428f4d30000914

/*
Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example
below!

E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length.
 */

package kyu8;

public class Kata5 {
    // it's better to use StringBuilder
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return result;
    }
}

class Kata5a {
    public static String tripleTrouble(String one, String two, String three) {
        // it's better to use StringBuilder
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result += one.charAt(i);
            result += two.charAt(i);
            result += three.charAt(i);
        }
        return result;
    }
}

class Kata5b {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            sb.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return sb.toString();
    }
}
