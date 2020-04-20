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
                        .filter(FindTheParitOutlier::dividesByTwo).findAny().getAsInt();
            }
        }
        return -1;
    }

    private static boolean dividesByTwo(int a){
        return (a%2==0);
    }

    public static int find2(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }



    public static void main(String[] args) {
        System.out.println(find(new int[] {47, 0, 1}));
        System.out.println(0%2==0);
    }
}
