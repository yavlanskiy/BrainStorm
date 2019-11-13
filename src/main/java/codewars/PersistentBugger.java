package codewars;

import java.util.Arrays;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example:
 *
 *  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *                       // and 4 has only one digit
 *
 *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                        // 1*2*6 = 12, and finally 1*2 = 2
 *
 *  persistence(4) == 0 // because 4 is already a one-digit number
 */
public class PersistentBugger {

    public static int persistence(long n) {
        int count = 0;
        int result = (int) n;
        do {
            if (String.valueOf(result).toCharArray().length == 1) return count;
            result = loop(String.valueOf(result).toCharArray());
            count++;
        } while (String.valueOf(result).toCharArray().length > 1);
        return count;
    }

    public static int loop(char[] c) {
        char[] chars = String.valueOf(c).toCharArray();
        int result = Integer.parseInt(String.valueOf(chars[0]));

        for (int i = 1; i < chars.length; i++) {
            result *= Integer.parseInt(String.valueOf(chars[i]));
        }
        return result;
    }

    public static int persistence2(long n) {
        if (n < 10) return 0;

        final long newN = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::valueOf)
                .reduce((acc, next) -> acc * next).getAsLong();

        return persistence2(newN) + 1;
    }
    public static void main(String[] args) {
        System.out.println(persistence2(999));
    }
}
