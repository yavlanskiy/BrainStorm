package codewars;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 21445 Output: 54421
 *
 * Input: 145263 Output: 654321
 *
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] temp = Integer.toString(num).toCharArray();

        for (int i = 0; i < temp.length-1; i++) {
            for (int j = temp.length-1; j>i; j--){
                if (temp[j]> temp[i]) {
                    char temp1 = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp1;
                }
            }
        }
        return Integer.parseInt(String.valueOf(temp));
    }

    public static int sortDesc2(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(15));
    }
}
