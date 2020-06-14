// Highest and Lowest
// https://www.codewars.com/kata/554b4ac871d6813a03000035

/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest
number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */


package kyu7;

import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] strArr = numbers.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);
        int min = intArr[0];
        int max = intArr[intArr.length - 1];
        return max + " " + min;
    }
}
