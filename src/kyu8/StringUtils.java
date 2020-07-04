// altERnaTIng cAsE <=> ALTerNAtiNG CaSe
// https://www.codewars.com/kata/56efc695740d30f963000557

/*
altERnaTIng cAsE <=> ALTerNAtiNG CaSe
Define String.prototype.toAlternatingCase (or a similar function/method such as
to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for
details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
 */
package kyu8;

public class StringUtils {
    public static String toAlternativeString(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.toUpperCase().charAt(i))
                res += string.toLowerCase().charAt(i);
            else
                res += string.toUpperCase().charAt(i);
        }
        return res;
    }
}

/*
public class StringUtils {
    public static String toAlternativeString(String string) {
        String res = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                res += Character.toLowerCase(c);
            } else {
                res += Character.toUpperCase(c);
            }
        }
        return res;
    }
}
 */