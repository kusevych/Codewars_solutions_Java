// Abbreviate a Two Word Name
// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F
 */
package kyu8;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        int spaceInd = name.indexOf(' ');
        return Character.toUpperCase(name.charAt(0)) + "." + Character.toUpperCase(name.charAt(spaceInd + 1));
    }
}
