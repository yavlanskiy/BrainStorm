package codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * [1, 3, 4]  =>  2
 * [1, 2, 3]  =>  4
 * [4, 2, 3]  =>  1
 */
public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        return IntStream.rangeClosed(1,numbers.length+1).sum() - Arrays.stream(numbers).sum();
    }
}
