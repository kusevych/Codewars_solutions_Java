// Find the position!
// https://www.codewars.com/kata/5808e2006b65bff35500008f

/*
When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"

This kata is meant for beginners. Rank and upvote to bring it out of beta
 */

package kyu8;

public class Kata4 {
    public static String position(char alphabet) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        return  "Position of alphabet: " + (alph.indexOf(alphabet) + 1);
    }
}

class Kata4a {
    public static String position(char alphabet) {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }
}

class Kata4b {
    public static String position(char alphabet) {
        return "Position of alphabet: " + (alphabet - 'a' + 1);
    }
}
