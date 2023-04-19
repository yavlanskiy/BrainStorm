package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[] {8, 2, 5, 1, 9, 10, 4, 6, 3};
        ArrayList<int[]> ints1 = new ArrayList<>(Collections.singletonList(numbers));

        numbers = Arrays.stream(numbers).sorted().toArray();

    }
}

//numbers = 1,2,3,4,5,6,8,9,10
