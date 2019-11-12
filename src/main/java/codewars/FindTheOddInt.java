package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * Given an array, find the int that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 */
public class FindTheOddInt {
    public static int findIt(int[] a) {
        Map<Integer,Integer> counterMap = new HashMap<>();
        for (int value : a) {
            if (counterMap.containsKey(value)) {
                counterMap.put(value, counterMap.get(value) + 1);
            } else {
                counterMap.put(value, 1);
            }
        }

        for (Map.Entry i : counterMap.entrySet()){
            if(!((int)i.getValue() % 2 == 0)) {
                return (int) i.getKey();
            }
        }

        return 1;
    }

    public static int findIt1(int[] a) {
        return stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() % 2 == 1)
                .mapToInt(e -> e.getKey())
                .findFirst()
                .getAsInt();
    }

    public static int findIt2(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }
}
