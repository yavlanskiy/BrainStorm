package codewars;

import java.util.Arrays;

public class FindTheParitOutlier {
    public static int find(int[] integers) {
        int devides = 0;
        int notDevides =0;

        for (int integer : integers) {
            if (dividesByTwo(integer)) {
                devides++;
            } else {
                notDevides++;
            };

            if (devides >= 2) {
                return Arrays.stream(integers)
                        .filter(value -> !dividesByTwo(value)).findAny().getAsInt();
            } else if (notDevides >= 2) {
                return Arrays.stream(integers)
                        .filter(value -> dividesByTwo(value)).findAny().getAsInt();
            }
        }
        return -1;
    }

    private static boolean dividesByTwo(int a){
        return (a%2==0);
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {47, 0, 1}));
        System.out.println(0%2==0);
    }
}
